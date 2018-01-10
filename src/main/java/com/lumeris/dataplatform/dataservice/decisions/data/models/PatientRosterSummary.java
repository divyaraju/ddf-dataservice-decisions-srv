package com.lumeris.dataplatform.dataservice.decisions.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "vw_patientroster")
public class PatientRosterSummary {
	@Id
	@Column(name = "identifier", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Column(name = "acoidentifier")
	String acoIdentifier;
	@Column(name = "patientnumber")
	String patientNumber;
	@Column(name = "firstname")
	String firstName;
	@Column(name = "middlename")
	String middlename;
	@Column(name = "lastname")
	String lastName;
	@Column(name = "gender")
	String gender;
	@Column(name = "birthdate")
	String birthDate;
	@Column(name = "age")
	String age;
	@Column(name = "primaryclinic")
	String primaryClinic;
	@Column(name = "primarycareprovider")
	String primaryCareProvider;
	@Column(name = "adtstatus")
	String adtStatus;
	@Column(name = "date")
	String date;
	@Column(name = "facility")
	String adtFacility;
	@Column(name = "patientclass")
	String patientClass;
	@Column(name = "emergencydeptvisitsprior6m")
	String emergencyDeptVisitsPrior6M;
	@Column(name = "inpatientvisitsprior6m")
	String inPatientVisitsPrior6M;
	@Column(name = "outpatientvisitsprior6m")
	String outPatientVisitsPrior6M;
	@Column(name = "unplannedadmit")
	String unplannedAdmit;
	@Column(name = "readmitriskvalue")
	String readmitRiskValue;
	@Column(name = "commercialinsurancepolicy")
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

	public String getadtFacility() {
		return adtFacility;
	}

	public void setadtFacility(String adtFacility) {
		this.adtFacility = adtFacility;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdtStatus() {
		return adtStatus;
	}

	public void setAdtStatus(String adtStatus) {
		this.adtStatus = adtStatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAdtFacility() {
		return adtFacility;
	}

	public void setAdtFacility(String adtFacility) {
		this.adtFacility = adtFacility;
	}

	public String getPatientClass() {
		return patientClass;
	}

	public void setPatientClass(String patientClass) {
		this.patientClass = patientClass;
	}

	public String getReadmitRiskValue() {
		return readmitRiskValue;
	}

	public void setReadmitRiskValue(String readmitRiskValue) {
		this.readmitRiskValue = readmitRiskValue;
	}

	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}
}
