package com.lumeris.dataplatform.dataservice.decisions.BO;

import java.text.ParseException;
import java.util.List;

import com.lumeris.dataplatform.dataservice.decisions.models.AdtDetails;
//import com.lumeris.dataplatform.dataservice.decisions.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

public interface DecisionsBO {

	public List<AdtDetails> getPatientDetails(String patient_id) throws ParseException;

	public List<PatientRosterSummary> findAll() throws ParseException;
}
