package PO;

import java.util.ArrayList;

public class HotelInfoPO {
	String[] orderListId;
	String hotelID;
	String hotelName;
	String hotelDistrict;
	String hotelStaffId;
	HotelRoomInfoPO roomInfo;
	ArrayList<HotelStrategyPO> hotelStrategy;

	public ArrayList<OrderPO> getOrders() {
		return null;
	}

	public String getHotelID() {
		return hotelID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getHotelDistrict() {
		return hotelDistrict;
	}

	public  HotelRoomInfoPO getRooms() {
		return this.roomInfo;
	}

	public ArrayList<HotelStrategyPO> getHotelStrategy() {
		return this.hotelStrategy;
	}
}
