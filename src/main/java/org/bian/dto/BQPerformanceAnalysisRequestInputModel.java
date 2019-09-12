package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord;
import org.bian.dto.CRCustomerSegmentAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRequestInputModel
 */
public class BQPerformanceAnalysisRequestInputModel   {
  private String customerSegmentAnalysisInstanceReference = null;

  private String performanceAnalysisInstanceReference = null;

  private BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private Object performanceAnalysisRequestActionTaskRecord = null;

  private CRCustomerSegmentAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return performanceAnalysisRequestActionTaskRecord
  **/

  public Object getPerformanceAnalysisRequestActionTaskRecord() {
    return performanceAnalysisRequestActionTaskRecord;
  }

  public void setPerformanceAnalysisRequestActionTaskRecord(Object performanceAnalysisRequestActionTaskRecord) {
    this.performanceAnalysisRequestActionTaskRecord = performanceAnalysisRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerSegmentAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerSegmentAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

