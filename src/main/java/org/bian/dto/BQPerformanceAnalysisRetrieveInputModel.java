package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceAnalysis;
import org.bian.dto.BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRetrieveInputModel
 */
public class BQPerformanceAnalysisRetrieveInputModel   {
  private Object performanceAnalysisRetrieveActionTaskRecord = null;

  private String performanceAnalysisRetrieveActionRequest = null;

  private BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceReport performanceAnalysisInstanceReport = null;

  private BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceAnalysis performanceAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return performanceAnalysisRetrieveActionRequest
  **/

  public String getPerformanceAnalysisRetrieveActionRequest() {
    return performanceAnalysisRetrieveActionRequest;
  }

  public void setPerformanceAnalysisRetrieveActionRequest(String performanceAnalysisRetrieveActionRequest) {
    this.performanceAnalysisRetrieveActionRequest = performanceAnalysisRetrieveActionRequest;
  }


  /**
   * Get performanceAnalysisInstanceReport
   * @return performanceAnalysisInstanceReport
  **/

  public BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceReport getPerformanceAnalysisInstanceReport() {
    return performanceAnalysisInstanceReport;
  }

  public void setPerformanceAnalysisInstanceReport(BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceReport performanceAnalysisInstanceReport) {
    this.performanceAnalysisInstanceReport = performanceAnalysisInstanceReport;
  }


  /**
   * Get performanceAnalysisInstanceAnalysis
   * @return performanceAnalysisInstanceAnalysis
  **/

  public BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceAnalysis getPerformanceAnalysisInstanceAnalysis() {
    return performanceAnalysisInstanceAnalysis;
  }

  public void setPerformanceAnalysisInstanceAnalysis(BQPerformanceAnalysisRetrieveInputModelPerformanceAnalysisInstanceAnalysis performanceAnalysisInstanceAnalysis) {
    this.performanceAnalysisInstanceAnalysis = performanceAnalysisInstanceAnalysis;
  }


}

