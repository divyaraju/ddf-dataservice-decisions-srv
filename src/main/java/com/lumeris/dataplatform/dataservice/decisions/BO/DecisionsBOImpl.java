package com.lumeris.dataplatform.dataservice.decisions.BO;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterDetails;
import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

@Service
public class DecisionsBOImpl implements DecisionsBO {

	@Override
	public List<PatientRosterSummary> getPatientRosterSummary(String client_schema)
			throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientRosterDetails getPatientRosterById(String client_schema, String id) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
