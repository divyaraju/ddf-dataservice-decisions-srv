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
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.lumeris.dataplatform.dataservice.decisions.BO.DecisionsBO;
import com.lumeris.dataplatform.dataservice.decisions.BO.DecisionsBOImpl;
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
//
//	@ApiOperation(value = "List the patient roster documents for provided search criteria.", notes = "Produces list of aggregated patient roster documents for the provided search criteria.", response = PatientRosterSummary.class)
//	@ApiResponses(value = { @ApiResponse(code = 500, message = "Server error"),
//			@ApiResponse(code = 200, message = "OK", response = PatientRosterSummary.class) })
//	@Secured({"ROLE_READ_PATIENT_SUMMARY","ROLE_ADMIN"})
//	@RequestMapping(value = "allPatients/_search", method = RequestMethod.GET)
//
//	@ApiImplicitParams({
//		@ApiImplicitParam(name = "client_schema", value = "Client name/schema, in order to return the documents specific to a client", required = false, paramType = "query") })
//	public List<PatientRosterSummary> getPatientRosterSummary(@PathVariable String client_schema) throws ParseException {
//		return decisionsBO.getPatientRosterSummary(client_schema);
//	}
//
//	@ApiOperation(value = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.",
//			notes = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.", response = PatientDetails.class)
//	@ApiResponses(value = { @ApiResponse(code = 500, message = "Server error"),
//			@ApiResponse(code = 200, message = "OK", response = PatientDetails.class) })
//    @Secured({"ROLE_READ_PATIENT_SUMMARY","ROLE_ADMIN"})
//	@RequestMapping(value = "patientDetails/{_client_schema}/{_id}", method = RequestMethod.GET)
//	public PatientDetails getPatientRosterById(@PathVariable String _client_schema, @PathVariable String _id) throws Exception {
//		PatientDetails patientRoster = null;
//		if (logger.isDebugEnabled()) {
//			logger.debug("_id === : " + _id);
//			logger.debug("_client_schema === : " + _client_schema);
//		}
//
//		DecisionsBO decisionsBO = new DecisionsBOImpl();
//		patientRoster = decisionsBO.getPatientRosterById(_client_schema, _id);
//
//		return patientRoster;
//	}

	@ApiOperation(value = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.",
			notes = "Produces Patient Roster document with list of Extracts and Risk Models for the provided client and patient Id.", response = PatientRosterSummary.class)
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Server error"),
			@ApiResponse(code = 200, message = "OK", response = PatientRosterSummary.class) })
    @Secured({"ROLE_READ_PATIENT_SUMMARY","ROLE_ADMIN"})
	@RequestMapping(value = "patientDetails/{firstname}", method = RequestMethod.GET)
	public List<PatientRosterSummary> getPatientRosterById(@PathVariable String firstname) throws Exception {
		List<PatientRosterSummary> patientRosterSummaries = Lists.newArrayList();
		if (logger.isDebugEnabled()) {
			logger.debug("_id === : " + firstname);
		}

		patientRosterSummaries = decisionsBO.findByFirstName(firstname);

		return patientRosterSummaries;
	}
}
