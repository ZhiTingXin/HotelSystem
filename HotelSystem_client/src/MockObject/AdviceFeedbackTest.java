package MockObject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import other.AdviceFeedBackState;
import presentation.controller.adviceFeedBackController.AdvicefeedbackController;

public class AdviceFeedbackTest{

	@Test
	public void testGetAdvice(){
		MockAdviceFeedback advice = new MockAdviceFeedback("建议修改网站的某些功能", AdviceFeedBackState.PROCESSED, "15");
		AdvicefeedbackController con = new AdvicefeedbackController();
		con.add(advice);
		assertEquals("15",con.getID());
	}
}
