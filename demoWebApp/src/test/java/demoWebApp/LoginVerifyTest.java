package demoWebApp;

import static org.junit.Assert.*;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import web.servlets.LoginVerify;

@ExtendWith(AemContextExtension.class)
public class LoginVerifyTest {

	private LoginVerify loginVerif;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@Before
	public void loginTest() {
		loginVerif=new LoginVerify();		
	}
	
	@Test
	public void correctUserNameRequest() {
		
	}

}
