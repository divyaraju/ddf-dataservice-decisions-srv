package com.lumeris.dataplatform.dataservice.decisions.data.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@IdClass(AdtDetailsId.class)
@Table(name = "vw_patientdetail")
public class AdtDetails {

	@Id
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Id
	@Column(name = "visitnumber")
	String visitNumber;
	@Column(name = "acoidentifier")
	String acoIdentifier;
	@Column(name = "firstname")
	String firstName;
	@Column(name = "middlename")
	String middleName;
	@Column(name = "lastname")
	String lastName;
	@Column(name = "gendercode")
	String gender;
	@Column(name = "birthdtm")
	Date birthDate;
	@Column(name = "primaryprovidername")
	String primaryProviderName;
	@Column(name = "admitdatetime")
	Date admitDateTime;
	@Column(name = "facilityname")
	String facilityName;
	@Column(name = "patientclasscode")
	String patientClassCode;
	@Column(name = "admissiontypecode")
	String admissionTypeCode;
	@Column(name = "attendingphysician")
	String attendingPhysician;
	@Column(name = "dischargedatetime")
	Date dischargeDateType;
	@Column(name = "lengthofstay")
	String lengthOfStay;
	@Column(name = "dischargedispositioncode")
	String dischargeDispositionCode;
	@Column(name = "diagnosiscoding")
	String diagnosisCoding;
	@Column(name = "clnclasdxcat")
	String clnclasdxcat;
	@Column(name = "clnclasdxchapter")
	String clnclasdxChapter;
	@Column(name = "diagnosisleakage")
	String diagnosisLeakage;
	@Column(name = "diagnosistypecode")
	String diagnosisTypeCode;
	@Column(name = "procedurecode")
	String procedureCoding;
	@Column(name = "clnclaspxcat")
	String clnclaspxcat;
	@Column(name = "clnclaspxchapter")
	String clnclaspxChapter;
	@Column(name = "procedureleakage")
	String procedureLeakage;
	@Column(name = "isunplannedadmit")
	String unplannedAdmit;

	public String getIsUnplannedAdmit() {
		return unplannedAdmit;
	}

	public void setIsUnplannedAdmit(String unplannedAdmit) {
		this.unplannedAdmit = unplannedAdmit;
	}

	public String getMedicareHealthInsCardNumber() {
		return medicareHealthInsCardNumber;
	}

	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}

	public String getAcoIdentifier() {
		return acoIdentifier;
	}

	public void setAcoIdentifier(String acoIdentifier) {
		this.acoIdentifier = acoIdentifier;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddlename() {
		return middleName;
	}

	public void setMiddlename(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPatientClassCode() {
		return patientClassCode;
	}

	public void setPatientClassCode(String patientClassCode) {
		this.patientClassCode = patientClassCode;
	}

	public String getAdmissionTypeCode() {
		return admissionTypeCode;
	}

	public void setAdmissionTypeCode(String admissionTypeCode) {
		this.admissionTypeCode = admissionTypeCode;
	}

	public String getDischargeDispositionCode() {
		return dischargeDispositionCode;
	}

	public void setDischargeDispositionCode(String dischargeDispositionCode) {
		this.dischargeDispositionCode = dischargeDispositionCode;
	}

	public String getDiagnosisCoding() {
		return diagnosisCoding;
	}

	public void setDiagnosisCoding(String diagnosisCoding) {
		this.diagnosisCoding = diagnosisCoding;
	}

	public String getDiagnosisTypeCode() {
		return diagnosisTypeCode;
	}

	public void setDiagnosisTypeCode(String diagnosisTypeCode) {
		this.diagnosisTypeCode = diagnosisTypeCode;
	}

	public String getProcedureCoding() {
		return procedureCoding;
	}

	public void setProcedureCoding(String procedureCoding) {
		this.procedureCoding = procedureCoding;
	}

	public String getUnplannedAdmit() {
		return unplannedAdmit;
	}

	public void setUnplannedAdmit(String unplannedAdmit) {
		this.unplannedAdmit = unplannedAdmit;
	}
}
