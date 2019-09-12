package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceAnalysis
 */
public class CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceAnalysis   {
  private String customerSegmentAnalysisInstanceAnalysisData = null;

  private String customerSegmentAnalysisInstanceAnalysisReportType = null;

  private Object customerSegmentAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerSegmentAnalysisInstanceAnalysisData
  **/

  public String getCustomerSegmentAnalysisInstanceAnalysisData() {
    return customerSegmentAnalysisInstanceAnalysisData;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysisData(String customerSegmentAnalysisInstanceAnalysisData) {
    this.customerSegmentAnalysisInstanceAnalysisData = customerSegmentAnalysisInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerSegmentAnalysisInstanceAnalysisReport
  **/

  public Object getCustomerSegmentAnalysisInstanceAnalysisReport() {
    return customerSegmentAnalysisInstanceAnalysisReport;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysisReport(Object customerSegmentAnalysisInstanceAnalysisReport) {
    this.customerSegmentAnalysisInstanceAnalysisReport = customerSegmentAnalysisInstanceAnalysisReport;
  }


}

