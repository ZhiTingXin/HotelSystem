package presentation.controller.userInfoController;

import VO.SystemManagerVO;
import blservice.UserInfo_blservice;
import other.ResultMessage;
import presentation.view.userInfo_ui.SystemManagerInfoControllerService;


public class SystemManagerInfoController implements SystemManagerInfoControllerService{

	private UserInfo_blservice systemManagerInfoService;
	public ResultMessage modifySystemManagerInfo(SystemManagerVO systemManager) {
		
		return  systemManagerInfoService.modifySystemManagerInfo(systemManager);
	}

	public SystemManagerVO getSystemManagerInfo(String systemManager_Name) {
		
		return systemManagerInfoService.getSystemManagerInfo(systemManager_Name);
	}

}
