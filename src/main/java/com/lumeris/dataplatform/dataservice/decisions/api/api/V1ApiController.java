package com.lumeris.dataplatform.dataservice.decisions.api.api;

import java.text.ParseException;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientRosterItem;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;
import com.lumeris.dataplatform.dataservice.decisions.data.service.DecisionsBO;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

@RestController
@CrossOrigin
@Controller
public class V1ApiController implements V1Api {

	private static final Log logger = LogFactory.getLog(V1ApiController.class);

	@Autowired
	DecisionsBO decisionsBO;

    public ResponseEntity<PatientDetails> getPatientDetailsByIdUsingGET( @NotNull@ApiParam(value = "Full Name of the patient where patient-name starts with provided value.", required = true) @RequestParam(value = "patientid", required = true) String patientid) {
        // do some magic!
        return new ResponseEntity<PatientDetails>(HttpStatus.OK);
    }

    @GetMapping( produces = { "application/json"})
    public ResponseEntity<List<PatientRosterItem>> getPatientRosterSummaryUsingGET() {
		List<PatientRosterSummary> patientRosterSummaries = Lists.newArrayList();

		if (decisionsBO == null) {
			logger.error("DECISION BO IS NULL");
			return new ResponseEntity<List<PatientRosterItem>>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
		try {
			patientRosterSummaries = decisionsBO.findAll();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<List<PatientRosterItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		List<PatientRosterItem> patientRosterItems = Lists.newArrayList();
		
		for (PatientRosterSummary patientRosterSummary : patientRosterSummaries) {
			System.out.println("FIRSTT NAME" +patientRosterSummary.getFirstName());
			PatientRosterItem patientRosterItem = new PatientRosterItem();
			patientRosterItem.setAcoId(patientRosterSummary.getAcoIdentifier());
			patientRosterItem.setFirstName(patientRosterSummary.getFirstName());
			patientRosterItems.add(patientRosterItem);
			//if (patientRosterItems.size() > 5) break;
		}
		//System.out.println("PatientRosterItems" +patientRosterItems.size());

		ResponseEntity<List<PatientRosterItem>> responseEntity = new ResponseEntity<List<PatientRosterItem>>(patientRosterItems, HttpStatus.OK);
		return responseEntity;
    }

}
