package blservice.impl;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import VO.SystemManagerVO;
import blservice.UserInfo_blservice;
import other.ResultMessage;


public class UserInfo_bl implements UserInfo_blservice{

	public SystemManagerVO getSystemManagerInfo(String SystemManager_name) {
		
		return null;
	}

	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager) {
		
		return null;
	}

	public ResultMessage CustomerinfoModify(CustomerVO Customer, CustemorInfoChangeVO VO) {
		return ResultMessage.FAILED;
	}

	public ResultMessage CustomerinfoShow(CustomerVO Customer) {
		return ResultMessage.FAILED;
	}
}
