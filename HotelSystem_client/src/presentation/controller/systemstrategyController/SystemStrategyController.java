package presentation.controller.systemstrategyController;

import java.util.ArrayList;

import VO.SystemStrategyVO;
import blservice.SystemStrategy_blservice;
import blservice.impl.SystemStrategy_bl;
import other.ResultMessage;
import presentation.view.systemStrategy_ui.SystemStrategyControllerService;

public class SystemStrategyController implements  SystemStrategyControllerService{
	
	private SystemStrategy_blservice systemStrategy_blservice;
	
	public SystemStrategyController(){
		systemStrategy_blservice  = new SystemStrategy_bl();
	}

	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String systemStaffID) {
		// TODO Auto-generated method stub
		return null;
	}

	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage deleteSystemStrategy(String systemStrategy_Name) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage modifySystemStrategy(SystemStrategyVO systemStrategy) {
		// TODO Auto-generated method stub
		return null;
	}

	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemStrategy) {
		// TODO Auto-generated method stub
		return null;
	}

}
