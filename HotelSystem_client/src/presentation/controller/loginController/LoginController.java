package presentation.controller.loginController;

import blservice.Login_blservice;
import blservice.impl.Login_bl;
import other.ResultMessage;
import presentation.view.login_ui.LoginControllerService;

public class LoginController implements LoginControllerService {

	private Login_blservice login_blservice;
	private String user_id;
	private String user_password;

	public LoginController(String userId, String userPassword) {
		login_blservice = new Login_bl();
		this.user_id = userId;
		this.user_password = userPassword;
	}

	public ResultMessage comfirm(String userId, String userPassword) {
		return login_blservice.comfirm(userId, userPassword);
	}

}
