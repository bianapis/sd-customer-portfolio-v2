package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisUpdateInputModelCustomerSegmentAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisUpdateOutputModel
 */
public class CRCustomerSegmentAnalysisUpdateOutputModel   {
  private CRCustomerSegmentAnalysisUpdateInputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;

  private String customerSegmentAnalysisUpdateActionTaskReference = null;

  private Object customerSegmentAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerSegmentAnalysisUpdateActionTaskReference
  **/

  public String getCustomerSegmentAnalysisUpdateActionTaskReference() {
    return customerSegmentAnalysisUpdateActionTaskReference;
  }

  public void setCustomerSegmentAnalysisUpdateActionTaskReference(String customerSegmentAnalysisUpdateActionTaskReference) {
    this.customerSegmentAnalysisUpdateActionTaskReference = customerSegmentAnalysisUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

