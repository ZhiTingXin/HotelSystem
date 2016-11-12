package presentation.controller.userManagementController;

import java.util.ArrayList;
import other.ResultMessage;
import VO.CustomerVO;
import blservice.UserManagement_blservice;
import blservice.impl.UserManagement_bl;
import presentation.view.userManagement_ui.CustomerManagementControllerService;

public class CustomerManagementController implements CustomerManagementControllerService{

	private UserManagement_blservice userManagement_blservice;
	private String userId;
	
	public CustomerManagementController(String user_id){
		userManagement_blservice = new UserManagement_bl();
		this.userId = user_id;
	}
	
	public ArrayList<CustomerVO> getCustomer(String user_id) {
		return userManagement_blservice.getCustomer(user_id);
	}

	public  ResultMessage modifyCustomerManagement(CustomerVO customer) {
		return ResultMessage.FAILED;
	}

}
