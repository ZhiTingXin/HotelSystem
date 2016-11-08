package blservice;

import VO.SystemManagerVO;
import other.ResultMessage;

public interface UserInfo_blservice {

	public SystemManagerVO getSystemManagerInfo(String SystemManager_name);
	
	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager);
}
