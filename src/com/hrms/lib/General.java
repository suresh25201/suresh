package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
//Re-Usable fun:
public void openApp() {
System.setProperty("webdriver.gecko.driver", "G:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
  driver = new FirefoxDriver();
driver.navigate().to(url);
System.out.println("Application Opened"); //java-console
Reporter.log("Application opened"); //html Report
Log.info("Application Opened"); //log file
}
public void closeApp() {
	driver.close();
	System.out.println("Application closed");
	Log.info("Application closed");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(username);
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login Completed");
	Log.info("Login Completed");
}
public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Log.info("Logout Completed");
}
public void addEmp() {
	System.out.println("Add new emp");
	Log.info("Add emp");
}
public void delEmp() {
	System.out.println("Delete an emp");
	Log.info("Delete emp");
}
}
