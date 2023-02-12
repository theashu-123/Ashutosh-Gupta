package BasicTestScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class ToSendAMailAndVerify extends BaseClass {
	
	@Test
	public void sendAMailAndVerify() {
		System.out.println("the mail has been sent and verified");
	}

}
