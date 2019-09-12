package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceReportRecord
 */
public class CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceReportRecord   {
  private String customerSegmentAnalysisInstanceReportData = null;

  private String customerSegmentAnalysisInstanceReportType = null;

  private Object customerSegmentAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerSegmentAnalysisInstanceReportData
  **/

  public String getCustomerSegmentAnalysisInstanceReportData() {
    return customerSegmentAnalysisInstanceReportData;
  }

  public void setCustomerSegmentAnalysisInstanceReportData(String customerSegmentAnalysisInstanceReportData) {
    this.customerSegmentAnalysisInstanceReportData = customerSegmentAnalysisInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerSegmentAnalysisInstanceReport
  **/

  public Object getCustomerSegmentAnalysisInstanceReport() {
    return customerSegmentAnalysisInstanceReport;
  }

  public void setCustomerSegmentAnalysisInstanceReport(Object customerSegmentAnalysisInstanceReport) {
    this.customerSegmentAnalysisInstanceReport = customerSegmentAnalysisInstanceReport;
  }


}

