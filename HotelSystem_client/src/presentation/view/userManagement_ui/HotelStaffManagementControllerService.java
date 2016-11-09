package presentation.view.userManagement_ui;

import java.util.ArrayList;

import VO.HotelStaffVO;

public interface HotelStaffManagementControllerService {
	
	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id);

	public boolean modifyHotelStaffManagement(HotelStaffVO hotelstaff, HotelStaffVO hotelstaffChange);

}
