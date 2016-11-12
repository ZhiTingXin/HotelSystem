package blservice.impl;

import blservice.Login_blservice;
import other.ResultMessage;

public class Login_bl implements Login_blservice {

	public ResultMessage comfirm(String user_id, String user_password) {
		if (user_id == "15105199359" && user_password == "qwet1234")
			return ResultMessage.SUCCESSFUL;
		else
			return ResultMessage.SUCCESSFUL;
	}

}
