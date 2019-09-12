package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExecuteOutputModel
 */
public class BQPerformanceAnalysisExecuteOutputModel   {
  private BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private String performanceAnalysisExecuteActionTaskReference = null;

  private Object performanceAnalysisExecuteActionTaskRecord = null;

  private String performanceAnalysisExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Analysis instance execute service call 
   * @return performanceAnalysisExecuteActionTaskReference
  **/

  public String getPerformanceAnalysisExecuteActionTaskReference() {
    return performanceAnalysisExecuteActionTaskReference;
  }

  public void setPerformanceAnalysisExecuteActionTaskReference(String performanceAnalysisExecuteActionTaskReference) {
    this.performanceAnalysisExecuteActionTaskReference = performanceAnalysisExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return performanceAnalysisExecuteActionTaskRecord
  **/

  public Object getPerformanceAnalysisExecuteActionTaskRecord() {
    return performanceAnalysisExecuteActionTaskRecord;
  }

  public void setPerformanceAnalysisExecuteActionTaskRecord(Object performanceAnalysisExecuteActionTaskRecord) {
    this.performanceAnalysisExecuteActionTaskRecord = performanceAnalysisExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Analysis execute transaction/record 
   * @return performanceAnalysisExecuteRecordReference
  **/

  public String getPerformanceAnalysisExecuteRecordReference() {
    return performanceAnalysisExecuteRecordReference;
  }

  public void setPerformanceAnalysisExecuteRecordReference(String performanceAnalysisExecuteRecordReference) {
    this.performanceAnalysisExecuteRecordReference = performanceAnalysisExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

