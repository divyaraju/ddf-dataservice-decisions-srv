package com.lumeris.dataplatform.dataservice.decisions.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RiskModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

public class RiskModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("eligibilityId")
  private String eligibilityId = null;

  @JsonProperty("scoreDateTime")
  private DateTime scoreDateTime = null;

  @JsonProperty("riskClasses")
  private List<RiskClass> riskClasses = null;

  public RiskModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Risk model's identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Risk model's identifier")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RiskModel eligibilityId(String eligibilityId) {
    this.eligibilityId = eligibilityId;
    return this;
  }

   /**
   * Eligibility identifier
   * @return eligibilityId
  **/
  @ApiModelProperty(required = true, value = "Eligibility identifier")
  @NotNull


  public String getEligibilityId() {
    return eligibilityId;
  }

  public void setEligibilityId(String eligibilityId) {
    this.eligibilityId = eligibilityId;
  }

  public RiskModel scoreDateTime(DateTime scoreDateTime) {
    this.scoreDateTime = scoreDateTime;
    return this;
  }

   /**
   * Date and time when the score was computed, matching the \"2012-04-23T18:25:43.511Z\" format
   * @return scoreDateTime
  **/
  @ApiModelProperty(example = "\"scoreDateTime\": \"2012-04-23T18:25:43.511Z\"", required = true, value = "Date and time when the score was computed, matching the \"2012-04-23T18:25:43.511Z\" format")
  @NotNull

  @Valid

  public DateTime getScoreDateTime() {
    return scoreDateTime;
  }

  public void setScoreDateTime(DateTime scoreDateTime) {
    this.scoreDateTime = scoreDateTime;
  }

  public RiskModel riskClasses(List<RiskClass> riskClasses) {
    this.riskClasses = riskClasses;
    return this;
  }

  public RiskModel addRiskClassesItem(RiskClass riskClassesItem) {
    if (this.riskClasses == null) {
      this.riskClasses = new ArrayList<RiskClass>();
    }
    this.riskClasses.add(riskClassesItem);
    return this;
  }

   /**
   * Get riskClasses
   * @return riskClasses
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RiskClass> getRiskClasses() {
    return riskClasses;
  }

  public void setRiskClasses(List<RiskClass> riskClasses) {
    this.riskClasses = riskClasses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskModel riskModel = (RiskModel) o;
    return Objects.equals(this.id, riskModel.id) &&
        Objects.equals(this.eligibilityId, riskModel.eligibilityId) &&
        Objects.equals(this.scoreDateTime, riskModel.scoreDateTime) &&
        Objects.equals(this.riskClasses, riskModel.riskClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eligibilityId, scoreDateTime, riskClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eligibilityId: ").append(toIndentedString(eligibilityId)).append("\n");
    sb.append("    scoreDateTime: ").append(toIndentedString(scoreDateTime)).append("\n");
    sb.append("    riskClasses: ").append(toIndentedString(riskClasses)).append("\n");
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

