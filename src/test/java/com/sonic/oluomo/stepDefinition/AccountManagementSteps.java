package com.sonic.oluomo.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementSteps {
    WebDriver driver;
    @Given("^user is on create an account page$")
    public void userIsOnCreateAnAccountPage() {
        // to define browser
        WebDriverManager.chromedriver().setup();
        // open browser
         driver = new ChromeDriver();
        // launch ecommerce application
        driver.get("https://demo-m2.bird.eu/");

        // maximise browser window
        driver.manage().window().maximize();
        //click create an account
        driver.findElement(By.linkText("Create an Account")).click();

    }

    @When("^user enter \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void userEnterAndAndAndAnd(String FirstName , String LastName, String Email, String Password, String ConfirmPassword ) throws Throwable {
       driver.findElement(By.id("firstname")).sendKeys(FirstName);
       driver.findElement(By.id("lastname")).sendKeys(LastName);
       driver.findElement(By.id("email_address")).sendKeys(Email);
       driver.findElement(By.id("password")).sendKeys(Password);
       driver.findElement(By.id("password-confirmation")).sendKeys(ConfirmPassword);


    }


    @And("^user clicks on create an account$")
    public void userClicksOnCreateAnAccount() {

        driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();
    }

    @Then("^My account page is displayed$")
    public void myAccountPageIsDisplayed() {
        String expectedPageTitle = "My Account";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);





    }

    @Given("^user is on account login page$")
    public void userIsOnAccountLoginPage() {
        // to define browser
        WebDriverManager.chromedriver().setup();
        // open browser
        driver = new ChromeDriver();
        // launch ecommerce application
        driver.get("https://demo-m2.bird.eu/");
        // maximise browser window
        driver.manage().window().maximize();
        //click create an account
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterAnd(String Username, String Password) throws Throwable {


       driver.findElement(By.name("login[username]")).sendKeys(Username);
       driver.findElement(By.name("login[password]")).sendKeys(Password);
    }

    @And("^User clicks on login button$")
    public void userClicksOnLoginButton() {
        driver.findElement(By.cssSelector("#send2 > span")).click();




    }

    @Then("^login  is successfully$")
    public void userLoginPageIsDisplayed() {
        String expectedPageTitle = "Home Page";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);


    }



    @Given("^user is on update customer details page$")
    public void userIsOnUpdateCustomerDetailsPage() {
        // to define browser
        WebDriverManager.chromedriver().setup();
        // open browser
        driver = new ChromeDriver();
        // launch ecommerce application
        driver.get("https://demo-m2.bird.eu/");
        // maximise browser window
        driver.manage().window().maximize();
        //click create an account
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("^user clicks on sign in link$")
    public void userClicksOnSignInLink() {
        driver.findElement(By.cssSelector("#send2 > span")).click();
    }

    @And("^user click on login button$")
    public void userClickOnLoginButton() {
    }

    @Then("^update customer details page is displayed$")
    public void updateCustomerDetailsPageIsDisplayed() {
    }
}
