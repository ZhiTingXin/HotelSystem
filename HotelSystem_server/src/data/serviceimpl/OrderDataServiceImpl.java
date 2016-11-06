package data.serviceimpl;

import java.util.ArrayList;

import PO.OrderPO;
import data.service.OrderDataService;

public class OrderDataServiceImpl implements OrderDataService{

	public OrderPO getOrder(int orderId) {
		return new OrderPO();
	}

	public ArrayList<OrderPO> getOrders(int hotelId) {
		ArrayList<OrderPO> aList = new ArrayList<OrderPO>();
		OrderPO tempPO = new OrderPO();
		aList.add(tempPO);
		return aList;
	}

	public boolean updateOrder(OrderPO orderPO) {
		return false;
	}

	public boolean addOrderPo(OrderPO orderPO) {
		return false;
	}

	public boolean deleteOrderPo(int orderID) {
		return false;
	}

}
