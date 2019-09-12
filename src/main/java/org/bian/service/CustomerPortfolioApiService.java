/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerPortfolioApiService {

	SDCustomerPortfolioActivateOutputModel activate(SDCustomerPortfolioActivateInputModel request);
	
	SDCustomerPortfolioConfigureOutputModel configure(String sdReferenceId, SDCustomerPortfolioConfigureInputModel request);
	
	CRCustomerSegmentAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerSegmentAnalysisEvaluateInputModel request);
	
	BQPerformanceAnalysisEvaluateOutputModel evaluatePerformanceanalysis(String sdReferenceId, String crReferenceId, BQPerformanceAnalysisEvaluateInputModel request);
	
	BQPerformanceAnalysisExchangeOutputModel exchangePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExchangeInputModel request);
	
	BQPerformanceAnalysisExecuteOutputModel executePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExecuteInputModel request);
	
	SDCustomerPortfolioFeedbackOutputModel feedback(String sdReferenceId, SDCustomerPortfolioFeedbackInputModel request);
	
	BQPerformanceAnalysisRequestOutputModel requestPerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisRequestInputModel request);
	
	CRCustomerSegmentAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerSegmentAnalysisRequestInputModel request);
	
	CRCustomerSegmentAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQPerformanceAnalysisRetrieveOutputModel retrievePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerPortfolioRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerSegmentAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerSegmentAnalysisUpdateInputModel request);
	
	BQPerformanceAnalysisUpdateOutputModel updatePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisUpdateInputModel request);
	
}
