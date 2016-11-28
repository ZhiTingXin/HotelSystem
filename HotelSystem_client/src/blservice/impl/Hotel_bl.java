package blservice.impl;

import java.util.ArrayList;

import PO.HotelPO;
import PO.HotelRoomInfoPO;
import PO.Label;
import PO.Rank;
import VO.HotelInfoVO;
import blservice.Hotel_blservice;
import data.service.HotelDataService;
import other.ResultMessage;

public class Hotel_bl implements Hotel_blservice {

	public HotelPO getHotelInfo(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage modifyHotelInfo(HotelPO hotelInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getListOfHotelId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String addHotel(HotelPO hotel) {
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

	public ResultMessage addLabelAssessment(String hotelID, ArrayList<Label> labelList) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage addRankAssessment(String hotelID, Rank rank) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage roomModify(String hotelId, HotelRoomInfoPO currentInfo) {
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

	public ResultMessage deleteLabelAssessment(String hotelId, Label label) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getListOfHotelPrefer(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
