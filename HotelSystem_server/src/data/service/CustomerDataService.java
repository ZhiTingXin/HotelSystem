package data.service;

import PO.CustomerPO;

public interface CustomerDataService {

	public CustomerPO getCustomerPO(String user_id);

	public boolean modifyCustomerPO(CustomerPO customerPO);
	
}
