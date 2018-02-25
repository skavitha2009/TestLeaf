package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="To delete a lead";
		testNodes="Leads";
		category="functional";
		authors="Kavitha";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void mergeLeads(String uName,String pwd,String PhoneNo,String text) {
		
		FindLeadsPage flp=new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.findByPhone()
		.enterPhoneNo(PhoneNo)
		.clickFindLeadsbutton();
		String firstResLead=flp.getTextFirstLead();
		flp.selectFirstEntry()
		.clickDelete()
		.clickFindLeads()
		.findByID(firstResLead)
		.clickFindLeadsbutton()
		.verifyText(text);
		
			}
}
