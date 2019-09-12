package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecord
 */
public class CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecord   {
  private String customerSegmentType = null;

  private String customerSegmentTypeDefinition = null;

  private String customerSegmentPerformanceGoals = null;

  private String customerSegmentAnalysisSchedule = null;

  private CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport customerSegmentAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The descriptive name of the bank defined customer segment  
   * @return customerSegmentType
  **/

  public String getCustomerSegmentType() {
    return customerSegmentType;
  }

  public void setCustomerSegmentType(String customerSegmentType) {
    this.customerSegmentType = customerSegmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Detailed properties and characteristics that define the customer segment 
   * @return customerSegmentTypeDefinition
  **/

  public String getCustomerSegmentTypeDefinition() {
    return customerSegmentTypeDefinition;
  }

  public void setCustomerSegmentTypeDefinition(String customerSegmentTypeDefinition) {
    this.customerSegmentTypeDefinition = customerSegmentTypeDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the performance goals for defined customer segments as defined by senior management functions (target/anticipated and actual as assessed). 
   * @return customerSegmentPerformanceGoals
  **/

  public String getCustomerSegmentPerformanceGoals() {
    return customerSegmentPerformanceGoals;
  }

  public void setCustomerSegmentPerformanceGoals(String customerSegmentPerformanceGoals) {
    this.customerSegmentPerformanceGoals = customerSegmentPerformanceGoals;
  }


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

  public CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport getCustomerSegmentAnalysisReport() {
    return customerSegmentAnalysisReport;
  }

  public void setCustomerSegmentAnalysisReport(CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport customerSegmentAnalysisReport) {
    this.customerSegmentAnalysisReport = customerSegmentAnalysisReport;
  }


}

