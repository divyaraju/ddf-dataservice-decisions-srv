package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class AdtDetailsId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1535244920151789549L;
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Column(name = "visitnumber")
	String visitNumber;
	public String getMedicareHealthInsCardNumber() {
		return medicareHealthInsCardNumber;
	}
	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}
	public String getVisitNumber() {
		return visitNumber;
	}
	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}
	
}
