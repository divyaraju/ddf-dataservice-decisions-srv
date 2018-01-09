package com.lumeris.dataplatform.dataservice.decisions.controller;

import java.text.ParseException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.lumeris.dataplatform.dataservice.decisions.BO.DecisionsBO;
import com.lumeris.dataplatform.dataservice.decisions.BO.DecisionsBOImpl;
import com.lumeris.dataplatform.dataservice.decisions.models.AdtDetails;
//import com.lumeris.dataplatform.dataservice.decisions.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin
@RequestMapping(value = "/patientRoster")
public class DecisionsController {

	@Autowired
	DecisionsBO decisionsBO;

	private static final Log logger = LogFactory.getLog(DecisionsController.class);

	@ApiOperation(value = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.",
			notes = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.", response = AdtDetails.class)
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Server error"),
			@ApiResponse(code = 200, message = "OK", response = AdtDetails.class) })
	@RequestMapping(value = "patientDetails/_search", method = RequestMethod.GET)
	@ApiImplicitParams({
		@ApiImplicitParam(name = "patientid", value = "Full Name of the patient where patient-name starts with provided value.", required = false, paramType = "query")})
	public List<AdtDetails> getPatientDetailsById(@RequestParam(name = "patientid", required = false) String patient_id) throws Exception {
		List<AdtDetails> patientRoster = Lists.newArrayList();
		if (logger.isDebugEnabled()) {
			logger.debug("_id === : " + patient_id);
		}

		patientRoster = decisionsBO.getPatientDetails(patient_id);

		return patientRoster;
	}

	@ApiOperation(value = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.",
			notes = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.", response = PatientRosterSummary.class)
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Server error"),
			@ApiResponse(code = 200, message = "OK", response = PatientRosterSummary.class) })
    @Secured({"ROLE_READ_PATIENT_SUMMARY","ROLE_ADMIN"})
	@RequestMapping(value = "_search", method = RequestMethod.GET)
	public List<PatientRosterSummary> getPatientRosterSummary() throws Exception {
		List<PatientRosterSummary> patientRosterSummaries = Lists.newArrayList();

		patientRosterSummaries = decisionsBO.findAll();

		return patientRosterSummaries;
	}
}
