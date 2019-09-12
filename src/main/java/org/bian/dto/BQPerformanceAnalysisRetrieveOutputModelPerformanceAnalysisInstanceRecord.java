package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord   {
  private String customerSegmentPerformanceAnalysisType = null;

  private BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask customerSegmentPerformanceAnalysisTask = null;


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

  public BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask getCustomerSegmentPerformanceAnalysisTask() {
    return customerSegmentPerformanceAnalysisTask;
  }

  public void setCustomerSegmentPerformanceAnalysisTask(BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask customerSegmentPerformanceAnalysisTask) {
    this.customerSegmentPerformanceAnalysisTask = customerSegmentPerformanceAnalysisTask;
  }


}

