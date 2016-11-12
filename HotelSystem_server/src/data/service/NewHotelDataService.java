package data.service;

import PO.HotelInfoPO;

public interface NewHotelDataService {

	public boolean addNewHotelPO(HotelInfoPO NewHotelInfoPO);

	public boolean addNewHotelStaffPO(String user_id);
}
