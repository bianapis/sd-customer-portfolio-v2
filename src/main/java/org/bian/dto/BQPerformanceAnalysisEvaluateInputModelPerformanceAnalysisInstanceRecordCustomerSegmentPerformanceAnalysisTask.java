package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask
 */
public class BQPerformanceAnalysisEvaluateInputModelPerformanceAnalysisInstanceRecordCustomerSegmentPerformanceAnalysisTask   {
  private String customerSegmentPerformanceRequestSpecification = null;

  private String customerSegmentPerformanceModelReference = null;

  private Object customerSegmentPerformanceProductServiceActivityReport = null;

  private Object customerSegmentPerformanceFinancialMarketResearchReport = null;

  private String customerSegmentPerformanceWorkProducts = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific details of the performance analysis (can be a default/standard analysis or a specialist/ad-hoc request) 
   * @return customerSegmentPerformanceRequestSpecification
  **/

  public String getCustomerSegmentPerformanceRequestSpecification() {
    return customerSegmentPerformanceRequestSpecification;
  }

  public void setCustomerSegmentPerformanceRequestSpecification(String customerSegmentPerformanceRequestSpecification) {
    this.customerSegmentPerformanceRequestSpecification = customerSegmentPerformanceRequestSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the performance analysis model used 
   * @return customerSegmentPerformanceModelReference
  **/

  public String getCustomerSegmentPerformanceModelReference() {
    return customerSegmentPerformanceModelReference;
  }

  public void setCustomerSegmentPerformanceModelReference(String customerSegmentPerformanceModelReference) {
    this.customerSegmentPerformanceModelReference = customerSegmentPerformanceModelReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The data file, report of customer related transaction details used in the analysis 
   * @return customerSegmentPerformanceProductServiceActivityReport
  **/

  public Object getCustomerSegmentPerformanceProductServiceActivityReport() {
    return customerSegmentPerformanceProductServiceActivityReport;
  }

  public void setCustomerSegmentPerformanceProductServiceActivityReport(Object customerSegmentPerformanceProductServiceActivityReport) {
    this.customerSegmentPerformanceProductServiceActivityReport = customerSegmentPerformanceProductServiceActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of selected financial market research report or market transaction database in any suitable form used for comparisons when appropriate 
   * @return customerSegmentPerformanceFinancialMarketResearchReport
  **/

  public Object getCustomerSegmentPerformanceFinancialMarketResearchReport() {
    return customerSegmentPerformanceFinancialMarketResearchReport;
  }

  public void setCustomerSegmentPerformanceFinancialMarketResearchReport(Object customerSegmentPerformanceFinancialMarketResearchReport) {
    this.customerSegmentPerformanceFinancialMarketResearchReport = customerSegmentPerformanceFinancialMarketResearchReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return customerSegmentPerformanceWorkProducts
  **/

  public String getCustomerSegmentPerformanceWorkProducts() {
    return customerSegmentPerformanceWorkProducts;
  }

  public void setCustomerSegmentPerformanceWorkProducts(String customerSegmentPerformanceWorkProducts) {
    this.customerSegmentPerformanceWorkProducts = customerSegmentPerformanceWorkProducts;
  }


}

