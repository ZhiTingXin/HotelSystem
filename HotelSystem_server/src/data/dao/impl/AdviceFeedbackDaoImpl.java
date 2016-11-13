package data.dao.impl;

import java.util.ArrayList;

import PO.AdviceFeedBackPO;
import data.dao.AdviceFeedbackDao;
import other.ResultMessage;

public class AdviceFeedbackDaoImpl implements AdviceFeedbackDao {

	private ArrayList<AdviceFeedBackPO> adviceList;
//	private DataFactory datafactory;
	public ResultMessage addAdvice(AdviceFeedBackPO advice) {
		adviceList.add(advice);
		return ResultMessage.SUCCESSFUL;
	}
	public ResultMessage updateAdvice(AdviceFeedBackPO advice) {
		for(int i=0;i<adviceList.size();i++){
			AdviceFeedBackPO advicetemp = adviceList.get(i);
			if(advicetemp.getAdviceId()==advice.getAdviceId()){
				adviceList.remove(i);
				adviceList.add(i,advice);
			}
		}
		return ResultMessage.SUCCESSFUL;
	}
	public ArrayList<AdviceFeedBackPO> getAdvices(String userId) {
		return adviceList;
	}
	
	
}
