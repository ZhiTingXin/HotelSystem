package blservice.impl;

import PO.Label;
import java.util.ArrayList;

import PO.HotelInfoPO;
import PO.HotelRoomInfoPO;
import PO.Rank;
import PO.ResultMessage;
import blservice.Hotel_blservice;

public class Hotel_bl implements Hotel_blservice{

	public HotelInfoPO getHotelInfo(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage modifyHotelInfo(HotelInfoPO hotelInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getListOfHotelId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String addHotel(HotelInfoPO hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addHotelStaff(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage addAssessment(String hotelID, String assessment) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage addLabelAssessment(String hotelID,
			ArrayList<Label> labelList) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage addRankAssessment(String hotelID, Rank rank) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage roomModify(HotelRoomInfoPO currentInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public HotelRoomInfoPO getHotelRoomInfo(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Label> getLabelAssessment(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage deleteLabelAssessment(Label label) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getListOfHotelPrefer(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
