package presentation.controller.userManagementController;

import java.util.ArrayList;
import VO.SystemStaffVO;
import blservice.UserManagement_blservice;
import blservice.impl.UserManagement_bl;
import other.ResultMessage;
import presentation.view.userManagement_ui.SystemStaffManagementContrllerService;

public class SystemStaffManagementController implements SystemStaffManagementContrllerService{

	private UserManagement_blservice systemStaffManagement;
	private String systemstaff_id;

	public SystemStaffManagementController(String hotelStaff_id) {
		systemStaffManagement = new UserManagement_bl();
		this.systemstaff_id = hotelStaff_id;
	}
	
	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id) {
		return systemStaffManagement.getSystemStaff(systemstaff_id);
	}

	public ResultMessage modifySystemStaffManagement(SystemStaffVO systemstaff,SystemStaffVO systemstaffChange) {
		return systemStaffManagement.modifySystemStaffManagement(systemstaff, systemstaffChange);
	}

}
