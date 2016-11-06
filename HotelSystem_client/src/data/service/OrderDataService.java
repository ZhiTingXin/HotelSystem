package data.service;

import java.util.ArrayList;
import PO.OrderPO;


public interface OrderDataService {
	

	public OrderPO getOrder(int orderId);

	public ArrayList<OrderPO> getOrders(int hotelId);

	public boolean updateOrder(OrderPO orderPO);
	
	public boolean addOrderPo(OrderPO orderPO);

	public boolean deleteOrderPo(int orderID);
}
