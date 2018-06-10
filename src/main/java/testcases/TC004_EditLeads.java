package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC004_EditLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeads";
		testDescription="create leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String fName, String industry) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmButton()
		.clickLeadsTab()
		.clickFindLead()
		.typeSearchName(fName)
		.clickSearch()
		.clickSearchresult()
		.clickEditButton()
		.selectIndustry(industry)
		.clickEditSubmit()
		.verifyIndustry(industry);
	}

}
