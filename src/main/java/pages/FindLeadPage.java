package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]" )
	private WebElement eleFNameSearch;

	public FindLeadPage typeSearchName(String data) {
		type(eleFNameSearch,data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='id']" )
	private WebElement eleIdSearch;

	public FindLeadPage typeSearchId(String data) {
		type(eleIdSearch,data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]" )
	private WebElement eleSearchButton;

	public FindLeadPage clickSearch() {
		click(eleSearchButton);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a" )
	private WebElement eleSearchresult;

	public ViewLeadsPage clickSearchresult() {
		click(eleSearchresult);
		return new ViewLeadsPage();
	}
	public String getFirstLeadId() {
		String str = getText(eleSearchresult);
		return str;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-paging-info'])" )
	private WebElement eleSearchNoResult;

	public FindLeadPage verifyNoResult() {
		verifyExactText(eleSearchNoResult, "No records to display");
		return this;
	}
}
