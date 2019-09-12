/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyse;

@BianRestController
public class CustomerPortfolioApiController {

	@Autowired
	CustomerPortfolioApiService service;
	
	@Analyse.Activate
	public BianResponse<SDCustomerPortfolioActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerPortfolioActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Analyse.Configure
	public BianResponse<SDCustomerPortfolioConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerPortfolioConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Evaluate
	public BianResponse<CRCustomerSegmentAnalysisEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerSegmentAnalysisEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceanalysis")
	@Analyse.Evaluate
	public BianResponse<BQPerformanceAnalysisEvaluateOutputModel> evaluatePerformanceanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPerformanceAnalysisEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluatePerformanceanalysis(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceanalysis")
	@Analyse.Exchange
	public BianResponse<BQPerformanceAnalysisExchangeOutputModel> exchangePerformanceanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAnalysisExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePerformanceanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceanalysis")
	@Analyse.Execute
	public BianResponse<BQPerformanceAnalysisExecuteOutputModel> executePerformanceanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executePerformanceanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Feedback
	public BianResponse<SDCustomerPortfolioFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerPortfolioFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceanalysis")
	@Analyse.Request
	public BianResponse<BQPerformanceAnalysisRequestOutputModel> requestPerformanceanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestPerformanceanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Request
	public BianResponse<CRCustomerSegmentAnalysisRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerSegmentAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Retrieve
	public BianResponse<CRCustomerSegmentAnalysisRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Analyse.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Analyse.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Analyse.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("performanceanalysis")
	@Analyse.Retrieve
	public BianResponse<BQPerformanceAnalysisRetrieveOutputModel> retrievePerformanceanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePerformanceanalysis(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Analyse.RetrieveSD
	public BianResponse<SDCustomerPortfolioRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Analyse.Update
	public BianResponse<CRCustomerSegmentAnalysisUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerSegmentAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceanalysis")
	@Analyse.Update
	public BianResponse<BQPerformanceAnalysisUpdateOutputModel> updatePerformanceanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePerformanceanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
