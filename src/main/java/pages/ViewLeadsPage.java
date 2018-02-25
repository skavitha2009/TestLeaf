package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {
	
	public ViewLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	public FindLeadsPage clickFindLeadslink()
	{
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCName;
public ViewLeadsPage verifyCompanyName(String cName)
{
	verifyPartialText(eleCName, cName);
	return this;
}
@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
private WebElement eleDuplicateLead;
public DuplicateLeadPage clickDuplicateLead()
{
	click(eleDuplicateLead);
	return new DuplicateLeadPage();
}
@FindBy(how=How.LINK_TEXT,using="Delete")
private WebElement eleDeleteLink;
public MyLeadsPage clickDelete()
{
click(eleDeleteLink);
return new MyLeadsPage();
}
}
