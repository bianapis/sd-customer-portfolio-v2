package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExchangeOutputModel
 */
public class BQPerformanceAnalysisExchangeOutputModel   {
  private String performanceAnalysisExchangeActionTaskReference = null;

  private Object performanceAnalysisExchangeActionTaskRecord = null;

  private String performanceAnalysisExchangeActionResponse = null;

  private String performanceAnalysisInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance Analysis instance exchange service call 
   * @return performanceAnalysisExchangeActionTaskReference
  **/

  public String getPerformanceAnalysisExchangeActionTaskReference() {
    return performanceAnalysisExchangeActionTaskReference;
  }

  public void setPerformanceAnalysisExchangeActionTaskReference(String performanceAnalysisExchangeActionTaskReference) {
    this.performanceAnalysisExchangeActionTaskReference = performanceAnalysisExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return performanceAnalysisExchangeActionTaskRecord
  **/

  public Object getPerformanceAnalysisExchangeActionTaskRecord() {
    return performanceAnalysisExchangeActionTaskRecord;
  }

  public void setPerformanceAnalysisExchangeActionTaskRecord(Object performanceAnalysisExchangeActionTaskRecord) {
    this.performanceAnalysisExchangeActionTaskRecord = performanceAnalysisExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return performanceAnalysisExchangeActionResponse
  **/

  public String getPerformanceAnalysisExchangeActionResponse() {
    return performanceAnalysisExchangeActionResponse;
  }

  public void setPerformanceAnalysisExchangeActionResponse(String performanceAnalysisExchangeActionResponse) {
    this.performanceAnalysisExchangeActionResponse = performanceAnalysisExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Performance Analysis instance (e.g. accepted, rejected, verified) 
   * @return performanceAnalysisInstanceStatus
  **/

  public String getPerformanceAnalysisInstanceStatus() {
    return performanceAnalysisInstanceStatus;
  }

  public void setPerformanceAnalysisInstanceStatus(String performanceAnalysisInstanceStatus) {
    this.performanceAnalysisInstanceStatus = performanceAnalysisInstanceStatus;
  }


}

