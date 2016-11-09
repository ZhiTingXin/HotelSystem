package VO;

import java.util.ArrayList;

import PO.HotelInfoPO;
import PO.HotelRoomInfoPO;
import PO.HotelStrategyPO;
import PO.Label;
import PO.Rank;

public class HotelInfoVO {
	String[] orderListId;
	String hotelID;
	String hotelName;
	String hotelDistrict;
	String hotelStaffId;
	HotelRoomInfoPO roomInfo;
	ArrayList<HotelStrategyPO> hotelStrategy;
	ArrayList<String> assessmentList;
	ArrayList<Rank> rankList;
	ArrayList<Label> labelList;

	public HotelInfoVO(HotelInfoPO hotelInfo) {
		// TODO Auto-generated constructor stub
	}

	public String getHotelId() {
		// TODO Auto-generated method stub
		return null;
	}

}
