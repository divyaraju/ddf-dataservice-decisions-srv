package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_patientdetail")
public class PatientDetails {

	@Column(name = "")
	String firstName;
	String lastName;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
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
