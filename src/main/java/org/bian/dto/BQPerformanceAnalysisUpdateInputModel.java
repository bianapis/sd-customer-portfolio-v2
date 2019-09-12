package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisUpdateInputModelPerformanceAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisUpdateInputModel
 */
public class BQPerformanceAnalysisUpdateInputModel   {
  private String customerSegmentAnalysisInstanceReference = null;

  private String performanceAnalysisInstanceReference = null;

  private BQPerformanceAnalysisUpdateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private Object performanceAnalysisUpdateActionTaskRecord = null;

  private String performanceAnalysisUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Segment Analysis instance 
   * @return customerSegmentAnalysisInstanceReference
  **/

  public String getCustomerSegmentAnalysisInstanceReference() {
    return customerSegmentAnalysisInstanceReference;
  }

  public void setCustomerSegmentAnalysisInstanceReference(String customerSegmentAnalysisInstanceReference) {
    this.customerSegmentAnalysisInstanceReference = customerSegmentAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Analysis instance 
   * @return performanceAnalysisInstanceReference
  **/

  public String getPerformanceAnalysisInstanceReference() {
    return performanceAnalysisInstanceReference;
  }

  public void setPerformanceAnalysisInstanceReference(String performanceAnalysisInstanceReference) {
    this.performanceAnalysisInstanceReference = performanceAnalysisInstanceReference;
  }


  /**
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisUpdateInputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisUpdateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return performanceAnalysisUpdateActionTaskRecord
  **/

  public Object getPerformanceAnalysisUpdateActionTaskRecord() {
    return performanceAnalysisUpdateActionTaskRecord;
  }

  public void setPerformanceAnalysisUpdateActionTaskRecord(Object performanceAnalysisUpdateActionTaskRecord) {
    this.performanceAnalysisUpdateActionTaskRecord = performanceAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return performanceAnalysisUpdateActionRequest
  **/

  public String getPerformanceAnalysisUpdateActionRequest() {
    return performanceAnalysisUpdateActionRequest;
  }

  public void setPerformanceAnalysisUpdateActionRequest(String performanceAnalysisUpdateActionRequest) {
    this.performanceAnalysisUpdateActionRequest = performanceAnalysisUpdateActionRequest;
  }


}

