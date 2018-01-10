//package com.lumeris.dataplatform.dataservice.decisions.data.models;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "vw_patientroster")
//public class PatientDetails {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//	@OneToMany
//	@JoinColumn(name = "patientid")
//	List<AdtDetails> adtDetails;
////	List<RiskModel> riskModel;
//
//	public List<AdtDetails> getAdtDetails() {
//		return adtDetails;
//	}
//
//	public void setAdtDetails(List<AdtDetails> adtDetails) {
//		this.adtDetails = adtDetails;
//	}
//
////	public List<RiskModel> getRiskModel() {
////		return riskModel;
////	}
////
////	public void setRiskModel(List<RiskModel> riskModel) {
////		this.riskModel = riskModel;
////	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//}
