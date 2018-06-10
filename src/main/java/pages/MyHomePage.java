package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.LINK_TEXT,using="Leads" )
	private WebElement eleLeadsTab;
	@And("click Leads tab")
	public MyLeadsPage clickLeadsTab() {
		click(eleLeadsTab);
		return new MyLeadsPage();
	}
}
