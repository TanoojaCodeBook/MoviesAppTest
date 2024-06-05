package com.nextWave.MoviesAppTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class LoginPageTest  {

    WebDriver driver;
    LoginPage lp;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
        driver.get("https://qamoviesapp.ccbp.tech");
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

  //Test the Login page UI
    @Test(priority = 1)
    public void testLoginPageUI() {

        //Test the website logo is displayed or not
        Assert.assertTrue(lp.isLogoDisplayed(), "WebsiteLogo is not displayed");

        //Test Heading Login is displayed or not
        Assert.assertTrue(lp.isHeadingLoginDisplayed(), "Heading Login is not displaying");

        //Test the Login text
        Assert.assertEquals(lp.getTextLogin(), "Login", "Login text is mismatch");

        //Test UserName label is displayed or not
        Assert.assertTrue(lp.isUsernameLabelDisplayed(), "Username label is not displaying");

        //Test UserName label text
        Assert.assertEquals(lp.getUserNameLabelText(), "USERNAME", "USERNAME text mismatch");

        //Test Password label is displayed or not
        Assert.assertTrue(lp.isPasswordLabelDisplayed(), "Password label is not displaying");

        //Test Password label text
        Assert.assertEquals(lp.getPasswordLabelText(), "PASSWORD", "PASSWORD text mismatch");

        //Test Login button is displayed or not
        Assert.assertTrue(lp.isLoginBtnDisplayed(), "Login Button is not displaying");
    }

    //Test Login Functionality with empty inputs fields
    @Test(priority = 2)
    public void testLoginFunctionalityWithEmptyFields() {
        lp.clickBtnLogin();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        Assert.assertEquals(lp.getErrorMessage(), "*Username or password is invalid", "Login with empty fields failed");
    }

    //Test Login Functionality with empty password
    @Test(priority = 3)
    public void testLoginFunctionalityWithEmptyPassword() {
        lp.enterUserName("rahul");
        lp.clickBtnLogin();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        Assert.assertEquals(lp.getErrorMessage(), "*Username or password is invalid", "Login with empty password failed");
    }

    //Test Login Functionality with empty username
    @Test(priority = 4)
    public void testLoginFunctionalityWithEmptyUsername() {
        lp.enterPassword("rahul@2021");
        lp.clickBtnLogin();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        Assert.assertEquals(lp.getErrorMessage(), "*Username or password is invalid", "Login with empty username failed");
    }

    //Test Login Functionality with Invalid Credentials
    @Test(priority = 5)
    public void testLoginFunctionalityWithInvalidCredentials() {
        lp.enterUserName("rahul");
        lp.enterPassword("rahul");
        lp.clickBtnLogin();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error-message']")));
        Assert.assertEquals(lp.getErrorMessage(), "*username and password didn't match", "Login with invalid credentilas failed");
    }

    //Test Login Functionality with Valid Credentials
    @Test(priority = 6)
    public void testLoginFunctionalityWithValidCredentials() {
        lp.login("rahul", "rahul@2021");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qamoviesapp.ccbp.tech/", "LoginFailed urls not matching");
    }


}
