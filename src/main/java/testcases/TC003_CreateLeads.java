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

public class TC003_CreateLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeads";
		testDescription="create leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String cName, String fName, String lName, String eMail, String mobNum) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmButton()
		.clickLeadsTab()
		.clickCreateLead()
		.typeCName(cName)
		.typeFName(fName)
		.typeLName(lName)
		.typeEmail(eMail)
		.typeMobNum(mobNum)
		.clickSubmit()
		.verifyCreatedCName(cName)
		.verifyCreatedFName(fName)
		.verifyCreatedLName(lName);

	}

}
