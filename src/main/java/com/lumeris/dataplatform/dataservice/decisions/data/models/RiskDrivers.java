package com.lumeris.dataplatform.dataservice.decisions.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_patientdriver")
public class RiskDrivers {

	@Id
	@Column(name = "identifier")
	String identifier;
	@Column(name = "patientid")
	String medicareHealthInsCardNumber;
	@Column(name = "driverid")
	String driverId;
	@Column(name = "driveriddesc")
	String driverDescription;
	@Column(name = "driveridvalue")
	String driverValue;
	@Column(name = "driveridcontribution")
	String driverContribution;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getMedicareHealthInsCardNumber() {
		return medicareHealthInsCardNumber;
	}

	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getDriverDescription() {
		return driverDescription;
	}

	public void setDriverDescription(String driverDescription) {
		this.driverDescription = driverDescription;
	}

	public String getDriverValue() {
		return driverValue;
	}

	public void setDriverValue(String driverValue) {
		this.driverValue = driverValue;
	}

	public String getDriverContribution() {
		return driverContribution;
	}

	public void setDriverContribution(String driverContribution) {
		this.driverContribution = driverContribution;
	}

}
