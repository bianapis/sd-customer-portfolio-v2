package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRequestOutputModel
 */
public class BQPerformanceAnalysisRequestOutputModel   {
  private BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private String performanceAnalysisRequestActionTaskReference = null;

  private Object performanceAnalysisRequestActionTaskRecord = null;

  private String performanceAnalysisRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Analysis instance request service call 
   * @return performanceAnalysisRequestActionTaskReference
  **/

  public String getPerformanceAnalysisRequestActionTaskReference() {
    return performanceAnalysisRequestActionTaskReference;
  }

  public void setPerformanceAnalysisRequestActionTaskReference(String performanceAnalysisRequestActionTaskReference) {
    this.performanceAnalysisRequestActionTaskReference = performanceAnalysisRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Analysis service request record 
   * @return performanceAnalysisRequestRecordReference
  **/

  public String getPerformanceAnalysisRequestRecordReference() {
    return performanceAnalysisRequestRecordReference;
  }

  public void setPerformanceAnalysisRequestRecordReference(String performanceAnalysisRequestRecordReference) {
    this.performanceAnalysisRequestRecordReference = performanceAnalysisRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

