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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lumeris.dataplatform.dataservice.decisions.BO.DecisionsBO;
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

	@ApiOperation(value = "List the decision documents for provided search creteria.", notes = "Produces list of decisions documents for provided search creteria.", response = PatientRosterSummary.class)
	@ApiResponses(value = { @ApiResponse(code = 500, message = "Server error"),
			@ApiResponse(code = 200, message = "OK", response = PatientRosterSummary.class) })
	@Secured({"ROLE_READ_PATIENT_SUMMARY","ROLE_ADMIN"})
	@RequestMapping(value = "_search", method = RequestMethod.GET)

	@ApiImplicitParams({
		@ApiImplicitParam(name = "visits", value = "Visits.....", required = false, paramType = "query"),
		@ApiImplicitParam(name = "risk_score", value = "risk score......", required = false, paramType = "query"),
		@ApiImplicitParam(name = "sdh_type", value = "social determinants of health......", required = false, paramType = "query") })

//	public List<Decisions> getDecisionsDocumentList(@RequestParam(name = "visits", required = false) String visits,
//			@RequestParam(name = "risk_score", required = false) String risk_score,
//			@RequestParam(name = "sdh_type", required = false) String sdh_type) throws ParseException {
//
//		return decisionsBO.getDecisionsDocumentList(visits, risk_score, sdh_type);
	public JSONObject getHelloWorld() throws org.json.simple.parser.ParseException {
		String sampleJSON = "{\"resourceType\": \"RiskAssessment\", \"id\": \"F6F059C1F729674666334B914BAD3B537B5EA21806CEE6C6614B68E9B23E8278\", \"meta\": {\"tag\": [{\"code\": \"4604118\", \"display\": \"Global Identifier\"} ] }, \"status\": \"final\", \"code\": {\"coding\": [{\"code\": \"2\", \"display\": \"Lumeris Stratification Algorithms\"} ] }, \"subject\": {\"reference\": \"Patient/A34F5A98953707C49A506245FD109994A88E7D814BD0397286AD5687FE690354\", \"identifier\": {\"system\": \"lumerisODS\"} }, \"method\": {\"coding\": [{\"code\": \"500\", \"display\": \"Lumeris Care Management Algorithm\"} ] } }";

		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(sampleJSON);

		return json;
	}

//	}
	
}
