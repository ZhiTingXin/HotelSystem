package presentation.view.userManagement_ui;

import java.util.ArrayList;

import VO.CustomerVO;
import other.ResultMessage;

public interface CustomerManagementControllerService {
	
	public ArrayList<CustomerVO> getCustomer(String user_id);

	public ResultMessage modifyCustomerManagement(CustomerVO customer);

}
