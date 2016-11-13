package blservice.impl;

import java.util.ArrayList;

import PO.AdviceFeedBackPO;
import VO.AdviceFeedBackVO;
import blservice.AdviceFeedBack_blservice;
import other.AdviceFeedBackState;
import other.ResultMessage;

public class AdviceFeedBack_bl implements AdviceFeedBack_blservice{

	AdviceFeedBackVO advice;
	//ΪMock����ı���
//	private String userId;
	
	public AdviceFeedBack_bl(){
		
	}
	public ArrayList<AdviceFeedBackVO> getAllAdvice(String userID) {
		ArrayList<AdviceFeedBackVO> alist = new ArrayList<AdviceFeedBackVO>();
		AdviceFeedBackPO advice = new AdviceFeedBackPO(AdviceFeedBackState.PROCESSED,"��վ��������ֿ���","1");
		AdviceFeedBackVO advicefeedbackvo = new AdviceFeedBackVO(advice);
		alist.add(advicefeedbackvo);
		return alist;
	}

	public ResultMessage addAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESSFUL;
	}

	public ResultMessage modifyAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo) {
		// TODO Auto-generated method stub
		return ResultMessage.FAILED;
	}

	public ArrayList<AdviceFeedBackVO> getUnprocessedAdvice(String systemstaffId) {
		// TODO Auto-generated method stub
		ArrayList<AdviceFeedBackVO> blist = new ArrayList<AdviceFeedBackVO>();
		AdviceFeedBackPO ad = new AdviceFeedBackPO(AdviceFeedBackState.PROCESSED,"��վ̫ˮ��","3");
		AdviceFeedBackVO advicefeedback = new AdviceFeedBackVO(ad);
		blist.add(advicefeedback);
		return blist;
	}

	public ArrayList<AdviceFeedBackVO> getProcessedAdvice(String systemstaffId) {
		// TODO Auto-generated method stub
		ArrayList<AdviceFeedBackVO> blist = new ArrayList<AdviceFeedBackVO>();
		AdviceFeedBackPO advice = new AdviceFeedBackPO(AdviceFeedBackState.UNPROCESSED,"��վ��������","2");
		AdviceFeedBackVO advicefeedback = new AdviceFeedBackVO(advice);
		blist.add(advicefeedback);
		return blist;
	}

	public ResultMessage setStateOfAdvice(String Adviceid) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESSFUL;
	}

}
