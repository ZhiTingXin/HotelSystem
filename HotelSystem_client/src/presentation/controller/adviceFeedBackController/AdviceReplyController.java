package presentation.controller.adviceFeedBackController;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import blservice.AdviceFeedBack_blservice;
import blservice.impl.AdviceFeedBack_bl;
import other.ResultMessage;
import presentation.view.adviceFeedBack_ui.AdviceReplyControllerService;

public class AdviceReplyController implements AdviceReplyControllerService{

	private AdviceFeedBack_blservice advicefeedbackblservice;
	
	public AdviceReplyController(){
		advicefeedbackblservice = new AdviceFeedBack_bl();
	}
	public ArrayList<AdviceFeedBackVO> getUnprocessedAdvice(String systemstaffId) {
		
		return advicefeedbackblservice.getUnprocessedAdvice(systemstaffId);
	}

	public ArrayList<AdviceFeedBackVO> getProcessedAdvice(String systemstaffId) {
		
		return advicefeedbackblservice.getProcessedAdvice(systemstaffId);
	}
	
	public ResultMessage addAdviceFeedback(AdviceFeedBackVO advice){
		
		return advicefeedbackblservice.addAdviceFeedBack(advice);
	}
	public ResultMessage update(AdviceFeedBackVO advice) {
		
		return advicefeedbackblservice.modifyAdviceFeedBack(advice);
	}

}
