package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord;
import org.bian.dto.BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateOutputModel
 */
public class BQPerformanceAnalysisEvaluateOutputModel   {
  private BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private String performanceAnalysisInstanceReference = null;

  private String performanceAnalysisInitiateActionReference = null;

  private Object performanceAnalysisInitiateActionRecord = null;

  private String performanceAnalysisInstanceStatus = null;

  private BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return performanceAnalysisInitiateActionReference
  **/

  public String getPerformanceAnalysisInitiateActionReference() {
    return performanceAnalysisInitiateActionReference;
  }

  public void setPerformanceAnalysisInitiateActionReference(String performanceAnalysisInitiateActionReference) {
    this.performanceAnalysisInitiateActionReference = performanceAnalysisInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Performance Analysis instance (e.g. initialised, pending, active) 
   * @return performanceAnalysisInstanceStatus
  **/

  public String getPerformanceAnalysisInstanceStatus() {
    return performanceAnalysisInstanceStatus;
  }

  public void setPerformanceAnalysisInstanceStatus(String performanceAnalysisInstanceStatus) {
    this.performanceAnalysisInstanceStatus = performanceAnalysisInstanceStatus;
  }


  /**
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


}

