package com.lumeris.dataplatform.dataservice.decisions.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "msj_a2591_production.a2591_elg")
public class PatientRosterSummary {
	@Id
	@Column(name = "APT_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
    private Long id;
	@Column(name = "APT_CODE_ID")
	String medicareHealthInsCardNumber;
	@Column(name = "APT_CODE_ID")
	String acoIdentifier;
	@Column(name = "APT_CODE_ID")
	String patientNumber;
	@Column(name = "APT_CODE_ID")
	String firstName;
	@Column(name = "APT_CODE_ID")
	String middleName;
	@Column(name = "APT_CODE_ID")
	String lastName;
	@Column(name = "APT_CODE_ID")
	String gender;
	@Column(name = "APT_CODE_ID")
	String birthDate;
	@Column(name = "APT_CODE_ID")
	String age;
	@Column(name = "APT_CODE_ID")
	String primaryClinic;
	@Column(name = "APT_CODE_ID")
	String primaryCareProvider;

//	enum adtStatus {
//	}

//	Date date;
	@Column(name = "APT_CODE_ID")
	String facility;

//	enum patientClass {
//	}

	@Column(name = "APT_CODE_ID")
	String emergencyDeptVisitsPrior6M;
	@Column(name = "APT_CODE_ID")
	String inPatientVisitsPrior6M;
	@Column(name = "APT_CODE_ID")
	String outPatientVisitsPrior6M;
	@Column(name = "APT_CODE_ID")
	String unplannedAdmit;
//	enum readmitRiskValue {};
	@Column(name = "APT_CODE_ID")
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middelName) {
		this.middleName = middelName;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getPrimaryClinic() {
		return primaryClinic;
	}

	public void setPrimaryClinic(String primaryClinic) {
		this.primaryClinic = primaryClinic;
	}

	public String getPrimaryCareProvider() {
		return primaryCareProvider;
	}

	public void setPrimaryCareProvider(String primaryCareProvider) {
		this.primaryCareProvider = primaryCareProvider;
	}

	public String getUnplannedAdmit() {
		return unplannedAdmit;
	}

	public void setUnplannedAdmit(String unplannedAdmit) {
		this.unplannedAdmit = unplannedAdmit;
	}

//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getEmergencyDeptVisitsPrior6M() {
		return emergencyDeptVisitsPrior6M;
	}

	public void setEmergencyDeptVisitsPrior6M(String emergencyDeptVisitsPrior6M) {
		this.emergencyDeptVisitsPrior6M = emergencyDeptVisitsPrior6M;
	}

	public String getInPatientVisitsPrior6M() {
		return inPatientVisitsPrior6M;
	}

	public void setInPatientVisitsPrior6M(String inPatientVisitsPrior6M) {
		this.inPatientVisitsPrior6M = inPatientVisitsPrior6M;
	}

	public String getOutPatientVisitsPrior6M() {
		return outPatientVisitsPrior6M;
	}

	public void setOutPatientVisitsPrior6M(String outPatientVisitsPrior6M) {
		this.outPatientVisitsPrior6M = outPatientVisitsPrior6M;
	}

	public String getCommercialInsurancePolicy() {
		return commercialInsurancePolicy;
	}

	public void setCommercialInsurancePolicy(String commercialInsurancePolicy) {
		this.commercialInsurancePolicy = commercialInsurancePolicy;
	}
}
