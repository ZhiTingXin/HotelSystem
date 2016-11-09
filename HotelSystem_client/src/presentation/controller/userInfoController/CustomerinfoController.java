package presentation.controller.userInfoController;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import other.ResultMessage;
import presentation.view.userInfo_ui.CustomerInfo;

public class CustomerinfoController implements CustomerInfo{

	public ResultMessage CustomerinfoModify(CustomerVO Customer, CustemorInfoChangeVO VO) {

		return ResultMessage.FAILED;
	}

	public ResultMessage CustomerinfoShow(CustomerVO Customer) {
		return ResultMessage.FAILED;
	}

}
