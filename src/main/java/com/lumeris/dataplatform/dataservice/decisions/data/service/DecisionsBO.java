package com.lumeris.dataplatform.dataservice.decisions.data.service;

import java.text.ParseException;
import java.util.List;

import com.lumeris.dataplatform.dataservice.decisions.data.models.AdtDetails;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;

public interface DecisionsBO {

	public List<AdtDetails> getPatientDetails(String patient_id) throws ParseException;

	public List<PatientRosterSummary> findAll() throws ParseException;
}
