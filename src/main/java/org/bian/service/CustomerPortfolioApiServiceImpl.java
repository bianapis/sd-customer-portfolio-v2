/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerPortfolioApiServiceImpl implements CustomerPortfolioApiService {

	public SDCustomerPortfolioActivateOutputModel activate(SDCustomerPortfolioActivateInputModel request){
		return JsonReader.read("activate-SDCustomerPortfolioActivateOutputModel.json",new TypeReference<SDCustomerPortfolioActivateOutputModel>(){});
	}
	
	public SDCustomerPortfolioConfigureOutputModel configure(String sdReferenceId, SDCustomerPortfolioConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerPortfolioConfigureOutputModel.json",new TypeReference<SDCustomerPortfolioConfigureOutputModel>(){});
	}
	
	public CRCustomerSegmentAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRCustomerSegmentAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCustomerSegmentAnalysisEvaluateOutputModel.json",new TypeReference<CRCustomerSegmentAnalysisEvaluateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisEvaluateOutputModel evaluatePerformanceanalysis(String sdReferenceId, String crReferenceId, BQPerformanceAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPerformanceAnalysisEvaluateOutputModel.json",new TypeReference<BQPerformanceAnalysisEvaluateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisExchangeOutputModel exchangePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExchangeInputModel request){
		return JsonReader.read("exchange-BQPerformanceAnalysisExchangeOutputModel.json",new TypeReference<BQPerformanceAnalysisExchangeOutputModel>(){});
	}
	
	public BQPerformanceAnalysisExecuteOutputModel executePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExecuteInputModel request){
		return JsonReader.read("execute-BQPerformanceAnalysisExecuteOutputModel.json",new TypeReference<BQPerformanceAnalysisExecuteOutputModel>(){});
	}
	
	public SDCustomerPortfolioFeedbackOutputModel feedback(String sdReferenceId, SDCustomerPortfolioFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerPortfolioFeedbackOutputModel.json",new TypeReference<SDCustomerPortfolioFeedbackOutputModel>(){});
	}
	
	public BQPerformanceAnalysisRequestOutputModel requestPerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisRequestInputModel request){
		return JsonReader.read("request-BQPerformanceAnalysisRequestOutputModel.json",new TypeReference<BQPerformanceAnalysisRequestOutputModel>(){});
	}
	
	public CRCustomerSegmentAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerSegmentAnalysisRequestInputModel request){
		return JsonReader.read("request-CRCustomerSegmentAnalysisRequestOutputModel.json",new TypeReference<CRCustomerSegmentAnalysisRequestOutputModel>(){});
	}
	
	public CRCustomerSegmentAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerSegmentAnalysisRetrieveOutputModel.json",new TypeReference<CRCustomerSegmentAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPerformanceAnalysisRetrieveOutputModel retrievePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceAnalysisRetrieveOutputModel.json",new TypeReference<BQPerformanceAnalysisRetrieveOutputModel>(){});
	}
	
	public SDCustomerPortfolioRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerPortfolioRetrieveOutputModel.json",new TypeReference<SDCustomerPortfolioRetrieveOutputModel>(){});
	}
	
	public CRCustomerSegmentAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerSegmentAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRCustomerSegmentAnalysisUpdateOutputModel.json",new TypeReference<CRCustomerSegmentAnalysisUpdateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisUpdateOutputModel updatePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceAnalysisUpdateOutputModel.json",new TypeReference<BQPerformanceAnalysisUpdateOutputModel>(){});
	}
	
}
