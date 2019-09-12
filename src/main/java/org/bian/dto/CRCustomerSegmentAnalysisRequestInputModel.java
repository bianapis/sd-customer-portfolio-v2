package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord;
import org.bian.dto.CRCustomerSegmentAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRequestInputModel
 */
public class CRCustomerSegmentAnalysisRequestInputModel   {
  private String customerPortfolioServicingSessionReference = null;

  private String customerSegmentAnalysisInstanceReference = null;

  private CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private Object customerSegmentAnalysisRequestActionTaskRecord = null;

  private CRCustomerSegmentAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(CRCustomerSegmentAnalysisEvaluateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerSegmentAnalysisRequestActionTaskRecord
  **/

  public Object getCustomerSegmentAnalysisRequestActionTaskRecord() {
    return customerSegmentAnalysisRequestActionTaskRecord;
  }

  public void setCustomerSegmentAnalysisRequestActionTaskRecord(Object customerSegmentAnalysisRequestActionTaskRecord) {
    this.customerSegmentAnalysisRequestActionTaskRecord = customerSegmentAnalysisRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerSegmentAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerSegmentAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

