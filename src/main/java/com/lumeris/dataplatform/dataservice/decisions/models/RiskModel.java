//package com.lumeris.dataplatform.dataservice.decisions.models;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "vw_patientrisk")
//public class RiskModel {
//
//	@Id
//	@Column(name = "identifier", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@NotNull
//	private Integer id;
//	@Column(name = "patient_id")
//	String medicareHealthInsCardNumber;
//	@Column(name = "elgidentifier")
//	String elgIdentifier;
//	@Column(name = "client_model_id")
//	String clientModelId;
//	List<RiskClass> riskClass;
//
//	public String getMedicareHealthInsCardNumber() {
//		return medicareHealthInsCardNumber;
//	}
//
//	public void setMedicareHealthInsCardNumber(String medicareHealthInsCardNumber) {
//		this.medicareHealthInsCardNumber = medicareHealthInsCardNumber;
//	}
//
//	public String getElgIdentifier() {
//		return elgIdentifier;
//	}
//
//	public void setElgIdentifier(String elgIdentifier) {
//		this.elgIdentifier = elgIdentifier;
//	}
//
//	public String getClientModelId() {
//		return clientModelId;
//	}
//
//	public void setClientModelId(String clientModelId) {
//		this.clientModelId = clientModelId;
//	}
//
//	public List<RiskClass> getRiskClass() {
//		return riskClass;
//	}
//
//	public void setRiskClass(List<RiskClass> riskClass) {
//		this.riskClass = riskClass;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//}
