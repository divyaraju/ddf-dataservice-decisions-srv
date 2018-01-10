package com.lumeris.dataplatform.dataservice.decisions.api.api;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.LocalDate;
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
import com.lumeris.dataplatform.dataservice.decisions.bindingservice.CommonUtility;
import com.lumeris.dataplatform.dataservice.decisions.data.models.AdtDetails;
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

	@GetMapping( produces = { "application/json"}, value = "disabled")
   public ResponseEntity<PatientDetails> getPatientDetailsByIdUsingGET( @NotNull@ApiParam(value = "Full Name of the patient where patient-name starts with provided value.", required = true) @RequestParam(value = "patientid", required = true) String patientid) {
		List<AdtDetails> adtDetails = Lists.newArrayList();

		if (decisionsBO == null) {
			logger.error("DECISION BO IS NULL");
			return new ResponseEntity<PatientDetails>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
		try {
			adtDetails = decisionsBO.getAdtDetails(patientid);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<PatientDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails apiPatientDetails = new com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails();
		apiPatientDetails.setAdtDetails(null);

		ResponseEntity<com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails> responseEntityApi = new ResponseEntity<com.lumeris.dataplatform.dataservice.decisions.api.models.PatientDetails>(apiPatientDetails, HttpStatus.OK);
		return null;
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
			PatientRosterItem patientRosterItem = new PatientRosterItem();
			patientRosterItem.setAcoId(patientRosterSummary.getAcoIdentifier());
//			patientRosterItem.setAdtDate(LocalDate.parse(patientRosterSummary.getDate()));
			patientRosterItem.setAdtFacility(patientRosterSummary.getAdtFacility());
			patientRosterItem.setAdtStatus(patientRosterSummary.getAdtStatus());
//			patientRosterItem.setBirthDate(LocalDate.parse(patientRosterSummary.getBirthDate()));
			patientRosterItem.setFirstName(patientRosterSummary.getFirstName());
			patientRosterItem.setMiddleName(patientRosterSummary.getMiddlename());
			patientRosterItem.setLastName(patientRosterSummary.getLastName());
			patientRosterItem.setGender(CommonUtility.getGender(patientRosterSummary.getGender()));
			patientRosterItem.setInPatientVisitsPrior6M(patientRosterSummary.getInPatientVisitsPrior6M());
			patientRosterItem.setOutPatientVisitsPrior6M(patientRosterSummary.getOutPatientVisitsPrior6M());
			patientRosterItem.setEmergencyDeptVisitsPrior6M(patientRosterSummary.getEmergencyDeptVisitsPrior6M());
			patientRosterItem.setCommercialInsurancePolicy(patientRosterSummary.getCommercialInsurancePolicy());
			patientRosterItem.setPatientClass(patientRosterSummary.getPatientClass());
			patientRosterItem.setPatientNumber(patientRosterSummary.getPatientNumber());
			patientRosterItem.setPrimaryCareProvider(patientRosterSummary.getPrimaryCareProvider());
			patientRosterItem.setPrimaryClinic(patientRosterSummary.getPrimaryClinic());
			patientRosterItem.setReadmitRiskValue(CommonUtility.getReadmitRiskValueEnum(patientRosterSummary.getReadmitRiskValue()));
			patientRosterItem.setUnplannedAdmit(patientRosterSummary.getUnplannedAdmit());
			patientRosterItems.add(patientRosterItem);
		}

		ResponseEntity<List<PatientRosterItem>> responseEntity = new ResponseEntity<List<PatientRosterItem>>(patientRosterItems, HttpStatus.OK);
		return responseEntity;
    }

}
