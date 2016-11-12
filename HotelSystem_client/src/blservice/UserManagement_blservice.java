package blservice;

import java.util.ArrayList;

import VO.CustomerVO;
import VO.HotelStaffVO;
import VO.SystemStaffVO;
import other.ResultMessage;

public interface UserManagement_blservice {

	public ArrayList<CustomerVO> getCustomer(String user_id);

	public ResultMessage modifyCustomerManagement(CustomerVO customer, CustomerVO customerChange);

	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id);

	public ResultMessage modifyHotelStaffManagement(HotelStaffVO hotelstaff, HotelStaffVO hotelstaffChange);

	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id);

	public ResultMessage modifySystemStaffManagement(SystemStaffVO systemstaff, SystemStaffVO systemStaffChange);

	public ResultMessage addNewHotel(String hotel_id);

	public ResultMessage addHotelStaff(String hotel_id, HotelStaffVO hotelstaff);

}
