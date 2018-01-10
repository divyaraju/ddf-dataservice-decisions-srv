package com.lumeris.dataplatform.dataservice.decisions.api.models;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Each item composing the roster: basic information about the patient.
 */
@ApiModel(description = "Each item composing the roster: basic information about the patient.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

public class PatientRosterItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("acoId")
  private String acoId = null;

  @JsonProperty("patientNumber")
  private String patientNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  @JsonInclude(Include.NON_NULL)
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    M("M"),
    
    F("F"),
    
    O("O");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("birthDate")
  private LocalDate birthDate = null;

  @JsonProperty("primaryClinic")
  private String primaryClinic = null;

  @JsonProperty("primaryCareProvider")
  private String primaryCareProvider = null;

  @JsonProperty("adtStatus")
  private String adtStatus = null;

  @JsonProperty("adtDate")
  private LocalDate adtDate = null;

  @JsonProperty("adtFacility")
  private String adtFacility = null;

  @JsonProperty("patientClass")
  private String patientClass = null;

  @JsonProperty("emergencyDeptVisitsPrior6M")
  private String emergencyDeptVisitsPrior6M = null;

  @JsonProperty("inPatientVisitsPrior6M")
  private String inPatientVisitsPrior6M = null;

  @JsonProperty("outPatientVisitsPrior6M")
  private String outPatientVisitsPrior6M = null;

  @JsonProperty("unplannedAdmit")
  private String unplannedAdmit = null;

  /**
   * Gets or Sets readmitRiskValue
   */
  public enum ReadmitRiskValueEnum {
    LOW("LOW"),
    
    MODERATE("MODERATE"),
    
    NONE("NONE"),
    
    HIGH("HIGH");

    private String value;

    ReadmitRiskValueEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReadmitRiskValueEnum fromValue(String text) {
      for (ReadmitRiskValueEnum b : ReadmitRiskValueEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("readmitRiskValue")
  private ReadmitRiskValueEnum readmitRiskValue = null;

  @JsonProperty("commercialInsurancePolicy")
  private String commercialInsurancePolicy = null;

  public PatientRosterItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Patient Identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Patient Identifier")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatientRosterItem acoId(String acoId) {
    this.acoId = acoId;
    return this;
  }

   /**
   * ACO identifier
   * @return acoId
  **/
  @ApiModelProperty(value = "ACO identifier")


  public String getAcoId() {
    return acoId;
  }

  public void setAcoId(String acoId) {
    this.acoId = acoId;
  }

  public PatientRosterItem patientNumber(String patientNumber) {
    this.patientNumber = patientNumber;
    return this;
  }

   /**
   * Get patientNumber
   * @return patientNumber
  **/
  @ApiModelProperty(value = "")


  public String getPatientNumber() {
    return patientNumber;
  }

  public void setPatientNumber(String patientNumber) {
    this.patientNumber = patientNumber;
  }

  public PatientRosterItem firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Patient's first name
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "Patient's first name")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PatientRosterItem middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Patient's middle name
   * @return middleName
  **/
  @ApiModelProperty(value = "Patient's middle name")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PatientRosterItem lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Patient's last name
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Patient's last name")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PatientRosterItem gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")

 @Size(min=1,max=1)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public PatientRosterItem birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Matching the \"2012-04-23T18:25:43.511Z\" format
   * @return birthDate
  **/
  @ApiModelProperty(value = "Matching the \"2012-04-23T18:25:43.511Z\" format")

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public PatientRosterItem primaryClinic(String primaryClinic) {
    this.primaryClinic = primaryClinic;
    return this;
  }

   /**
   * Get primaryClinic
   * @return primaryClinic
  **/
  @ApiModelProperty(value = "")


  public String getPrimaryClinic() {
    return primaryClinic;
  }

  public void setPrimaryClinic(String primaryClinic) {
    this.primaryClinic = primaryClinic;
  }

  public PatientRosterItem primaryCareProvider(String primaryCareProvider) {
    this.primaryCareProvider = primaryCareProvider;
    return this;
  }

   /**
   * Get primaryCareProvider
   * @return primaryCareProvider
  **/
  @ApiModelProperty(value = "")


  public String getPrimaryCareProvider() {
    return primaryCareProvider;
  }

  public void setPrimaryCareProvider(String primaryCareProvider) {
    this.primaryCareProvider = primaryCareProvider;
  }

  public PatientRosterItem adtStatus(String adtStatus) {
    this.adtStatus = adtStatus;
    return this;
  }

   /**
   * Get adtStatus
   * @return adtStatus
  **/
  @ApiModelProperty(value = "")


  public String getAdtStatus() {
    return adtStatus;
  }

  public void setAdtStatus(String adtStatus) {
    this.adtStatus = adtStatus;
  }

  public PatientRosterItem adtDate(LocalDate adtDate) {
    this.adtDate = adtDate;
    return this;
  }

   /**
   * Matching the \"2012-04-23T18:25:43.511Z\" format
   * @return adtDate
  **/
  @ApiModelProperty(value = "Matching the \"2012-04-23T18:25:43.511Z\" format")

  @Valid

  public LocalDate getAdtDate() {
    return adtDate;
  }

  public void setAdtDate(LocalDate adtDate) {
    this.adtDate = adtDate;
  }

  public PatientRosterItem adtFacility(String adtFacility) {
    this.adtFacility = adtFacility;
    return this;
  }

   /**
   * Get adtFacility
   * @return adtFacility
  **/
  @ApiModelProperty(value = "")


  public String getAdtFacility() {
    return adtFacility;
  }

  public void setAdtFacility(String adtFacility) {
    this.adtFacility = adtFacility;
  }

  public PatientRosterItem patientClass(String patientClass) {
    this.patientClass = patientClass;
    return this;
  }

   /**
   * Get patientClass
   * @return patientClass
  **/
  @ApiModelProperty(value = "")


  public String getPatientClass() {
    return patientClass;
  }

  public void setPatientClass(String patientClass) {
    this.patientClass = patientClass;
  }

  public PatientRosterItem emergencyDeptVisitsPrior6M(String emergencyDeptVisitsPrior6M) {
    this.emergencyDeptVisitsPrior6M = emergencyDeptVisitsPrior6M;
    return this;
  }

   /**
   * Get emergencyDeptVisitsPrior6M
   * @return emergencyDeptVisitsPrior6M
  **/
  @ApiModelProperty(value = "")


  public String getEmergencyDeptVisitsPrior6M() {
    return emergencyDeptVisitsPrior6M;
  }

  public void setEmergencyDeptVisitsPrior6M(String emergencyDeptVisitsPrior6M) {
    this.emergencyDeptVisitsPrior6M = emergencyDeptVisitsPrior6M;
  }

  public PatientRosterItem inPatientVisitsPrior6M(String inPatientVisitsPrior6M) {
    this.inPatientVisitsPrior6M = inPatientVisitsPrior6M;
    return this;
  }

   /**
   * Get inPatientVisitsPrior6M
   * @return inPatientVisitsPrior6M
  **/
  @ApiModelProperty(value = "")


  public String getInPatientVisitsPrior6M() {
    return inPatientVisitsPrior6M;
  }

  public void setInPatientVisitsPrior6M(String inPatientVisitsPrior6M) {
    this.inPatientVisitsPrior6M = inPatientVisitsPrior6M;
  }

  public PatientRosterItem outPatientVisitsPrior6M(String outPatientVisitsPrior6M) {
    this.outPatientVisitsPrior6M = outPatientVisitsPrior6M;
    return this;
  }

   /**
   * Get outPatientVisitsPrior6M
   * @return outPatientVisitsPrior6M
  **/
  @ApiModelProperty(value = "")


  public String getOutPatientVisitsPrior6M() {
    return outPatientVisitsPrior6M;
  }

  public void setOutPatientVisitsPrior6M(String outPatientVisitsPrior6M) {
    this.outPatientVisitsPrior6M = outPatientVisitsPrior6M;
  }

  public PatientRosterItem unplannedAdmit(String unplannedAdmit) {
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

  public PatientRosterItem readmitRiskValue(ReadmitRiskValueEnum readmitRiskValue) {
    this.readmitRiskValue = readmitRiskValue;
    return this;
  }

   /**
   * Get readmitRiskValue
   * @return readmitRiskValue
  **/
  @ApiModelProperty(value = "")


  public ReadmitRiskValueEnum getReadmitRiskValue() {
    return readmitRiskValue;
  }

  public void setReadmitRiskValue(ReadmitRiskValueEnum readmitRiskValue) {
    this.readmitRiskValue = readmitRiskValue;
  }

  public PatientRosterItem commercialInsurancePolicy(String commercialInsurancePolicy) {
    this.commercialInsurancePolicy = commercialInsurancePolicy;
    return this;
  }

   /**
   * Get commercialInsurancePolicy
   * @return commercialInsurancePolicy
  **/
  @ApiModelProperty(value = "")


  public String getCommercialInsurancePolicy() {
    return commercialInsurancePolicy;
  }

  public void setCommercialInsurancePolicy(String commercialInsurancePolicy) {
    this.commercialInsurancePolicy = commercialInsurancePolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientRosterItem patientRosterItem = (PatientRosterItem) o;
    return Objects.equals(this.id, patientRosterItem.id) &&
        Objects.equals(this.acoId, patientRosterItem.acoId) &&
        Objects.equals(this.patientNumber, patientRosterItem.patientNumber) &&
        Objects.equals(this.firstName, patientRosterItem.firstName) &&
        Objects.equals(this.middleName, patientRosterItem.middleName) &&
        Objects.equals(this.lastName, patientRosterItem.lastName) &&
        Objects.equals(this.gender, patientRosterItem.gender) &&
        Objects.equals(this.birthDate, patientRosterItem.birthDate) &&
        Objects.equals(this.primaryClinic, patientRosterItem.primaryClinic) &&
        Objects.equals(this.primaryCareProvider, patientRosterItem.primaryCareProvider) &&
        Objects.equals(this.adtStatus, patientRosterItem.adtStatus) &&
        Objects.equals(this.adtDate, patientRosterItem.adtDate) &&
        Objects.equals(this.adtFacility, patientRosterItem.adtFacility) &&
        Objects.equals(this.patientClass, patientRosterItem.patientClass) &&
        Objects.equals(this.emergencyDeptVisitsPrior6M, patientRosterItem.emergencyDeptVisitsPrior6M) &&
        Objects.equals(this.inPatientVisitsPrior6M, patientRosterItem.inPatientVisitsPrior6M) &&
        Objects.equals(this.outPatientVisitsPrior6M, patientRosterItem.outPatientVisitsPrior6M) &&
        Objects.equals(this.unplannedAdmit, patientRosterItem.unplannedAdmit) &&
        Objects.equals(this.readmitRiskValue, patientRosterItem.readmitRiskValue) &&
        Objects.equals(this.commercialInsurancePolicy, patientRosterItem.commercialInsurancePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acoId, patientNumber, firstName, middleName, lastName, gender, birthDate, primaryClinic, primaryCareProvider, adtStatus, adtDate, adtFacility, patientClass, emergencyDeptVisitsPrior6M, inPatientVisitsPrior6M, outPatientVisitsPrior6M, unplannedAdmit, readmitRiskValue, commercialInsurancePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientRosterItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acoId: ").append(toIndentedString(acoId)).append("\n");
    sb.append("    patientNumber: ").append(toIndentedString(patientNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    primaryClinic: ").append(toIndentedString(primaryClinic)).append("\n");
    sb.append("    primaryCareProvider: ").append(toIndentedString(primaryCareProvider)).append("\n");
    sb.append("    adtStatus: ").append(toIndentedString(adtStatus)).append("\n");
    sb.append("    adtDate: ").append(toIndentedString(adtDate)).append("\n");
    sb.append("    adtFacility: ").append(toIndentedString(adtFacility)).append("\n");
    sb.append("    patientClass: ").append(toIndentedString(patientClass)).append("\n");
    sb.append("    emergencyDeptVisitsPrior6M: ").append(toIndentedString(emergencyDeptVisitsPrior6M)).append("\n");
    sb.append("    inPatientVisitsPrior6M: ").append(toIndentedString(inPatientVisitsPrior6M)).append("\n");
    sb.append("    outPatientVisitsPrior6M: ").append(toIndentedString(outPatientVisitsPrior6M)).append("\n");
    sb.append("    unplannedAdmit: ").append(toIndentedString(unplannedAdmit)).append("\n");
    sb.append("    readmitRiskValue: ").append(toIndentedString(readmitRiskValue)).append("\n");
    sb.append("    commercialInsurancePolicy: ").append(toIndentedString(commercialInsurancePolicy)).append("\n");
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

