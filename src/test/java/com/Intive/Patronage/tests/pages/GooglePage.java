package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;



public class GooglePage {

    private static String GOOGLE_URL = "https://www.google.com/";
    private static String Automation_URL = "http://automationpractice.com/index.php";
    private static String ProductLink = "http://automationpractice.com/index.php?id_product=2&controller=product";
    private WebDriver driver;

    @FindBy(how = How.NAME, using = "q")
    public WebElement searchField;

    @FindBy(how = How.ID, using = "rcnt")
    public WebElement resultsWebPart;

    @FindBy (how = How.CLASS_NAME, using = "LC20lb")
    public WebElement firstSearchResult;

    //odnośniki

    @FindBy (how =How.ID, using = "contact-link")
    public WebElement ContactUsLink;

    @FindBy (how = How.CLASS_NAME, using = "header_user_info")
    public WebElement SignInLink;

    @FindBy (how = How.CLASS_NAME, using = "logout")
    public WebElement LogOutLink;

    @FindBy (how = How.CLASS_NAME, using = "account")
    public WebElement AccountLink;

    @FindBy (how = How.ID, using = "send_friend_button")
    public WebElement SendFriendLink;

    //@FindBy (how = How.XPATH, using = "Blouse")
    //public WebElement BlouseLink;

    //przyciski

    @FindBy (how = How.ID, using = "submitMessage")
    public WebElement SubmitButtonSend;

    @FindBy (how = How.ID, using = "SubmitLogin")
    public WebElement SubmitLogin;

    @FindBy (how = How.ID, using = "sendEmail")
    public WebElement SendFriendButton;

    //komunikaty

    @FindBy (how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertMessage;

    @FindBy (how = How.CLASS_NAME, using = "fancybox-inner")
    public WebElement successMessageSendToFriend;

    @FindBy (how = How.ID, using = "send_friend_form_error")
    public WebElement errorMessageSendToFriend;

    // dane

    @FindBy (how = How.ID, using = "email")
    public WebElement Email;

    @FindBy (how = How.ID, using = "passwd")
    public WebElement Password;

    public GooglePage(final WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openGooglePage() { driver.get(GOOGLE_URL); }

    public void openAutomationPage() {driver.get(Automation_URL);}

    public void productLink () {driver.get(ProductLink);}

    public void searchInGoogle(String searchPhrase)
    {
        searchField.sendKeys(searchPhrase);
        searchField.sendKeys(Keys.ENTER);
    }

    public void verifyIfResultsAreVisible() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultsWebPart));
    }
}
