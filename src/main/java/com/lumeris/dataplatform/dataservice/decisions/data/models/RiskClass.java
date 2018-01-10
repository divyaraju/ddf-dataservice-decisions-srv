package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@IdClass(RiskClassId.class)
@Table(name = "vw_patientclass")
public class RiskClass {

	@Id
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Id
	@Column(name = "sdhvalue")
	String sdhvalue;
	@Column(name = "scoredatetime")
	String scoredatetime;
	@Id
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
	public String getScoredatetime() {
		return scoredatetime;
	}
	public void setScoredatetime(String scoredatetime) {
		this.scoredatetime = scoredatetime;
	}
	public String getRiskclass() {
		return riskclass;
	}
	public void setRiskclass(String riskclass) {
		this.riskclass = riskclass;
	}
}
