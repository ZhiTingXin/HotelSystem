package blservice;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import VO.SystemManagerVO;
import other.ResultMessage;

public interface UserInfo_blservice {

	public SystemManagerVO getSystemManagerInfo(String SystemManager_name);
	
	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager);
	
    public ResultMessage CustomerinfoModify(CustomerVO Customer,CustemorInfoChangeVO VO);
	
	public ResultMessage CustomerinfoShow(CustomerVO Customer);
}
