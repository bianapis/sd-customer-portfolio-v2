package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport
 */
public class CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport   {
  private String customerSegmentAnalysisType = null;

  private String customerSegmentAnalysisReportingDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines a type of performance analysis performed (e.g. scheduled review, specialized analysis, sensitivity assessment/projection) 
   * @return customerSegmentAnalysisType
  **/

  public String getCustomerSegmentAnalysisType() {
    return customerSegmentAnalysisType;
  }

  public void setCustomerSegmentAnalysisType(String customerSegmentAnalysisType) {
    this.customerSegmentAnalysisType = customerSegmentAnalysisType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the performance report was completed 
   * @return customerSegmentAnalysisReportingDate
  **/

  public String getCustomerSegmentAnalysisReportingDate() {
    return customerSegmentAnalysisReportingDate;
  }

  public void setCustomerSegmentAnalysisReportingDate(String customerSegmentAnalysisReportingDate) {
    this.customerSegmentAnalysisReportingDate = customerSegmentAnalysisReportingDate;
  }


}

