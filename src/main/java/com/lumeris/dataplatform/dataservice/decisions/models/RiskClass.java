package com.lumeris.dataplatform.dataservice.decisions.models;

import java.util.Date;
import java.util.List;

public class RiskClass {

	String classDescription;
	List<RiskDrivers> riskDrivers;
	double sdh_value;
	Date scoreDateTime;
	boolean isRiskScore;

	public String getClassDescription() {
		return classDescription;
	}

	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	public List<RiskDrivers> getRiskDrivers() {
		return riskDrivers;
	}

	public void setRiskDrivers(List<RiskDrivers> riskDrivers) {
		this.riskDrivers = riskDrivers;
	}

	public double getSdh_value() {
		return sdh_value;
	}

	public void setSdh_value(double sdh_value) {
		this.sdh_value = sdh_value;
	}

	public Date getScoreDateTime() {
		return scoreDateTime;
	}

	public void setScoreDateTime(Date scoreDateTime) {
		this.scoreDateTime = scoreDateTime;
	}

	public boolean isRiskScore() {
		return isRiskScore;
	}

	public void setRiskScore(boolean isRiskScore) {
		this.isRiskScore = isRiskScore;
	}

}
