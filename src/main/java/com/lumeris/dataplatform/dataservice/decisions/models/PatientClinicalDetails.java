package com.lumeris.dataplatform.dataservice.decisions.models;

public class PatientClinicalDetails {

	String primaryClinic;
	String primaryCareProvider;

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
}
