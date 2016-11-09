package data.service;

import PO.HotelStaffPO;

public interface HotelStaffDataService {

	public HotelStaffPO getHotelStaffPO(String user_id);

	public boolean modifyHotelStaffPO(HotelStaffPO hotelPO);
	
}
