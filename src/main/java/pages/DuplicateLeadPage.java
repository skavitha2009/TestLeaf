package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class DuplicateLeadPage extends SeMethods {

	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;
	public DuplicateLeadPage clickSubmit()
	{
		click(eleSubmit);
		return this;
	}
}

