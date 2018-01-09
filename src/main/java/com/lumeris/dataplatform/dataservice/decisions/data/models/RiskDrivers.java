package com.lumeris.dataplatform.dataservice.decisions.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class RiskDrivers {

	@Column(name = "max_sdh_value")
	String id;
	String description;
	String value;
	String contribution;
	boolean isVisible;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getContribution() {
		return contribution;
	}

	public void setContribution(String contribution) {
		this.contribution = contribution;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

}
