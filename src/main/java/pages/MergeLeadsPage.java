package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class MergeLeadsPage extends SeMethods {

	public MergeLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLead;
	public FindLeadsPage clickFromLead()
	{
		click(eleFromLead);
		return new FindLeadsPage();
	}
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeads;
	public FindLeadsPage clickToLeads()
	{
		click(eleToLeads);
		return new FindLeadsPage();
}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
			private WebElement eleMergebutton;
	public ViewLeadsPage clickMerge()
	{
		
		click(eleMergebutton);
		acceptAlert();
		return new ViewLeadsPage();
	}
}

