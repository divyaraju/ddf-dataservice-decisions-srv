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
import com.lumeris.dataplatform.dataservice.decisions.bindingservice.CommonUtility;
import com.lumeris.dataplatform.dataservice.decisions.data.models.AdtDetails;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;
import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskClass;
import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskDrivers;
import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskModel;
import com.lumeris.dataplatform.dataservice.decisions.data.service.DecisionsBO;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

@RestController
@CrossOrigin
//@Controller
public class V1ApiController implements V1Api {

	private static final Log logger = LogFactory.getLog(V1ApiController.class);

	@Autowired
	DecisionsBO decisionsBO;

	//@GetMapping(produces = { "application/json" })
	public List<PatientRosterItem> getPatientRosterSummaryUsingGET() {
		List<PatientRosterSummary> patientRosterSummaries = Lists.newArrayList();

		if (decisionsBO == null) {
			logger.error("DECISION BO is not defined");
			throw new InternalError();
		}
		try {
			patientRosterSummaries = decisionsBO.findAll();
		} catch (ParseException e) {

			e.printStackTrace();
			throw new InternalError();
		}
		List<PatientRosterItem> patientRosterItems = Lists.newArrayList();

		for (PatientRosterSummary patientRosterSummary : patientRosterSummaries) {
			PatientRosterItem patientRosterItem = new PatientRosterItem();
			patientRosterItem.setAcoId(patientRosterSummary.getAcoIdentifier());
			// patientRosterItem.setAdtDate(LocalDate.parse(patientRosterSummary.getDate()));
			patientRosterItem.setAdtFacility(patientRosterSummary.getAdtFacility());
			patientRosterItem.setAdtStatus(patientRosterSummary.getAdtStatus());
			// patientRosterItem.setBirthDate(LocalDate.parse(patientRosterSummary.getBirthDate()));
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
			patientRosterItem.setReadmitRiskValue(
					CommonUtility.getReadmitRiskValueEnum(patientRosterSummary.getReadmitRiskValue()));
			patientRosterItem.setUnplannedAdmit(patientRosterSummary.getUnplannedAdmit());
			patientRosterItems.add(patientRosterItem);
		}

//		ResponseEntity<List<PatientRosterItem>> responseEntity = new ResponseEntity<List<PatientRosterItem>>(
//				patientRosterItems, HttpStatus.OK);
		return patientRosterItems;
	}

	@Override
	public PatientDetails getPatientDetailsByIdUsingGET(
			@NotNull @ApiParam(value = "Full Name of the patient where patient-name starts with provided value.", required = true) @RequestParam(value = "patientid", required = true) String patientid) {
		PatientDetails patientDetails;
		AdtDetails adtDetails = new AdtDetails();
		List<AdtDetails> detailsList = Lists.newArrayList();
		List<RiskModel> riskModels = Lists.newArrayList();
		List<RiskClass> riskClasses = Lists.newArrayList();
		List<RiskDrivers> riskDrivers = Lists.newArrayList();
		if (decisionsBO == null) {
			logger.error("DECISION BO IS NULL");
			throw new InternalError();
		}
		try {
			detailsList = decisionsBO.getAdtDetails(patientid);
			logger.info("We have " + detailsList.size() + " detail(s).");

			riskModels = decisionsBO.getRiskModelDetails(patientid);
			logger.info("We have " + riskModels.size() + " model(s).");

			riskClasses = decisionsBO.getRiskClassDetails(patientid);
			logger.info("We have " + riskClasses.size() + " model(s).");
			
			riskDrivers = decisionsBO.getRiskDriversDetails(patientid);
			logger.info("We have " + riskDrivers.size() + " model(s).");

		} catch (ParseException e) {
			e.printStackTrace();
			throw new InternalError();
		}
		patientDetails = new PatientDetails();
		// patientDetails.setAdtDetails(adtDetails);
		// patientDetails.setRiskModels(riskModels);
		// patientDetails.getFirstName();

		List<PatientRosterItem> patientRosterItems = Lists.newArrayList();
		return new PatientDetails();
	}

}
