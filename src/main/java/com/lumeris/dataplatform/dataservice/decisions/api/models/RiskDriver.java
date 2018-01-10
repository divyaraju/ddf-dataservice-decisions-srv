package com.lumeris.dataplatform.dataservice.decisions.api.models;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Risk driver.
 */
@ApiModel(description = "Risk driver.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

public class RiskDriver   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("contribution")
  private String contribution = null;

  public RiskDriver id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Driver's identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Driver's identifier")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RiskDriver description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Driver description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Driver description")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RiskDriver value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Driver value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Driver value")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RiskDriver contribution(String contribution) {
    this.contribution = contribution;
    return this;
  }

   /**
   * Driver contribution
   * @return contribution
  **/
  @ApiModelProperty(value = "Driver contribution")


  public String getContribution() {
    return contribution;
  }

  public void setContribution(String contribution) {
    this.contribution = contribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskDriver riskDriver = (RiskDriver) o;
    return Objects.equals(this.id, riskDriver.id) &&
        Objects.equals(this.description, riskDriver.description) &&
        Objects.equals(this.value, riskDriver.value) &&
        Objects.equals(this.contribution, riskDriver.contribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, value, contribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskDriver {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    contribution: ").append(toIndentedString(contribution)).append("\n");
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

