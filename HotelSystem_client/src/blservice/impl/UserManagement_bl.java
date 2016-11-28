package blservice.impl;

import java.util.ArrayList;
import VO.CustomerVO;
import VO.HotelStaffVO;
import VO.SystemStaffVO;
import blservice.UserManagement_blservice;

public class UserManagement_bl implements UserManagement_blservice {

	public ArrayList<CustomerVO> getCustomer(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modifyCustomerManagement(CustomerVO customer, CustomerVO customerChange) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modifyHotelStaffManagement(HotelStaffVO hotelstaff, HotelStaffVO hotelstaffChange) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<SystemStaffVO> getSystemStaff(String systemstaff_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modifySystemStaffManagement(SystemStaffVO systemstaff, SystemStaffVO systemStaffChange) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addNewHotel(String hotel_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addHotelStaff(String hotel_id, HotelStaffVO hotelstaff) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
