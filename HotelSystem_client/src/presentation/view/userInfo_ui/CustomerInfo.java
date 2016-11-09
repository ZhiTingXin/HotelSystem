package presentation.view.userInfo_ui;

import VO.CustemorInfoChangeVO;
import VO.CustomerVO;
import other.ResultMessage;

public interface CustomerInfo {
	public ResultMessage CustomerinfoModify(CustomerVO Customer,CustemorInfoChangeVO VO);
	
	public ResultMessage CustomerinfoShow(CustomerVO Customer);

}
