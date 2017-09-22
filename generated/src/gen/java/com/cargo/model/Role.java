/*
 * Swagger Cargo
 * CARGO MANAGEMENT SYSTEM.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cargo.model;

import java.util.Objects;
import com.cargo.model.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Role
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-21T23:23:26.788-06:00")
public class Role   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("paymentMethodType")
  private PaymentMethod paymentMethodType = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public Role id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Role roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @JsonProperty("roleName")
  @ApiModelProperty(value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public Role paymentMethodType(PaymentMethod paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @JsonProperty("paymentMethodType")
  @ApiModelProperty(value = "")
  public PaymentMethod getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethod paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public Role createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @JsonProperty("createdDate")
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.roleName, role.roleName) &&
        Objects.equals(this.paymentMethodType, role.paymentMethodType) &&
        Objects.equals(this.createdDate, role.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleName, paymentMethodType, createdDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

