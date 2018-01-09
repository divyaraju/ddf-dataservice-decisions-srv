//package com.lumeris.dataplatform.dataservice.decisions.bindingservice;
//
//import java.text.ParseException;
//import java.util.List;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import com.google.common.collect.Lists;
//import com.lumeris.dataplatform.dataservice.decisions.api.models.PatientRosterItem;
//import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;
//import com.lumeris.dataplatform.dataservice.decisions.data.repository.PatientRosterRepository;
//import com.lumeris.dataplatform.dataservice.decisions.data.service.DecisionsBO;
//
//public class PatientRosterService {
//
//	private static final Log logger = LogFactory.getLog(PatientRosterService.class);
//	@Autowired
//	DecisionsBO decisionsBO;
//
//	public ResponseEntity<List<PatientRosterItem>> get() {
//		List<PatientRosterSummary> patientRosterSummaries = Lists.newArrayList();
//
//		if (decisionsBO == null) {
//			logger.error("DECISION BO IS NULL");
//			return new ResponseEntity<List<PatientRosterItem>>(HttpStatus.INTERNAL_SERVER_ERROR); 
//		}
//		try {
//			patientRosterSummaries = decisionsBO.findAll();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return new ResponseEntity<List<PatientRosterItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		List<PatientRosterItem> patientRosterItems = Lists.newArrayList();
//		
//		for (PatientRosterSummary patientRosterSummary : patientRosterSummaries) {
//			System.out.println("FIRSTT NAME" +patientRosterSummary.getFirstName());
//			PatientRosterItem patientRosterItem = new PatientRosterItem();
//			patientRosterItem.setAcoId(patientRosterSummary.getAcoIdentifier());
//			patientRosterItem.setFirstName(patientRosterSummary.getFirstName());
//			patientRosterItems.add(patientRosterItem);
//		}
//		System.out.println("PatientRosterItems" +patientRosterItems.size());
//
//		ResponseEntity<List<PatientRosterItem>> responseEntity = new ResponseEntity<List<PatientRosterItem>>(patientRosterItems, HttpStatus.OK);
//		return responseEntity;
//	}
//}
