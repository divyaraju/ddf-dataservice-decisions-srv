package com.lumeris.dataplatform.dataservice.decisions.BO;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

@Service
public class DecisionsBOImpl implements DecisionsBO {

	@Override
	public List<PatientRosterSummary> getDecisionsDocumentList(String visits, String risk_score, String sdh_type)
			throws ParseException {
		return null;
	}
}
