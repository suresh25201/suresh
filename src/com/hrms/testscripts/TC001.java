package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
//public static void main(String args[]) {
	@Test
	public void tc001() {
	//Test Case Steps
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApp();
	obj.login();
	obj.logout();
	obj.closeApp();
}
}
