package presentation.controller.userManagementController;

import java.util.ArrayList;

import VO.HotelStaffVO;
import blservice.UserManagement_blservice;
import blservice.impl.UserManagement_bl;
import other.ResultMessage;
import presentation.view.userManagement_ui.HotelStaffManagementControllerService;

public class HotelStaffManagementController implements HotelStaffManagementControllerService{

	private UserManagement_blservice hotelStaffManagement;
	private String hotelstaff_id;

	public HotelStaffManagementController(String hotelStaff_id) {
		hotelStaffManagement = new UserManagement_bl();
		this.hotelstaff_id = hotelStaff_id;
	}
	
	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id) {
		
		return hotelStaffManagement.getHotelStaffManagement(hotelstaff_id);
	}

	public ResultMessage modifyHotelStaffManagement(HotelStaffVO hotelstaff,HotelStaffVO hotelstaffChange) {
		return hotelStaffManagement.modifyHotelStaffManagement(hotelstaff, hotelstaffChange);
	}

	public ResultMessage modifyHotelStaffManagement(HotelStaffVO hotelstaff) {
		// TODO Auto-generated method stub
		return null;
	}

}
