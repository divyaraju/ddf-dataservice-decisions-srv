package com.lumeris.dataplatform.dataservice.decisions.models;

import java.util.List;

public class PatientRosterDetails {

	List<AdtDetails> adtDetails;
	List<RiskModel> riskModel;

	public List<AdtDetails> getAdtDetails() {
		return adtDetails;
	}

	public void setAdtDetails(List<AdtDetails> adtDetails) {
		this.adtDetails = adtDetails;
	}

	public List<RiskModel> getRiskModel() {
		return riskModel;
	}

	public void setRiskModel(List<RiskModel> riskModel) {
		this.riskModel = riskModel;
	}
}
