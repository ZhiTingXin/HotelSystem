package presentation.controller.userManagementController;

import VO.HotelStaffVO;
import blservice.UserManagement_blservice;
import blservice.impl.UserManagement_bl;
import other.ResultMessage;
import presentation.view.userManagement_ui.HotelManagementControllerService;

public class HotelManagementController implements HotelManagementControllerService {

	private UserManagement_blservice hotelManagement_blservice;
	private String hotel_id;

	public HotelManagementController(String hotelId) {
		hotelManagement_blservice = new UserManagement_bl();
		this.hotel_id = hotelId;
	}

	public ResultMessage addNewHotel(String hotel_id) {

		return hotelManagement_blservice.addNewHotel(hotel_id);
	}

	public ResultMessage addHotelStaff(String hotel_id, HotelStaffVO hotelstaff) {

		return hotelManagement_blservice.addHotelStaff(hotel_id, hotelstaff);
	}

}
