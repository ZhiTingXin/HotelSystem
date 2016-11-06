package presentation.view.order_ui;

import java.util.ArrayList;

import VO.OrderVO;
import VO.PrivilegeVO;
import VO.ResultMessage;
import VO.RoomType;
import VO.OrderState;

public interface Order {
	public OrderState getState(String orderID);
	public OrderVO getOrder(String orderID);
	public ArrayList<OrderVO> getOrdersOfUsers(String userID);
	public OrderVO createOrder(OrderVO order_info);
	public ResultMessage changeState(OrderVO order_info);
	public ArrayList<OrderVO> getUnfinishedOrders(String userID);
	public ArrayList<OrderVO> getAbnomalOrders(String userID);
	public ArrayList<OrderVO> getHotelOrders(String userID,String hotelID);
	

}
