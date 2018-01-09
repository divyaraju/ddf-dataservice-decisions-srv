package com.lumeris.dataplatform.dataservice.decisions.data.service;

import java.text.ParseException;
import java.util.List;

import com.lumeris.dataplatform.dataservice.decisions.data.models.AdtDetails;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;
import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskModel;

public interface DecisionsBO {

	public List<PatientDetails> getPatientDetails(String patient_id) throws ParseException;

	public List<AdtDetails> getAdtDetails(String patient_id) throws ParseException;
	
	public List<RiskModel> getRiskModelDetails(String patient_id) throws ParseException;
	
	public List<PatientRosterSummary> findAll() throws ParseException;
}
