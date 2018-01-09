package com.lumeris.dataplatform.dataservice.decisions.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RiskClass
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-09T19:49:40.625Z")

public class RiskClass   {
  @JsonProperty("sdhValue")
  private BigDecimal sdhValue = null;

  @JsonProperty("classDescription")
  private String classDescription = null;

  @JsonProperty("riskDrivers")
  private List<RiskDriver> riskDrivers = null;

  public RiskClass sdhValue(BigDecimal sdhValue) {
    this.sdhValue = sdhValue;
    return this;
  }

   /**
   * SDH Value
   * @return sdhValue
  **/
  @ApiModelProperty(required = true, value = "SDH Value")
  @NotNull

  @Valid

  public BigDecimal getSdhValue() {
    return sdhValue;
  }

  public void setSdhValue(BigDecimal sdhValue) {
    this.sdhValue = sdhValue;
  }

  public RiskClass classDescription(String classDescription) {
    this.classDescription = classDescription;
    return this;
  }

   /**
   * Description of the risk class
   * @return classDescription
  **/
  @ApiModelProperty(required = true, value = "Description of the risk class")
  @NotNull


  public String getClassDescription() {
    return classDescription;
  }

  public void setClassDescription(String classDescription) {
    this.classDescription = classDescription;
  }

  public RiskClass riskDrivers(List<RiskDriver> riskDrivers) {
    this.riskDrivers = riskDrivers;
    return this;
  }

  public RiskClass addRiskDriversItem(RiskDriver riskDriversItem) {
    if (this.riskDrivers == null) {
      this.riskDrivers = new ArrayList<RiskDriver>();
    }
    this.riskDrivers.add(riskDriversItem);
    return this;
  }

   /**
   * Drivers
   * @return riskDrivers
  **/
  @ApiModelProperty(value = "Drivers")

  @Valid

  public List<RiskDriver> getRiskDrivers() {
    return riskDrivers;
  }

  public void setRiskDrivers(List<RiskDriver> riskDrivers) {
    this.riskDrivers = riskDrivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskClass riskClass = (RiskClass) o;
    return Objects.equals(this.sdhValue, riskClass.sdhValue) &&
        Objects.equals(this.classDescription, riskClass.classDescription) &&
        Objects.equals(this.riskDrivers, riskClass.riskDrivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdhValue, classDescription, riskDrivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskClass {\n");
    
    sb.append("    sdhValue: ").append(toIndentedString(sdhValue)).append("\n");
    sb.append("    classDescription: ").append(toIndentedString(classDescription)).append("\n");
    sb.append("    riskDrivers: ").append(toIndentedString(riskDrivers)).append("\n");
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

