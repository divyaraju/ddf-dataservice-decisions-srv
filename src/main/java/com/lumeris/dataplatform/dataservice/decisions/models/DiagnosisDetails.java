package com.lumeris.dataplatform.dataservice.decisions.models;

public class DiagnosisDetails {
	Code diagnosisCoding;
	String clnclasdxcat;
	String clnclasdxChapter;
	String diagnosisLeakage;
	String diagnosisTypeCode;

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

	public String getDiagnosisTypeCode() {
		return diagnosisTypeCode;
	}

	public void setDiagnosisTypeCode(String diagnosisTypeCode) {
		this.diagnosisTypeCode = diagnosisTypeCode;
	}
}
