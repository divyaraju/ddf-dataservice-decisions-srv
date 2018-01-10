package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.io.Serializable;

import javax.persistence.Column;

public class RiskModelId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6297996811604774391L;
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Column(name = "elgidentifier")
	String elgIdentifier;
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
