package presentation.controller.registerController;

import blservice.Login_blservice;
import blservice.Register_blservice;
import blservice.impl.Login_bl;
import blservice.impl.Register_bl;
import other.ResultMessage;
import presentation.view.register_ui.RegisterControllerService;

public class RegisterController implements RegisterControllerService {

	private Register_blservice register_blservice;
	private String user_id;
	private String user_password;

	public RegisterController(String userId, String userPassword) {
		register_blservice = new Register_bl();
		this.user_id = userId;
		this.user_password = userPassword;
	}
	
	public ResultMessage addRegister(String userID, String userpassword) {
		
		return register_blservice.addRegister(userID, userpassword);
	}

}
