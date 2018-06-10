package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="updateLeadForm_industryEnumId" )
	private WebElement eleIndustryDropDown;
	
	public EditLeadPage selectIndustry(String data) {
		selectDropDownUsingText(eleIndustryDropDown,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleEditSubmit;
	
	public ViewLeadsPage clickEditSubmit() {
		click(eleEditSubmit);
		return new ViewLeadsPage();
	}
	
}
