package blservice;

import PO.Label;
import java.util.ArrayList;

import PO.HotelInfoPO;
import PO.HotelRoomInfoPO;
import PO.Rank;
import PO.ResultMessage;

public interface Hotel_blservice {
	public HotelInfoPO getHotelInfo(String hotelId);

	public ResultMessage modifyHotelInfo(HotelInfoPO hotelInfo);

	public String[] getListOfHotelId();

	public String addHotel(HotelInfoPO hotel);

	public String addHotelStaff(String hotelId);

	public ResultMessage addAssessment(String hotelID, String assessment);

	public ResultMessage addLabelAssessment(String hotelID,
			ArrayList<Label> labelList);

	public ResultMessage addRankAssessment(String hotelID, Rank rank);

	public ResultMessage roomModify(HotelRoomInfoPO currentInfo);

	public HotelRoomInfoPO getHotelRoomInfo(String hotelId);

	public ArrayList<PO.Label> getLabelAssessment(String hotelId);

	public ResultMessage deleteLabelAssessment(Label label);

	public String[] getListOfHotelPrefer(String userId);

}
