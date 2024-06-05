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
import pages.*;

import java.time.Duration;

public class AccountPageTest extends TestBase  {
    //WebDriver driver;
   // LoginPage lp;
    //HeaderPage hd;
    //ActountPage ap;
   // WebDriverWait wait;

   // @BeforeMethod
   // public void setUp() {
//        driver = new ChromeDriver();
//        driver.get("https://qamoviesapp.ccbp.tech");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        lp = new LoginPage(driver);
//        hd = new HeaderPage(driver);
//        ap = new ActountPage(driver);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        lp.login("rahul", "rahul@2021");
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='avatar-img']")));
        //hd.clickLinkProfile();
       // wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/account"));
   // }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }


    //Test Account page UI
    @Test(priority = 1)
    public void testAccountPageUI() {

        hd.clickLinkProfile();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/account"));

        //Test Account Heading is displayed or not
        Assert.assertTrue(ap.isAccountHeadingDisplayed(), "Account Heading is not displayed");

        //Test Memeber ship is displayed or not
        Assert.assertTrue(ap.isMembershipDisplayed(), "Memeber ship text is not displayed");

        //Test Plan Details element is displayed or not
        Assert.assertTrue(ap.isPlanDetailsDisplayed(), "Plan details text is not displayed");

        //Test Premium element is displayed or not
        Assert.assertTrue(ap.isPremiumDisplayed(), "Premium text is not displayed");

        //Test UltraHd element is displayed or not
        Assert.assertTrue(ap.isultraHdDisplayed(), "UltraHd text is not displayed");

        //Test Logout button is displayed or not
        Assert.assertTrue(ap.isLogoutBtnDisplayed(), "Logout btn is not displayed");
    }

    //Tes Logout Functionality
    @Test(priority = 2)
    public void testLogoutFunctionality() {

        hd.clickLinkProfile();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/account"));

        // test the logout button is displayed or not
        ap.clickBtnLogout();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/login"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qamoviesapp.ccbp.tech/login", "Logout failed");
    }

}
