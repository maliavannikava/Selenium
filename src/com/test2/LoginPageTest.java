package com.test2;

import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods{

	public static void main(String[] args) {
		//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard
		
		setUp();
		
		LoginPageElements login=new LoginPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.username, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		DashBoardPageElements dashboard=new DashBoardPageElements();

	}
}
