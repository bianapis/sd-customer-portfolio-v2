package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord   {
  private String customerSegmentAnalysisSchedule = null;

  private BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport customerSegmentAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for performing customer segment analysis for the enterprise or division 
   * @return customerSegmentAnalysisSchedule
  **/

  public String getCustomerSegmentAnalysisSchedule() {
    return customerSegmentAnalysisSchedule;
  }

  public void setCustomerSegmentAnalysisSchedule(String customerSegmentAnalysisSchedule) {
    this.customerSegmentAnalysisSchedule = customerSegmentAnalysisSchedule;
  }


  /**
   * Get customerSegmentAnalysisReport
   * @return customerSegmentAnalysisReport
  **/

  public BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport getCustomerSegmentAnalysisReport() {
    return customerSegmentAnalysisReport;
  }

  public void setCustomerSegmentAnalysisReport(BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport customerSegmentAnalysisReport) {
    this.customerSegmentAnalysisReport = customerSegmentAnalysisReport;
  }


}

