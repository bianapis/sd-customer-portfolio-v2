package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisRequestOutputModelCustomerSegmentAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisRequestOutputModel
 */
public class CRCustomerSegmentAnalysisRequestOutputModel   {
  private CRCustomerSegmentAnalysisRequestOutputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private String customerSegmentAnalysisRequestActionTaskReference = null;

  private Object customerSegmentAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerSegmentAnalysisInstanceRecord
   * @return customerSegmentAnalysisInstanceRecord
  **/

  public CRCustomerSegmentAnalysisRequestOutputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(CRCustomerSegmentAnalysisRequestOutputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Segment Analysis instance request service call 
   * @return customerSegmentAnalysisRequestActionTaskReference
  **/

  public String getCustomerSegmentAnalysisRequestActionTaskReference() {
    return customerSegmentAnalysisRequestActionTaskReference;
  }

  public void setCustomerSegmentAnalysisRequestActionTaskReference(String customerSegmentAnalysisRequestActionTaskReference) {
    this.customerSegmentAnalysisRequestActionTaskReference = customerSegmentAnalysisRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

