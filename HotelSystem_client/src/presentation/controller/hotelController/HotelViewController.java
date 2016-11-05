package presentation.controller.hotelController;

import java.util.ArrayList;

import PO.ResultMessage;
import VO.HotelInfoVO;
import VO.SortMethod;
import blservice.Hotel_blservice;

public class HotelViewController {
	Hotel_blservice hotelService;

	public HotelInfoVO getHotelInfo(String hotelId) {
		return null;
	}

	public ResultMessage showHotelInfo(HotelInfoVO HotelInfo) {
		return null;
	}

	public String[] getListOfHotelId() {
		return null;

	}

	public ArrayList<HotelInfoVO> getListOfHotel(String[] hotelId) {
		return null;
	}

	public ResultMessage showHotelList(ArrayList<HotelInfoVO> list) {
		return null;

	}

	public ArrayList<HotelInfoVO> HotelListSort(SortMethod method,
			ArrayList<HotelInfoVO> list) {
		return list;

	}

	public String[] getListOfHotelPrefer(String userId) {
		return null;
	}

	public ResultMessage bookRoom(String hotelID) {
		return null;

	}
}
