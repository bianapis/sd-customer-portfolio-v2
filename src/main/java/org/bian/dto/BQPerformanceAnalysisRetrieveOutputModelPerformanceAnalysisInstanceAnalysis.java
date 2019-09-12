package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceAnalysis
 */
public class BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceAnalysis   {
  private Object performanceAnalysisInstanceAnalysisRecord = null;

  private String performanceAnalysisInstanceAnalysisReportType = null;

  private String performanceAnalysisInstanceAnalysisParameters = null;

  private Object performanceAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return performanceAnalysisInstanceAnalysisRecord
  **/

  public Object getPerformanceAnalysisInstanceAnalysisRecord() {
    return performanceAnalysisInstanceAnalysisRecord;
  }

  public void setPerformanceAnalysisInstanceAnalysisRecord(Object performanceAnalysisInstanceAnalysisRecord) {
    this.performanceAnalysisInstanceAnalysisRecord = performanceAnalysisInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return performanceAnalysisInstanceAnalysisReportType
  **/

  public String getPerformanceAnalysisInstanceAnalysisReportType() {
    return performanceAnalysisInstanceAnalysisReportType;
  }

  public void setPerformanceAnalysisInstanceAnalysisReportType(String performanceAnalysisInstanceAnalysisReportType) {
    this.performanceAnalysisInstanceAnalysisReportType = performanceAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return performanceAnalysisInstanceAnalysisParameters
  **/

  public String getPerformanceAnalysisInstanceAnalysisParameters() {
    return performanceAnalysisInstanceAnalysisParameters;
  }

  public void setPerformanceAnalysisInstanceAnalysisParameters(String performanceAnalysisInstanceAnalysisParameters) {
    this.performanceAnalysisInstanceAnalysisParameters = performanceAnalysisInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return performanceAnalysisInstanceAnalysisReport
  **/

  public Object getPerformanceAnalysisInstanceAnalysisReport() {
    return performanceAnalysisInstanceAnalysisReport;
  }

  public void setPerformanceAnalysisInstanceAnalysisReport(Object performanceAnalysisInstanceAnalysisReport) {
    this.performanceAnalysisInstanceAnalysisReport = performanceAnalysisInstanceAnalysisReport;
  }


}

