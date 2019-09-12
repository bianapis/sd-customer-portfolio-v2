package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisUpdateInputModelCustomerSegmentAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisUpdateInputModel
 */
public class CRCustomerSegmentAnalysisUpdateInputModel   {
  private String customerPortfolioServicingSessionReference = null;

  private String customerSegmentAnalysisInstanceReference = null;

  private CRCustomerSegmentAnalysisUpdateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private Object customerSegmentAnalysisUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Segment Analysis instance 
   * @return customerSegmentAnalysisInstanceReference
  **/

  public String getCustomerSegmentAnalysisInstanceReference() {
    return customerSegmentAnalysisInstanceReference;
  }

  public void setCustomerSegmentAnalysisInstanceReference(String customerSegmentAnalysisInstanceReference) {
    this.customerSegmentAnalysisInstanceReference = customerSegmentAnalysisInstanceReference;
  }


  /**
   * Get customerSegmentAnalysisInstanceRecord
   * @return customerSegmentAnalysisInstanceRecord
  **/

  public CRCustomerSegmentAnalysisUpdateInputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(CRCustomerSegmentAnalysisUpdateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerSegmentAnalysisUpdateActionTaskRecord
  **/

  public Object getCustomerSegmentAnalysisUpdateActionTaskRecord() {
    return customerSegmentAnalysisUpdateActionTaskRecord;
  }

  public void setCustomerSegmentAnalysisUpdateActionTaskRecord(Object customerSegmentAnalysisUpdateActionTaskRecord) {
    this.customerSegmentAnalysisUpdateActionTaskRecord = customerSegmentAnalysisUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

