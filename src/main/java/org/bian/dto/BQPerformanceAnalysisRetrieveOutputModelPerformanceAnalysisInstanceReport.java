package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceReport
 */
public class BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceReport   {
  private Object performanceAnalysisInstanceReportRecord = null;

  private String performanceAnalysisInstanceReportType = null;

  private String performanceAnalysisInstanceReportParameters = null;

  private Object performanceAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return performanceAnalysisInstanceReportRecord
  **/

  public Object getPerformanceAnalysisInstanceReportRecord() {
    return performanceAnalysisInstanceReportRecord;
  }

  public void setPerformanceAnalysisInstanceReportRecord(Object performanceAnalysisInstanceReportRecord) {
    this.performanceAnalysisInstanceReportRecord = performanceAnalysisInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return performanceAnalysisInstanceReportType
  **/

  public String getPerformanceAnalysisInstanceReportType() {
    return performanceAnalysisInstanceReportType;
  }

  public void setPerformanceAnalysisInstanceReportType(String performanceAnalysisInstanceReportType) {
    this.performanceAnalysisInstanceReportType = performanceAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return performanceAnalysisInstanceReportParameters
  **/

  public String getPerformanceAnalysisInstanceReportParameters() {
    return performanceAnalysisInstanceReportParameters;
  }

  public void setPerformanceAnalysisInstanceReportParameters(String performanceAnalysisInstanceReportParameters) {
    this.performanceAnalysisInstanceReportParameters = performanceAnalysisInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return performanceAnalysisInstanceReport
  **/

  public Object getPerformanceAnalysisInstanceReport() {
    return performanceAnalysisInstanceReport;
  }

  public void setPerformanceAnalysisInstanceReport(Object performanceAnalysisInstanceReport) {
    this.performanceAnalysisInstanceReport = performanceAnalysisInstanceReport;
  }


}

