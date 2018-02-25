package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC006_EditLead";
		testDescription="To edit a lead";
		testNodes="Leads";
		category="functional";
		authors="Kavitha";
		browserName="chrome";
		dataSheetName="TC007";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void mergeLeads(String uName,String pwd,String fName) {
		
		FindLeadsPage flp=new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.findByFirstName(fName);
		
			}


}
