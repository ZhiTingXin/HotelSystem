package presentation.view.userManagement_ui;

import java.util.ArrayList;

import VO.SystemStaffVO;
import other.ResultMessage;

public interface SystemStaffManagementContrllerService {
	
	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id);

	public ResultMessage modifySystemStaffManagement(SystemStaffVO systemstaff,SystemStaffVO systemstaffChange);

}
