package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceAnalysis;
import org.bian.dto.BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord;
import org.bian.dto.BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRetrieveOutputModel
 */
public class BQPerformanceAnalysisRetrieveOutputModel   {
  private BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private String performanceAnalysisRetrieveActionTaskReference = null;

  private Object performanceAnalysisRetrieveActionTaskRecord = null;

  private String performanceAnalysisRetrieveActionResponse = null;

  private BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceReport performanceAnalysisInstanceReport = null;

  private BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceAnalysis performanceAnalysisInstanceAnalysis = null;


  /**
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Analysis instance retrieve service call 
   * @return performanceAnalysisRetrieveActionTaskReference
  **/

  public String getPerformanceAnalysisRetrieveActionTaskReference() {
    return performanceAnalysisRetrieveActionTaskReference;
  }

  public void setPerformanceAnalysisRetrieveActionTaskReference(String performanceAnalysisRetrieveActionTaskReference) {
    this.performanceAnalysisRetrieveActionTaskReference = performanceAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return performanceAnalysisRetrieveActionTaskRecord
  **/

  public Object getPerformanceAnalysisRetrieveActionTaskRecord() {
    return performanceAnalysisRetrieveActionTaskRecord;
  }

  public void setPerformanceAnalysisRetrieveActionTaskRecord(Object performanceAnalysisRetrieveActionTaskRecord) {
    this.performanceAnalysisRetrieveActionTaskRecord = performanceAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return performanceAnalysisRetrieveActionResponse
  **/

  public String getPerformanceAnalysisRetrieveActionResponse() {
    return performanceAnalysisRetrieveActionResponse;
  }

  public void setPerformanceAnalysisRetrieveActionResponse(String performanceAnalysisRetrieveActionResponse) {
    this.performanceAnalysisRetrieveActionResponse = performanceAnalysisRetrieveActionResponse;
  }


  /**
   * Get performanceAnalysisInstanceReport
   * @return performanceAnalysisInstanceReport
  **/

  public BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceReport getPerformanceAnalysisInstanceReport() {
    return performanceAnalysisInstanceReport;
  }

  public void setPerformanceAnalysisInstanceReport(BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceReport performanceAnalysisInstanceReport) {
    this.performanceAnalysisInstanceReport = performanceAnalysisInstanceReport;
  }


  /**
   * Get performanceAnalysisInstanceAnalysis
   * @return performanceAnalysisInstanceAnalysis
  **/

  public BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceAnalysis getPerformanceAnalysisInstanceAnalysis() {
    return performanceAnalysisInstanceAnalysis;
  }

  public void setPerformanceAnalysisInstanceAnalysis(BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceAnalysis performanceAnalysisInstanceAnalysis) {
    this.performanceAnalysisInstanceAnalysis = performanceAnalysisInstanceAnalysis;
  }


}

