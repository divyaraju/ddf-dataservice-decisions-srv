package com.lumeris.dataplatform.dataservice.decisions.BO;

import java.text.ParseException;
import java.util.List;

import com.lumeris.dataplatform.dataservice.decisions.models.PatientRosterSummary;

public interface DecisionsBO {

	public List<PatientRosterSummary> getDecisionsDocumentList(String visits, String risk_score, String sdh_type)
			throws ParseException;
}
