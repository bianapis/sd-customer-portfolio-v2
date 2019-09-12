package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceReportRecord
 */
public class CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceReportRecord   {
  private String customerSegmentAnalysisInstanceReportReference = null;

  private String customerSegmentAnalysisInstanceReportType = null;

  private String customerSegmentAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerSegmentAnalysisInstanceReportReference
  **/

  public String getCustomerSegmentAnalysisInstanceReportReference() {
    return customerSegmentAnalysisInstanceReportReference;
  }

  public void setCustomerSegmentAnalysisInstanceReportReference(String customerSegmentAnalysisInstanceReportReference) {
    this.customerSegmentAnalysisInstanceReportReference = customerSegmentAnalysisInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerSegmentAnalysisInstanceReportType
  **/

  public String getCustomerSegmentAnalysisInstanceReportType() {
    return customerSegmentAnalysisInstanceReportType;
  }

  public void setCustomerSegmentAnalysisInstanceReportType(String customerSegmentAnalysisInstanceReportType) {
    this.customerSegmentAnalysisInstanceReportType = customerSegmentAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerSegmentAnalysisInstanceReportParameters
  **/

  public String getCustomerSegmentAnalysisInstanceReportParameters() {
    return customerSegmentAnalysisInstanceReportParameters;
  }

  public void setCustomerSegmentAnalysisInstanceReportParameters(String customerSegmentAnalysisInstanceReportParameters) {
    this.customerSegmentAnalysisInstanceReportParameters = customerSegmentAnalysisInstanceReportParameters;
  }


}

