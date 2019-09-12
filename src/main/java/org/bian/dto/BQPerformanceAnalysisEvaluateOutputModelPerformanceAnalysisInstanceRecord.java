package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecord   {
  private String customerSegmentPerformanceAnalysisType = null;

  private BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask customerSegmentPerformanceAnalysisTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of analysis/algorithm used to evaluate and compare the customer segment performance to prevailing market measures 
   * @return customerSegmentPerformanceAnalysisType
  **/

  public String getCustomerSegmentPerformanceAnalysisType() {
    return customerSegmentPerformanceAnalysisType;
  }

  public void setCustomerSegmentPerformanceAnalysisType(String customerSegmentPerformanceAnalysisType) {
    this.customerSegmentPerformanceAnalysisType = customerSegmentPerformanceAnalysisType;
  }


  /**
   * Get customerSegmentPerformanceAnalysisTask
   * @return customerSegmentPerformanceAnalysisTask
  **/

  public BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask getCustomerSegmentPerformanceAnalysisTask() {
    return customerSegmentPerformanceAnalysisTask;
  }

  public void setCustomerSegmentPerformanceAnalysisTask(BQPerformanceAnalysisEvaluateOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask customerSegmentPerformanceAnalysisTask) {
    this.customerSegmentPerformanceAnalysisTask = customerSegmentPerformanceAnalysisTask;
  }


}

