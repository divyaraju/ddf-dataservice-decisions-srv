package com.lumeris.dataplatform.dataservice.decisions.BO;

import java.text.ParseException;
import java.util.List;

import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterDetails;
import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

public interface DecisionsBO {

	public List<PatientRosterSummary> getPatientRosterSummary(String client_schema)
			throws ParseException;

	public PatientRosterDetails getPatientRosterById(String client_schema, String id) throws ParseException;
}
