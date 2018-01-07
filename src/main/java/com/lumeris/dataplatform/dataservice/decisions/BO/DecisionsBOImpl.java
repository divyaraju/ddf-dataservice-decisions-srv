package com.lumeris.dataplatform.dataservice.decisions.BO;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumeris.dataplatform.dataservice.decisions.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;
import com.lumeris.dataplatform.dataservice.decisions.repository.PatientRosterRepository;

@Service
public class DecisionsBOImpl implements DecisionsBO {

	@Autowired
	private PatientRosterRepository patientRosterRepository;

	@Override
	public List<PatientRosterSummary> getPatientRosterSummary(String client_schema)
			throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDetails getPatientRosterById(String client_schema, String id) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatientRosterSummary> findByFirstName(String firstName) throws ParseException {
		// TODO Auto-generated method stub
		return patientRosterRepository.findByFirstName(firstName);
	}

}
