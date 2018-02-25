package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLeads extends ProjectMethods{
		@BeforeTest
		public void setData() {
			testCaseName="TC004_MergeLead";
			testDescription="To merge two leads";
			testNodes="Leads";
			category="Sanity";
			authors="Kavitha";
			browserName="chrome";
			dataSheetName="TC005";
		}
		
		
		
		@Test(dataProvider="fetchData")
		public void mergeLeads(String uName,String pwd,String leadID1,String leadID2,String text) {
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRM()
			.clickLeads()
			.clickMergeLeads()
			.clickFromLead()
			.enterLeadID(leadID1)
			.clickFindLeadsbutton()
			.selectFirstLeadtoMerge()
			.clickToLeads()
			.enterLeadID(leadID2)
			.clickFindLeadsbutton()
			.selectFirstLeadtoMerge()
			.clickMerge()
			.clickFindLeadslink()
			.enterLeadID(leadID1)
			.clickFindLeadsbutton()
			.verifyText(text);
			
			
			
			
		
	}
}
