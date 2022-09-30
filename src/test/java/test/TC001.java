package test;

import utils.ReadProperties;

public class TC001 {

	public static void main(String[] args) {
		System.out.println(ReadProperties.readConfigProperties("url"));
		System.out.println(ReadProperties.readObjectProperties("LoginPage", "Login.username.Textbox.id"));
		System.out.println(ReadProperties.readObjectProperties("HomePage", "Home.Dashboard.Link.LinkText"));
	}

}