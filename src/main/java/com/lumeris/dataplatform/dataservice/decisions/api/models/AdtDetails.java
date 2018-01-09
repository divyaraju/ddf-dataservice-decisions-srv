package com.lumeris.dataplatform.dataservice.decisions.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdtDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

public class AdtDetails   {
  @JsonProperty("acoId")
  private String acoId = null;

  @JsonProperty("admissionTypeCode")
  private String admissionTypeCode = null;

  @JsonProperty("admitDateTime")
  private DateTime admitDateTime = null;

  @JsonProperty("attendingPhysician")
  private String attendingPhysician = null;

  @JsonProperty("clinicalClassificationDiagnosisChapter")
  private String clinicalClassificationDiagnosisChapter = null;

  @JsonProperty("clinicalClassificationDiagnosisCategory")
  private String clinicalClassificationDiagnosisCategory = null;

  @JsonProperty("clinicalClassificationProcedureChapter")
  private String clinicalClassificationProcedureChapter = null;

  @JsonProperty("clinicalClassificationProcedureCategory")
  private String clinicalClassificationProcedureCategory = null;

  @JsonProperty("diagnosisCoding")
  private String diagnosisCoding = null;

  @JsonProperty("diagnosisLeakage")
  private String diagnosisLeakage = null;

  @JsonProperty("diagnosisTypeCode")
  private String diagnosisTypeCode = null;

  @JsonProperty("dischargeDateTime")
  private DateTime dischargeDateTime = null;

  @JsonProperty("dischargeDispositionCode")
  private String dischargeDispositionCode = null;

  @JsonProperty("facilityName")
  private String facilityName = null;

  @JsonProperty("isUnplannedAdmit")
  private String isUnplannedAdmit = null;

  @JsonProperty("lengthOfStay")
  private Integer lengthOfStay = null;

  @JsonProperty("patientClassCode")
  private String patientClassCode = null;

  @JsonProperty("primaryProviderName")
  private String primaryProviderName = null;

  @JsonProperty("procedureCoding")
  private String procedureCoding = null;

  @JsonProperty("procedureLeakage")
  private String procedureLeakage = null;

  @JsonProperty("unplannedAdmit")
  private String unplannedAdmit = null;

  @JsonProperty("visitNumber")
  private String visitNumber = null;

  public AdtDetails acoId(String acoId) {
    this.acoId = acoId;
    return this;
  }

   /**
   * Get acoId
   * @return acoId
  **/
  @ApiModelProperty(value = "")


  public String getAcoId() {
    return acoId;
  }

  public void setAcoId(String acoId) {
    this.acoId = acoId;
  }

  public AdtDetails admissionTypeCode(String admissionTypeCode) {
    this.admissionTypeCode = admissionTypeCode;
    return this;
  }

   /**
   * Get admissionTypeCode
   * @return admissionTypeCode
  **/
  @ApiModelProperty(value = "")


  public String getAdmissionTypeCode() {
    return admissionTypeCode;
  }

  public void setAdmissionTypeCode(String admissionTypeCode) {
    this.admissionTypeCode = admissionTypeCode;
  }

  public AdtDetails admitDateTime(DateTime admitDateTime) {
    this.admitDateTime = admitDateTime;
    return this;
  }

   /**
   * Matching the \"2012-04-23T18:25:43.511Z\" format
   * @return admitDateTime
  **/
  @ApiModelProperty(value = "Matching the \"2012-04-23T18:25:43.511Z\" format")

  @Valid

  public DateTime getAdmitDateTime() {
    return admitDateTime;
  }

  public void setAdmitDateTime(DateTime admitDateTime) {
    this.admitDateTime = admitDateTime;
  }

  public AdtDetails attendingPhysician(String attendingPhysician) {
    this.attendingPhysician = attendingPhysician;
    return this;
  }

   /**
   * Get attendingPhysician
   * @return attendingPhysician
  **/
  @ApiModelProperty(value = "")


  public String getAttendingPhysician() {
    return attendingPhysician;
  }

  public void setAttendingPhysician(String attendingPhysician) {
    this.attendingPhysician = attendingPhysician;
  }

  public AdtDetails clinicalClassificationDiagnosisChapter(String clinicalClassificationDiagnosisChapter) {
    this.clinicalClassificationDiagnosisChapter = clinicalClassificationDiagnosisChapter;
    return this;
  }

   /**
   * Clinical Classification Diagnosis Chapter
   * @return clinicalClassificationDiagnosisChapter
  **/
  @ApiModelProperty(value = "Clinical Classification Diagnosis Chapter")


  public String getClinicalClassificationDiagnosisChapter() {
    return clinicalClassificationDiagnosisChapter;
  }

  public void setClinicalClassificationDiagnosisChapter(String clinicalClassificationDiagnosisChapter) {
    this.clinicalClassificationDiagnosisChapter = clinicalClassificationDiagnosisChapter;
  }

  public AdtDetails clinicalClassificationDiagnosisCategory(String clinicalClassificationDiagnosisCategory) {
    this.clinicalClassificationDiagnosisCategory = clinicalClassificationDiagnosisCategory;
    return this;
  }

   /**
   * Clinical Classification Diagnosis Category
   * @return clinicalClassificationDiagnosisCategory
  **/
  @ApiModelProperty(value = "Clinical Classification Diagnosis Category")


  public String getClinicalClassificationDiagnosisCategory() {
    return clinicalClassificationDiagnosisCategory;
  }

  public void setClinicalClassificationDiagnosisCategory(String clinicalClassificationDiagnosisCategory) {
    this.clinicalClassificationDiagnosisCategory = clinicalClassificationDiagnosisCategory;
  }

  public AdtDetails clinicalClassificationProcedureChapter(String clinicalClassificationProcedureChapter) {
    this.clinicalClassificationProcedureChapter = clinicalClassificationProcedureChapter;
    return this;
  }

   /**
   * Clinical Classification Procedure Chapter
   * @return clinicalClassificationProcedureChapter
  **/
  @ApiModelProperty(value = "Clinical Classification Procedure Chapter")


  public String getClinicalClassificationProcedureChapter() {
    return clinicalClassificationProcedureChapter;
  }

  public void setClinicalClassificationProcedureChapter(String clinicalClassificationProcedureChapter) {
    this.clinicalClassificationProcedureChapter = clinicalClassificationProcedureChapter;
  }

  public AdtDetails clinicalClassificationProcedureCategory(String clinicalClassificationProcedureCategory) {
    this.clinicalClassificationProcedureCategory = clinicalClassificationProcedureCategory;
    return this;
  }

   /**
   * Clinical Classification Procedure Category
   * @return clinicalClassificationProcedureCategory
  **/
  @ApiModelProperty(value = "Clinical Classification Procedure Category")


  public String getClinicalClassificationProcedureCategory() {
    return clinicalClassificationProcedureCategory;
  }

  public void setClinicalClassificationProcedureCategory(String clinicalClassificationProcedureCategory) {
    this.clinicalClassificationProcedureCategory = clinicalClassificationProcedureCategory;
  }

  public AdtDetails diagnosisCoding(String diagnosisCoding) {
    this.diagnosisCoding = diagnosisCoding;
    return this;
  }

   /**
   * Get diagnosisCoding
   * @return diagnosisCoding
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisCoding() {
    return diagnosisCoding;
  }

  public void setDiagnosisCoding(String diagnosisCoding) {
    this.diagnosisCoding = diagnosisCoding;
  }

  public AdtDetails diagnosisLeakage(String diagnosisLeakage) {
    this.diagnosisLeakage = diagnosisLeakage;
    return this;
  }

   /**
   * Get diagnosisLeakage
   * @return diagnosisLeakage
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisLeakage() {
    return diagnosisLeakage;
  }

  public void setDiagnosisLeakage(String diagnosisLeakage) {
    this.diagnosisLeakage = diagnosisLeakage;
  }

  public AdtDetails diagnosisTypeCode(String diagnosisTypeCode) {
    this.diagnosisTypeCode = diagnosisTypeCode;
    return this;
  }

   /**
   * Get diagnosisTypeCode
   * @return diagnosisTypeCode
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisTypeCode() {
    return diagnosisTypeCode;
  }

  public void setDiagnosisTypeCode(String diagnosisTypeCode) {
    this.diagnosisTypeCode = diagnosisTypeCode;
  }

  public AdtDetails dischargeDateTime(DateTime dischargeDateTime) {
    this.dischargeDateTime = dischargeDateTime;
    return this;
  }

   /**
   * Matching the \"2012-04-23T18:25:43.511Z\" format
   * @return dischargeDateTime
  **/
  @ApiModelProperty(example = "\"dischargeDateTime\": \"2012-04-23T18:25:43.511Z\"", value = "Matching the \"2012-04-23T18:25:43.511Z\" format")

  @Valid

  public DateTime getDischargeDateTime() {
    return dischargeDateTime;
  }

  public void setDischargeDateTime(DateTime dischargeDateTime) {
    this.dischargeDateTime = dischargeDateTime;
  }

  public AdtDetails dischargeDispositionCode(String dischargeDispositionCode) {
    this.dischargeDispositionCode = dischargeDispositionCode;
    return this;
  }

   /**
   * Get dischargeDispositionCode
   * @return dischargeDispositionCode
  **/
  @ApiModelProperty(value = "")


  public String getDischargeDispositionCode() {
    return dischargeDispositionCode;
  }

  public void setDischargeDispositionCode(String dischargeDispositionCode) {
    this.dischargeDispositionCode = dischargeDispositionCode;
  }

  public AdtDetails facilityName(String facilityName) {
    this.facilityName = facilityName;
    return this;
  }

   /**
   * Get facilityName
   * @return facilityName
  **/
  @ApiModelProperty(value = "")


  public String getFacilityName() {
    return facilityName;
  }

  public void setFacilityName(String facilityName) {
    this.facilityName = facilityName;
  }

  public AdtDetails isUnplannedAdmit(String isUnplannedAdmit) {
    this.isUnplannedAdmit = isUnplannedAdmit;
    return this;
  }

   /**
   * Get isUnplannedAdmit
   * @return isUnplannedAdmit
  **/
  @ApiModelProperty(value = "")


  public String getIsUnplannedAdmit() {
    return isUnplannedAdmit;
  }

  public void setIsUnplannedAdmit(String isUnplannedAdmit) {
    this.isUnplannedAdmit = isUnplannedAdmit;
  }

  public AdtDetails lengthOfStay(Integer lengthOfStay) {
    this.lengthOfStay = lengthOfStay;
    return this;
  }

   /**
   * Length of stay in days
   * @return lengthOfStay
  **/
  @ApiModelProperty(value = "Length of stay in days")


  public Integer getLengthOfStay() {
    return lengthOfStay;
  }

  public void setLengthOfStay(Integer lengthOfStay) {
    this.lengthOfStay = lengthOfStay;
  }

  public AdtDetails patientClassCode(String patientClassCode) {
    this.patientClassCode = patientClassCode;
    return this;
  }

   /**
   * Get patientClassCode
   * @return patientClassCode
  **/
  @ApiModelProperty(value = "")


  public String getPatientClassCode() {
    return patientClassCode;
  }

  public void setPatientClassCode(String patientClassCode) {
    this.patientClassCode = patientClassCode;
  }

  public AdtDetails primaryProviderName(String primaryProviderName) {
    this.primaryProviderName = primaryProviderName;
    return this;
  }

   /**
   * Get primaryProviderName
   * @return primaryProviderName
  **/
  @ApiModelProperty(value = "")


  public String getPrimaryProviderName() {
    return primaryProviderName;
  }

  public void setPrimaryProviderName(String primaryProviderName) {
    this.primaryProviderName = primaryProviderName;
  }

  public AdtDetails procedureCoding(String procedureCoding) {
    this.procedureCoding = procedureCoding;
    return this;
  }

   /**
   * Get procedureCoding
   * @return procedureCoding
  **/
  @ApiModelProperty(value = "")


  public String getProcedureCoding() {
    return procedureCoding;
  }

  public void setProcedureCoding(String procedureCoding) {
    this.procedureCoding = procedureCoding;
  }

  public AdtDetails procedureLeakage(String procedureLeakage) {
    this.procedureLeakage = procedureLeakage;
    return this;
  }

   /**
   * Get procedureLeakage
   * @return procedureLeakage
  **/
  @ApiModelProperty(value = "")


  public String getProcedureLeakage() {
    return procedureLeakage;
  }

  public void setProcedureLeakage(String procedureLeakage) {
    this.procedureLeakage = procedureLeakage;
  }

  public AdtDetails unplannedAdmit(String unplannedAdmit) {
    this.unplannedAdmit = unplannedAdmit;
    return this;
  }

   /**
   * Get unplannedAdmit
   * @return unplannedAdmit
  **/
  @ApiModelProperty(value = "")


  public String getUnplannedAdmit() {
    return unplannedAdmit;
  }

  public void setUnplannedAdmit(String unplannedAdmit) {
    this.unplannedAdmit = unplannedAdmit;
  }

  public AdtDetails visitNumber(String visitNumber) {
    this.visitNumber = visitNumber;
    return this;
  }

   /**
   * Get visitNumber
   * @return visitNumber
  **/
  @ApiModelProperty(value = "")


  public String getVisitNumber() {
    return visitNumber;
  }

  public void setVisitNumber(String visitNumber) {
    this.visitNumber = visitNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdtDetails adtDetails = (AdtDetails) o;
    return Objects.equals(this.acoId, adtDetails.acoId) &&
        Objects.equals(this.admissionTypeCode, adtDetails.admissionTypeCode) &&
        Objects.equals(this.admitDateTime, adtDetails.admitDateTime) &&
        Objects.equals(this.attendingPhysician, adtDetails.attendingPhysician) &&
        Objects.equals(this.clinicalClassificationDiagnosisChapter, adtDetails.clinicalClassificationDiagnosisChapter) &&
        Objects.equals(this.clinicalClassificationDiagnosisCategory, adtDetails.clinicalClassificationDiagnosisCategory) &&
        Objects.equals(this.clinicalClassificationProcedureChapter, adtDetails.clinicalClassificationProcedureChapter) &&
        Objects.equals(this.clinicalClassificationProcedureCategory, adtDetails.clinicalClassificationProcedureCategory) &&
        Objects.equals(this.diagnosisCoding, adtDetails.diagnosisCoding) &&
        Objects.equals(this.diagnosisLeakage, adtDetails.diagnosisLeakage) &&
        Objects.equals(this.diagnosisTypeCode, adtDetails.diagnosisTypeCode) &&
        Objects.equals(this.dischargeDateTime, adtDetails.dischargeDateTime) &&
        Objects.equals(this.dischargeDispositionCode, adtDetails.dischargeDispositionCode) &&
        Objects.equals(this.facilityName, adtDetails.facilityName) &&
        Objects.equals(this.isUnplannedAdmit, adtDetails.isUnplannedAdmit) &&
        Objects.equals(this.lengthOfStay, adtDetails.lengthOfStay) &&
        Objects.equals(this.patientClassCode, adtDetails.patientClassCode) &&
        Objects.equals(this.primaryProviderName, adtDetails.primaryProviderName) &&
        Objects.equals(this.procedureCoding, adtDetails.procedureCoding) &&
        Objects.equals(this.procedureLeakage, adtDetails.procedureLeakage) &&
        Objects.equals(this.unplannedAdmit, adtDetails.unplannedAdmit) &&
        Objects.equals(this.visitNumber, adtDetails.visitNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acoId, admissionTypeCode, admitDateTime, attendingPhysician, clinicalClassificationDiagnosisChapter, clinicalClassificationDiagnosisCategory, clinicalClassificationProcedureChapter, clinicalClassificationProcedureCategory, diagnosisCoding, diagnosisLeakage, diagnosisTypeCode, dischargeDateTime, dischargeDispositionCode, facilityName, isUnplannedAdmit, lengthOfStay, patientClassCode, primaryProviderName, procedureCoding, procedureLeakage, unplannedAdmit, visitNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdtDetails {\n");
    
    sb.append("    acoId: ").append(toIndentedString(acoId)).append("\n");
    sb.append("    admissionTypeCode: ").append(toIndentedString(admissionTypeCode)).append("\n");
    sb.append("    admitDateTime: ").append(toIndentedString(admitDateTime)).append("\n");
    sb.append("    attendingPhysician: ").append(toIndentedString(attendingPhysician)).append("\n");
    sb.append("    clinicalClassificationDiagnosisChapter: ").append(toIndentedString(clinicalClassificationDiagnosisChapter)).append("\n");
    sb.append("    clinicalClassificationDiagnosisCategory: ").append(toIndentedString(clinicalClassificationDiagnosisCategory)).append("\n");
    sb.append("    clinicalClassificationProcedureChapter: ").append(toIndentedString(clinicalClassificationProcedureChapter)).append("\n");
    sb.append("    clinicalClassificationProcedureCategory: ").append(toIndentedString(clinicalClassificationProcedureCategory)).append("\n");
    sb.append("    diagnosisCoding: ").append(toIndentedString(diagnosisCoding)).append("\n");
    sb.append("    diagnosisLeakage: ").append(toIndentedString(diagnosisLeakage)).append("\n");
    sb.append("    diagnosisTypeCode: ").append(toIndentedString(diagnosisTypeCode)).append("\n");
    sb.append("    dischargeDateTime: ").append(toIndentedString(dischargeDateTime)).append("\n");
    sb.append("    dischargeDispositionCode: ").append(toIndentedString(dischargeDispositionCode)).append("\n");
    sb.append("    facilityName: ").append(toIndentedString(facilityName)).append("\n");
    sb.append("    isUnplannedAdmit: ").append(toIndentedString(isUnplannedAdmit)).append("\n");
    sb.append("    lengthOfStay: ").append(toIndentedString(lengthOfStay)).append("\n");
    sb.append("    patientClassCode: ").append(toIndentedString(patientClassCode)).append("\n");
    sb.append("    primaryProviderName: ").append(toIndentedString(primaryProviderName)).append("\n");
    sb.append("    procedureCoding: ").append(toIndentedString(procedureCoding)).append("\n");
    sb.append("    procedureLeakage: ").append(toIndentedString(procedureLeakage)).append("\n");
    sb.append("    unplannedAdmit: ").append(toIndentedString(unplannedAdmit)).append("\n");
    sb.append("    visitNumber: ").append(toIndentedString(visitNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

