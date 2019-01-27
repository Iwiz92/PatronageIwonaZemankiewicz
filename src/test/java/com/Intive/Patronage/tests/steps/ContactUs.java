package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import com.Intive.Patronage.tests.pages.HomePagePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactUs extends DriverFactory {

    GooglePage googlePage = new GooglePage(driver);
    HomePagePage homePagePage = new HomePagePage(driver);

    @Given("^I open testautomation$")
    public void iOpenTestautomation() {
        googlePage.openAutomationPage();
       // homePagePage.SubmitButton.isDisplayed();
    }

    @When("^I press ContactUs link$")
    public void iPressContactUsLink() {
        googlePage.ContactUsLink.isDisplayed();
        googlePage.ContactUsLink.click();
    }

    @And("^I press Send button$")
    public void iPressSendButton() {
        googlePage.SubmitButtonSend.isDisplayed();
        googlePage.SubmitButtonSend.click();
    }

    @Then("^I see error pop-up$")
    public void iSeeErrorPopUp() {
       // Assert.assertFalse(googlePage.alertMessage.isDisplayed());
        Assert.assertTrue(googlePage.alertMessage.isDisplayed());

    }
}
