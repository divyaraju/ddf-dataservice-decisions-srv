package com.lumeris.dataplatform.dataservice.decisions.models;

public class AdtDetails {

	String medicareHealthInsCardNumber;
	String elgIdentifier;
	String acoid;
	Demographics demographics;
	PatientAdmitDischargeDetails patientAdmitDischargeDetails;
	DiagnosisDetails diagnosisDetails;
	ProcedureDetails procedureDetails;
	boolean isUnplannedAdmit;

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

	public String getAcoid() {
		return acoid;
	}

	public void setAcoid(String acoid) {
		this.acoid = acoid;
	}

	public Demographics getDemographics() {
		return demographics;
	}

	public void setDemographics(Demographics demographics) {
		this.demographics = demographics;
	}

	public PatientAdmitDischargeDetails getPatientAdmitDischargeDetails() {
		return patientAdmitDischargeDetails;
	}

	public void setPatientAdmitDischargeDetails(PatientAdmitDischargeDetails patientAdmitDischargeDetails) {
		this.patientAdmitDischargeDetails = patientAdmitDischargeDetails;
	}

	public DiagnosisDetails getDiagnosisDetails() {
		return diagnosisDetails;
	}

	public void setDiagnosisDetails(DiagnosisDetails diagnosisDetails) {
		this.diagnosisDetails = diagnosisDetails;
	}

	public ProcedureDetails getProcedureDetails() {
		return procedureDetails;
	}

	public void setProcedureDetails(ProcedureDetails procedureDetails) {
		this.procedureDetails = procedureDetails;
	}

	public boolean isUnplannedAdmit() {
		return isUnplannedAdmit;
	}

	public void setUnplannedAdmit(boolean isUnplannedAdmit) {
		this.isUnplannedAdmit = isUnplannedAdmit;
	}

}
