package com.lumeris.dataplatform.dataservice.decisions.data.service;

import java.text.ParseException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumeris.dataplatform.dataservice.decisions.data.models.AdtDetails;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientDetails;
import com.lumeris.dataplatform.dataservice.decisions.data.models.PatientRosterSummary;
import com.lumeris.dataplatform.dataservice.decisions.data.models.RiskModel;
import com.lumeris.dataplatform.dataservice.decisions.data.repository.AdtDetailsRepository;
import com.lumeris.dataplatform.dataservice.decisions.data.repository.PatientDetailsRepository;
import com.lumeris.dataplatform.dataservice.decisions.data.repository.PatientRosterRepository;
import com.lumeris.dataplatform.dataservice.decisions.data.repository.RiskModelRepository;

@Service
public class DecisionsBOImpl implements DecisionsBO {

	@Autowired
	private PatientRosterRepository patientRosterRepository;
	@Autowired
	private AdtDetailsRepository adtDetailsRepository;
	@Autowired
	private RiskModelRepository riskModelRepository;
	@Autowired
	private PatientDetailsRepository patientDetailsRepository;

	@Override
	@Transactional
	public List<PatientRosterSummary> findAll() throws ParseException {
		// TODO Auto-generated method stub
		return patientRosterRepository.findAll();
	}

	@Override
	public List<PatientDetails> getPatientDetails(String patient_id) throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdtDetails> getAdtDetails(String patient_id) throws ParseException {
		// TODO Auto-generated method stub
		return adtDetailsRepository.findBypatientid(patient_id);
	}

	@Override
	public List<RiskModel> getRiskModelDetails(String patient_id) throws ParseException {
		// TODO Auto-generated method stub
		return riskModelRepository.findBypatientid(patient_id);
	}

}
