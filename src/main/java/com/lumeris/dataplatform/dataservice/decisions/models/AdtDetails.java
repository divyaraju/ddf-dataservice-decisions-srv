package com.lumeris.dataplatform.dataservice.decisions.models;

import java.util.Date;

public class AdtDetails {

	String medicareHealthInsCardNumber;
	String elgIdentifier;
	String acoid;
	String demographicsReference;
	String primaryProviderName;
	String visitNumber;
	Date admitDateTime;
	String facilityName;
	enum patientClassCode {}
	enum admissionTypeCode {}
	String attendingPhysician;
	Date dischargeDateType;
	String lengthOfStay;
	enum dischargeDispositionCode {}
	Code diagnosisCoding;
	String clnclasdxcat;
	String clnclasdxChapter;
	String diagnosisLeakage;
	enum diagnosisTypeCode {}
	Code procedureCoding;
	String clnclaspxcat;
	String clnclaspxChapter;
	String procedureLeakage;
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

	public String getDemographicsReference() {
		return demographicsReference;
	}

	public void setDemographicsReference(String demographicsReference) {
		this.demographicsReference = demographicsReference;
	}

	public String getPrimaryProviderName() {
		return primaryProviderName;
	}

	public void setPrimaryProviderName(String primaryProviderName) {
		this.primaryProviderName = primaryProviderName;
	}

	public String getVisitNumber() {
		return visitNumber;
	}

	public void setVisitNumber(String visitNumber) {
		this.visitNumber = visitNumber;
	}

	public Date getAdmitDateTime() {
		return admitDateTime;
	}

	public void setAdmitDateTime(Date admitDateTime) {
		this.admitDateTime = admitDateTime;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getAttendingPhysician() {
		return attendingPhysician;
	}

	public void setAttendingPhysician(String attendingPhysician) {
		this.attendingPhysician = attendingPhysician;
	}

	public Date getDischargeDateType() {
		return dischargeDateType;
	}

	public void setDischargeDateType(Date dischargeDateType) {
		this.dischargeDateType = dischargeDateType;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Code getDiagnosisCoding() {
		return diagnosisCoding;
	}

	public void setDiagnosisCoding(Code diagnosisCoding) {
		this.diagnosisCoding = diagnosisCoding;
	}

	public String getClnclasdxcat() {
		return clnclasdxcat;
	}

	public void setClnclasdxcat(String clnclasdxcat) {
		this.clnclasdxcat = clnclasdxcat;
	}

	public String getClnclasdxChapter() {
		return clnclasdxChapter;
	}

	public void setClnclasdxChapter(String clnclasdxChapter) {
		this.clnclasdxChapter = clnclasdxChapter;
	}

	public String getDiagnosisLeakage() {
		return diagnosisLeakage;
	}

	public void setDiagnosisLeakage(String diagnosisLeakage) {
		this.diagnosisLeakage = diagnosisLeakage;
	}

	public Code getProcedureCoding() {
		return procedureCoding;
	}

	public void setProcedureCoding(Code procedureCoding) {
		this.procedureCoding = procedureCoding;
	}

	public String getClnclaspxcat() {
		return clnclaspxcat;
	}

	public void setClnclaspxcat(String clnclaspxcat) {
		this.clnclaspxcat = clnclaspxcat;
	}

	public String getClnclaspxChapter() {
		return clnclaspxChapter;
	}

	public void setClnclaspxChapter(String clnclaspxChapter) {
		this.clnclaspxChapter = clnclaspxChapter;
	}

	public String getProcedureLeakage() {
		return procedureLeakage;
	}

	public void setProcedureLeakage(String procedureLeakage) {
		this.procedureLeakage = procedureLeakage;
	}

	public boolean isUnplannedAdmit() {
		return isUnplannedAdmit;
	}

	public void setUnplannedAdmit(boolean isUnplannedAdmit) {
		this.isUnplannedAdmit = isUnplannedAdmit;
	}

}
