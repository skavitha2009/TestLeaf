package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class FindLeadsPage extends SeMethods{
	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement eleEmailLink;
public FindLeadsPage findByEmail()
{
	click(eleEmailLink);
	return this;
}
@FindBy(how=How.NAME,using="emailAddress")
private WebElement eleEmailID;
public  FindLeadsPage enterEmailID(String emailID)
{
	type(eleEmailID, emailID);
	return this;
}
@FindBy(how=How.XPATH,using="//input[@name='id']")
private WebElement eleLeadID;
public FindLeadsPage enterLeadID(String leadID)
{
	type(eleLeadID, leadID);
	return this;
}

@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
private WebElement eleFindLeadsButton;
public FindLeadsPage clickFindLeadsbutton()
{
	click(eleFindLeadsButton);
	return this;
}
@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
private WebElement eleFirstEntry;
public  ViewLeadsPage selectFirstEntry()
{
	click(eleFirstEntry);
	return new ViewLeadsPage();
}
@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
private WebElement eleFirstLead;
public MergeLeadsPage selectFirstLeadtoMerge()
{
	click(eleFirstLead);
	return new MergeLeadsPage();
}
@FindBy(how=How.XPATH,using="xpath\", \"(//div[@class='x-paging-info'])[1]")
private WebElement eleFirstentry;
public FindLeadsPage verifyText(String text)
{
	verifyExactText(eleFirstEntry, text);
	return this;
}
@FindBy(how=How.LINK_TEXT,using="Phone")
private WebElement elePhone;
public FindLeadsPage findByPhone()
{
	click(elePhone);
	return this;
}
@FindBy(how=How.NAME,using="phoneNumber")
private WebElement elePhoneNumber;
public FindLeadsPage enterPhoneNo(String PhoneNo)
{
	type(elePhoneNumber, PhoneNo);
	return this;
}
@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
private WebElement eleFirstLeadText;
public String getTextFirstLead()
{
	String ele=getText(eleFirstLeadText);
	return ele;
	
}
@FindBy(how=How.NAME,using="id")
private WebElement eleID;
public FindLeadsPage findByID(String data)
{
	type(eleID, data);
	return this;
}
@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
private WebElement elefindbyFirstName;
public FindLeadsPage findByFirstName(String data)
{
	type(elefindbyFirstName, data);
	return this;
}
}
