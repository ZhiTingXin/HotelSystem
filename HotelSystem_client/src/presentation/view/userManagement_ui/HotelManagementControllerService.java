package presentation.view.userManagement_ui;

import VO.HotelStaffVO;
import other.ResultMessage;

public interface HotelManagementControllerService {

	public ResultMessage addNewHotel(String hotel_id);

	public ResultMessage addHotelStaff(String hotel_id, HotelStaffVO hotelstaff);

}
