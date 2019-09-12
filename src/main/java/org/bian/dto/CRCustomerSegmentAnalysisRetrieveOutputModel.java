package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceAnalysis;
import org.bian.dto.CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceRecord;
import org.bian.dto.CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRetrieveOutputModel
 */
public class CRCustomerSegmentAnalysisRetrieveOutputModel   {
  private CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private String customerSegmentAnalysisRetrieveActionTaskReference = null;

  private Object customerSegmentAnalysisRetrieveActionTaskRecord = null;

  private String customerSegmentAnalysisRetrieveActionResponse = null;

  private CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceReportRecord customerSegmentAnalysisInstanceReportRecord = null;

  private CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceAnalysis customerSegmentAnalysisInstanceAnalysis = null;


  /**
   * Get customerSegmentAnalysisInstanceRecord
   * @return customerSegmentAnalysisInstanceRecord
  **/

  public CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Segment Analysis instance retrieve service call 
   * @return customerSegmentAnalysisRetrieveActionTaskReference
  **/

  public String getCustomerSegmentAnalysisRetrieveActionTaskReference() {
    return customerSegmentAnalysisRetrieveActionTaskReference;
  }

  public void setCustomerSegmentAnalysisRetrieveActionTaskReference(String customerSegmentAnalysisRetrieveActionTaskReference) {
    this.customerSegmentAnalysisRetrieveActionTaskReference = customerSegmentAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerSegmentAnalysisRetrieveActionResponse
  **/

  public String getCustomerSegmentAnalysisRetrieveActionResponse() {
    return customerSegmentAnalysisRetrieveActionResponse;
  }

  public void setCustomerSegmentAnalysisRetrieveActionResponse(String customerSegmentAnalysisRetrieveActionResponse) {
    this.customerSegmentAnalysisRetrieveActionResponse = customerSegmentAnalysisRetrieveActionResponse;
  }


  /**
   * Get customerSegmentAnalysisInstanceReportRecord
   * @return customerSegmentAnalysisInstanceReportRecord
  **/

  public CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceReportRecord getCustomerSegmentAnalysisInstanceReportRecord() {
    return customerSegmentAnalysisInstanceReportRecord;
  }

  public void setCustomerSegmentAnalysisInstanceReportRecord(CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceReportRecord customerSegmentAnalysisInstanceReportRecord) {
    this.customerSegmentAnalysisInstanceReportRecord = customerSegmentAnalysisInstanceReportRecord;
  }


  /**
   * Get customerSegmentAnalysisInstanceAnalysis
   * @return customerSegmentAnalysisInstanceAnalysis
  **/

  public CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceAnalysis getCustomerSegmentAnalysisInstanceAnalysis() {
    return customerSegmentAnalysisInstanceAnalysis;
  }

  public void setCustomerSegmentAnalysisInstanceAnalysis(CRCustomerSegmentAnalysisRetrieveOutputModelCustomerSegmentAnalysisInstanceAnalysis customerSegmentAnalysisInstanceAnalysis) {
    this.customerSegmentAnalysisInstanceAnalysis = customerSegmentAnalysisInstanceAnalysis;
  }


}

