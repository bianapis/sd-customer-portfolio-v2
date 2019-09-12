package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceAnalysis;
import org.bian.dto.CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRetrieveInputModel
 */
public class CRCustomerSegmentAnalysisRetrieveInputModel   {
  private Object customerSegmentAnalysisRetrieveActionTaskRecord = null;

  private String customerSegmentAnalysisRetrieveActionRequest = null;

  private CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceReportRecord customerSegmentAnalysisInstanceReportRecord = null;

  private CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceAnalysis customerSegmentAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerSegmentAnalysisRetrieveActionTaskRecord
  **/

  public Object getCustomerSegmentAnalysisRetrieveActionTaskRecord() {
    return customerSegmentAnalysisRetrieveActionTaskRecord;
  }

  public void setCustomerSegmentAnalysisRetrieveActionTaskRecord(Object customerSegmentAnalysisRetrieveActionTaskRecord) {
    this.customerSegmentAnalysisRetrieveActionTaskRecord = customerSegmentAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerSegmentAnalysisRetrieveActionRequest
  **/

  public String getCustomerSegmentAnalysisRetrieveActionRequest() {
    return customerSegmentAnalysisRetrieveActionRequest;
  }

  public void setCustomerSegmentAnalysisRetrieveActionRequest(String customerSegmentAnalysisRetrieveActionRequest) {
    this.customerSegmentAnalysisRetrieveActionRequest = customerSegmentAnalysisRetrieveActionRequest;
  }


  /**
   * Get customerSegmentAnalysisInstanceReportRecord
   * @return customerSegmentAnalysisInstanceReportRecord
  **/

  public CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceReportRecord getCustomerSegmentAnalysisInstanceReportRecord() {
    return customerSegmentAnalysisInstanceReportRecord;
  }

  public void setCustomerSegmentAnalysisInstanceReportRecord(CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceReportRecord customerSegmentAnalysisInstanceReportRecord) {
    this.customerSegmentAnalysisInstanceReportRecord = customerSegmentAnalysisInstanceReportRecord;
  }


  /**
   * Get customerSegmentAnalysisInstanceAnalysis
   * @return customerSegmentAnalysisInstanceAnalysis
  **/

  public CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceAnalysis getCustomerSegmentAnalysisInstanceAnalysis() {
    return customerSegmentAnalysisInstanceAnalysis;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysis(CRCustomerSegmentAnalysisRetrieveInputModelCustomerSegmentAnalysisInstanceAnalysis customerSegmentAnalysisInstanceAnalysis) {
    this.customerSegmentAnalysisInstanceAnalysis = customerSegmentAnalysisInstanceAnalysis;
  }


}

