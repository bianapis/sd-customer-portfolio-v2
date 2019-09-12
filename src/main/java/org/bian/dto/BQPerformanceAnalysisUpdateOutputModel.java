package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisUpdateInputModelPerformanceAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisUpdateOutputModel
 */
public class BQPerformanceAnalysisUpdateOutputModel   {
  private BQPerformanceAnalysisUpdateInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private String performanceAnalysisUpdateActionTaskReference = null;

  private Object performanceAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return performanceAnalysisUpdateActionTaskReference
  **/

  public String getPerformanceAnalysisUpdateActionTaskReference() {
    return performanceAnalysisUpdateActionTaskReference;
  }

  public void setPerformanceAnalysisUpdateActionTaskReference(String performanceAnalysisUpdateActionTaskReference) {
    this.performanceAnalysisUpdateActionTaskReference = performanceAnalysisUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

