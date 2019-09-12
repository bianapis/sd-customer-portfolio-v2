package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceAnalysis
 */
public class CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceAnalysis   {
  private String customerSegmentAnalysisInstanceAnalysisReference = null;

  private String customerSegmentAnalysisInstanceAnalysisReportType = null;

  private String customerSegmentAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerSegmentAnalysisInstanceAnalysisReference
  **/

  public String getCustomerSegmentAnalysisInstanceAnalysisReference() {
    return customerSegmentAnalysisInstanceAnalysisReference;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysisReference(String customerSegmentAnalysisInstanceAnalysisReference) {
    this.customerSegmentAnalysisInstanceAnalysisReference = customerSegmentAnalysisInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerSegmentAnalysisInstanceAnalysisReportType
  **/

  public String getCustomerSegmentAnalysisInstanceAnalysisReportType() {
    return customerSegmentAnalysisInstanceAnalysisReportType;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysisReportType(String customerSegmentAnalysisInstanceAnalysisReportType) {
    this.customerSegmentAnalysisInstanceAnalysisReportType = customerSegmentAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerSegmentAnalysisInstanceAnalysisParameters
  **/

  public String getCustomerSegmentAnalysisInstanceAnalysisParameters() {
    return customerSegmentAnalysisInstanceAnalysisParameters;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysisParameters(String customerSegmentAnalysisInstanceAnalysisParameters) {
    this.customerSegmentAnalysisInstanceAnalysisParameters = customerSegmentAnalysisInstanceAnalysisParameters;
  }


}

