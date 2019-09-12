package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport
 */
public class BQPerformanceAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecordCustomerSegmentAnalysisReport   {
  private String customerSegmentAnalysisType = null;

  private String customerSegmentAnalysisResult = null;

  private String customerSegmentAnalysisReportingDate = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines a type of performance analysis performed (e.g. scheduled review, specialized analysis, sensitivity assessment/projection) 
   * @return customerSegmentAnalysisType
  **/

  public String getCustomerSegmentAnalysisType() {
    return customerSegmentAnalysisType;
  }

  public void setCustomerSegmentAnalysisType(String customerSegmentAnalysisType) {
    this.customerSegmentAnalysisType = customerSegmentAnalysisType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The consolidated report of the performance evaluation and comparisons from the analysis 
   * @return customerSegmentAnalysisResult
  **/

  public String getCustomerSegmentAnalysisResult() {
    return customerSegmentAnalysisResult;
  }

  public void setCustomerSegmentAnalysisResult(String customerSegmentAnalysisResult) {
    this.customerSegmentAnalysisResult = customerSegmentAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the performance report was completed 
   * @return customerSegmentAnalysisReportingDate
  **/

  public String getCustomerSegmentAnalysisReportingDate() {
    return customerSegmentAnalysisReportingDate;
  }

  public void setCustomerSegmentAnalysisReportingDate(String customerSegmentAnalysisReportingDate) {
    this.customerSegmentAnalysisReportingDate = customerSegmentAnalysisReportingDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated performance analysis reporting documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

