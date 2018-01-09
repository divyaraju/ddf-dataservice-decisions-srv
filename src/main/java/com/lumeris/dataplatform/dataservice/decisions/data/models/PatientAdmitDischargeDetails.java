package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.util.Date;

public class PatientAdmitDischargeDetails {

	String primaryProviderName;
	String visitNumber;
	Date admitDateTime;
	String facilityName;
	enum patientClassCode {}
	enum admissionTypeCode {}
	String attendingPhysician;
	Date dischargeDateType;
	enum dischargeDispositionCode {}

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

}
