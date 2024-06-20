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
