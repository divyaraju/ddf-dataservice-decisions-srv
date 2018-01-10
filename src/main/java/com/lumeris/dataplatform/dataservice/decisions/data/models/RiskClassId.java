package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.io.Serializable;

import javax.persistence.Column;

public class RiskClassId implements Serializable {

	private static final long serialVersionUID = 8026959996882898092L;
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Column(name = "sdhvalue")
	String sdhvalue;
	@Column(name = "riskclass")
	String riskclass;

	public String getMedicareHealthInsCardNumber() {
		return medicareHealthInsCardNumber;
	}
	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}
	public String getSdhvalue() {
		return sdhvalue;
	}
	public void setSdhvalue(String sdhvalue) {
		this.sdhvalue = sdhvalue;
	}
	public String getRiskclass() {
		return riskclass;
	}
	public void setRiskclass(String riskclass) {
		this.riskclass = riskclass;
	}


}
