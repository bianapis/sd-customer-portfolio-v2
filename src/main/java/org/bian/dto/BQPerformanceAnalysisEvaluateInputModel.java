package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateInputModel
 */
public class BQPerformanceAnalysisEvaluateInputModel   {
  private BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private String customerSegmentAnalysisInstanceReference = null;

  private Object performanceAnalysisInitiateActionRecord = null;

  private BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;


  /**
   * Get customerSegmentAnalysisInstanceRecord
   * @return customerSegmentAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return performanceAnalysisInitiateActionRecord
  **/

  public Object getPerformanceAnalysisInitiateActionRecord() {
    return performanceAnalysisInitiateActionRecord;
  }

  public void setPerformanceAnalysisInitiateActionRecord(Object performanceAnalysisInitiateActionRecord) {
    this.performanceAnalysisInitiateActionRecord = performanceAnalysisInitiateActionRecord;
  }


  /**
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


}

