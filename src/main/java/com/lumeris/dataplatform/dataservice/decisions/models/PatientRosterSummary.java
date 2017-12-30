package com.lumeris.dataplatform.dataservice.decisions.models;

public class PatientRosterSummary {
	String medicareHealthInsCardNumber;
	String acoIdentifier;
	String patientNumber;
	Demographics demographics;
	PatientClinicalDetails clinicalDetails;
	LatestAdt latestAdt;
	String commercialInsurancePolicy;

	public String getMedicareHealthInsCardNumber() {
		return medicareHealthInsCardNumber;
	}

	public void setMedicareHealthinsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}

	public String getAcoIdentifier() {
		return acoIdentifier;
	}

	public void setAcoIdentifier(String acoIdentifier) {
		this.acoIdentifier = acoIdentifier;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public Demographics getDemographics() {
		return demographics;
	}

	public void setDemographics(Demographics demographics) {
		this.demographics = demographics;
	}

	public PatientClinicalDetails getClinicalDetails() {
		return clinicalDetails;
	}

	public void setClinicalDetails(PatientClinicalDetails clinicalDetails) {
		this.clinicalDetails = clinicalDetails;
	}

	public LatestAdt getLatestAdt() {
		return latestAdt;
	}

	public void setLatestAdt(LatestAdt latestAdt) {
		this.latestAdt = latestAdt;
	}

	public String getCommercialInsurancePolicy() {
		return commercialInsurancePolicy;
	}

	public void setCommercialInsurancePolicy(String commercialInsurancePolicy) {
		this.commercialInsurancePolicy = commercialInsurancePolicy;
	}
}
