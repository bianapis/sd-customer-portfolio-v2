package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSegmentAnalysisEvaluateOutputModel
 */
public class CRCustomerSegmentAnalysisEvaluateOutputModel   {
  private String customerSegmentAnalysisInstanceReference = null;

  private String customerSegmentAnalysisEvaluateActionReference = null;

  private Object customerSegmentAnalysisEvaluateActionRecord = null;

  private String customerSegmentAnalysisInstanceStatus = null;

  private CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return customerSegmentAnalysisEvaluateActionReference
  **/

  public String getCustomerSegmentAnalysisEvaluateActionReference() {
    return customerSegmentAnalysisEvaluateActionReference;
  }

  public void setCustomerSegmentAnalysisEvaluateActionReference(String customerSegmentAnalysisEvaluateActionReference) {
    this.customerSegmentAnalysisEvaluateActionReference = customerSegmentAnalysisEvaluateActionReference;
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

  public CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecord getCustomerSegmentAnalysisInstanceRecord() {
    return customerSegmentAnalysisInstanceRecord;
  }

  public void setCustomerSegmentAnalysisInstanceRecord(CRCustomerSegmentAnalysisEvaluateOutputModelCustomerSegmentAnalysisInstanceRecord customerSegmentAnalysisInstanceRecord) {
    this.customerSegmentAnalysisInstanceRecord = customerSegmentAnalysisInstanceRecord;
  }


}

