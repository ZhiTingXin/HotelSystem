package blservice.impl;

import blservice.Register_blservice;
import other.ResultMessage;

public class Register_bl implements Register_blservice{

	public ResultMessage addRegister(String userID, String userpassword) {
		
		return ResultMessage.SUCCESSFUL;
	}

}
