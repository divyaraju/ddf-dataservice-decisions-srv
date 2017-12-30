package com.lumeris.dataplatform.dataservice.decisions.models;

public class ProcedureDetails {
	Code procedureCoding;
	String clnclaspxcat;
	String clnclaspxChapter;
	String procedureLeakage;

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
}
