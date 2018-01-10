package com.lumeris.dataplatform.dataservice.decisions.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * PatientDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

public class PatientDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  /**
   * Patient's gender in 1 character: (M)ale, (F)emale, or (O)ther
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

  @JsonProperty("adtDetails")
  private List<AdtDetails> adtDetails = null;

  @JsonProperty("riskModels")
  private List<RiskModel> riskModels = null;

  public PatientDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Patient id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Patient id")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatientDetails firstName(String firstName) {
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

  public PatientDetails middleName(String middleName) {
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

  public PatientDetails lastName(String lastName) {
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

  public PatientDetails gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Patient's gender in 1 character: (M)ale, (F)emale, or (O)ther
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "Patient's gender in 1 character: (M)ale, (F)emale, or (O)ther")
  @NotNull

 @Size(min=1,max=1)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public PatientDetails birthDate(LocalDate birthDate) {
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

  public PatientDetails adtDetails(List<AdtDetails> adtDetails) {
    this.adtDetails = adtDetails;
    return this;
  }

  public PatientDetails addAdtDetailsItem(AdtDetails adtDetailsItem) {
    if (this.adtDetails == null) {
      this.adtDetails = new ArrayList<AdtDetails>();
    }
    this.adtDetails.add(adtDetailsItem);
    return this;
  }

   /**
   * ADT details for this patient
   * @return adtDetails
  **/
  @ApiModelProperty(value = "ADT details for this patient")

  @Valid

  public List<AdtDetails> getAdtDetails() {
    return adtDetails;
  }

  public void setAdtDetails(List<AdtDetails> adtDetails) {
    this.adtDetails = adtDetails;
  }

  public PatientDetails riskModels(List<RiskModel> riskModels) {
    this.riskModels = riskModels;
    return this;
  }

  public PatientDetails addRiskModelsItem(RiskModel riskModelsItem) {
    if (this.riskModels == null) {
      this.riskModels = new ArrayList<RiskModel>();
    }
    this.riskModels.add(riskModelsItem);
    return this;
  }

   /**
   * Risk models
   * @return riskModels
  **/
  @ApiModelProperty(value = "Risk models")

  @Valid

  public List<RiskModel> getRiskModels() {
    return riskModels;
  }

  public void setRiskModels(List<RiskModel> riskModels) {
    this.riskModels = riskModels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientDetails patientDetails = (PatientDetails) o;
    return Objects.equals(this.id, patientDetails.id) &&
        Objects.equals(this.firstName, patientDetails.firstName) &&
        Objects.equals(this.middleName, patientDetails.middleName) &&
        Objects.equals(this.lastName, patientDetails.lastName) &&
        Objects.equals(this.gender, patientDetails.gender) &&
        Objects.equals(this.birthDate, patientDetails.birthDate) &&
        Objects.equals(this.adtDetails, patientDetails.adtDetails) &&
        Objects.equals(this.riskModels, patientDetails.riskModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, middleName, lastName, gender, birthDate, adtDetails, riskModels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    adtDetails: ").append(toIndentedString(adtDetails)).append("\n");
    sb.append("    riskModels: ").append(toIndentedString(riskModels)).append("\n");
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

