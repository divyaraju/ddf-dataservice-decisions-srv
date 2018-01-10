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
@IdClass(RiskModelId.class)
@Table(name = "vw_patientmodel")
public class RiskModel {

	@Id
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Id
	@Column(name = "elgidentifier")
	String elgIdentifier;
	@Id
	@Column(name = "clientmodelid")
	String clientModelId;

	public String getMedicareHealthInsCardNumber() {
		return medicareHealthInsCardNumber;
	}

	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}

	public String getElgIdentifier() {
		return elgIdentifier;
	}

	public void setElgIdentifier(String elgIdentifier) {
		this.elgIdentifier = elgIdentifier;
	}

	public String getClientModelId() {
		return clientModelId;
	}

	public void setClientModelId(String clientModelId) {
		this.clientModelId = clientModelId;
	}
}
