package com.lumeris.dataplatform.dataservice.decisions.models;

import java.util.Date;

public class LatestAdt {

	enum adtStatus {
	}

	Date date;
	String facility;
	enum patientClass {}
	String emergencyDeptVisitsPrior6M;
	String inPatientVisitsPrior6M;
	String outPatientVisitsPrior6M;
	String unplannedAdmit;
	String commercialInsurancePolicy;

	public String getUnplannedAdmit() {
		return unplannedAdmit;
	}

	public void setUnplannedAdmit(String unplannedAdmit) {
		this.unplannedAdmit = unplannedAdmit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getCommercialInsurancePolicy() {
		return commercialInsurancePolicy;
	}

	public void setCommercialInsurancePolicy(String commercialInsurancePolicy) {
		this.commercialInsurancePolicy = commercialInsurancePolicy;
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
}
