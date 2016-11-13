package MockObject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import other.ResultMessage;
import presentation.controller.userInfoController.CustomerinfoController;

public class CustomerTest {

	@Test
	public void testModifyShowCustomerInfo() {
		MockCustomer customer = new MockCustomer("151250000", "Xi JinPing", 100, 1);
		CustomerinfoController cus_con = new CustomerinfoController();
		ResultMessage res = cus_con.CustomerinfoShow(customer);

		assertEquals(ResultMessage.FAILED, res);
	}

	@Test
	public void testModifyCustomerInfo() {
		MockCustomer customer1 = new MockCustomer("151250001", "Mao ZeDong", 120, 10);
		MockCustomer customer2 = new MockCustomer("151250002", "JiangQing", 1, 2);
		CustomerinfoController cus_con = new CustomerinfoController();
		ResultMessage res = cus_con.CustomerinfoModify(customer1, null);

		assertEquals(ResultMessage.FAILED, res);
	}
}
