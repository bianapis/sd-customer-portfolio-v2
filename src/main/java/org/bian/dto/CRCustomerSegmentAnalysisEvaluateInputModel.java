package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisEvaluateInputModel
 */
public class CRCustomerSegmentAnalysisEvaluateInputModel   {
  private String customerPortfolioServicingSessionReference = null;

  private Object customerSegmentAnalysisEvaluateActionRecord = null;

  private String customerSegmentAnalysisInstanceStatus = null;

  private CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerPortfolioServicingSessionReference
  **/

  public String getCustomerPortfolioServicingSessionReference() {
    return customerPortfolioServicingSessionReference;
  }

  public void setCustomerPortfolioServicingSessionReference(String customerPortfolioServicingSessionReference) {
    this.customerPortfolioServicingSessionReference = customerPortfolioServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return customerSegmentAnalysisEvaluateActionRecord
  **/

  public Object getCustomerSegmentAnalysisEvaluateActionRecord() {
    return customerSegmentAnalysisEvaluateActionRecord;
  }

  public void setCustomerSegmentAnalysisEvaluateActionRecord(Object customerSegmentAnalysisEvaluateActionRecord) {
    this.customerSegmentAnalysisEvaluateActionRecord = customerSegmentAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Segment Analysis instance (e.g. initialised, pending, active) 
   * @return customerSegmentAnalysisInstanceStatus
  **/

  public String getCustomerSegmentAnalysisInstanceStatus() {
    return customerSegmentAnalysisInstanceStatus;
  }

  public void setCustomerSegmentAnalysisInstanceStatus(String customerSegmentAnalysisInstanceStatus) {
    this.customerSegmentAnalysisInstanceStatus = customerSegmentAnalysisInstanceStatus;
  }


  /**
   * Get customerSegmentAnalysisInstanceRecord
   * @return customerSegmentAnalysisInstanceRecord
  **/

  public CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


}

