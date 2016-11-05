package blservice;

import java.util.ArrayList;

import PO.ResultMessage;
import VO.HotelStrategyVO;

public interface HotelStrategy_blservice {
	public ResultMessage makeHotelStrategy(HotelStrategyVO hotelstrategy);

	public ResultMessage modifyHotelStrategy(HotelStrategyVO hotelstrategy);

	public ResultMessage deleteHotelStrategy(String hotelStrategyId);

	public HotelStrategyVO getHotelStrategy(String HotelStrategyId);
	
	public ArrayList<HotelStrategyVO>getListOfHotelStrategys(String hotel_id);
	
}
