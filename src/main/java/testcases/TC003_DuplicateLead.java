package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DuplicateLead";
		testDescription="To duplicate a lead";
		testNodes="Leads";
		category="Sanity";
		authors="Kavitha";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String emailID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.findByEmail()
		.enterEmailID(emailID)
		.clickFindLeadsbutton()
		.selectFirstEntry()
		.clickDuplicateLead()
		.clickSubmit();
	
}
}
