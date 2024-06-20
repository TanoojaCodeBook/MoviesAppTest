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
import pages.HeaderPage;
import pages.LoginPage;

import java.time.Duration;

public class HeaderSectionTest extends TestBase {



    // Test the Header Section UI
    @Test(priority = 1)
    public void testHeaderSectionUI() {

        // Test the Website logo is displayed or not
        Assert.assertTrue(hd.isMoviesLogoDisplayed(), "Navabar Movies Img not displayed");

        //Test Home link is displayed or not
        Assert.assertTrue(hd.isLinkHomeDisplayed(), "Navabar Home Link not displayed");

        //Test the text of Home
        Assert.assertEquals(hd.getLinkHomeText(), "Home", "Mismatch in text Home");

        //Test Popular link is displayed or not
        Assert.assertTrue(hd.isLinkPopularDisplayed(), "Navbar Popular Link not displayed");

        //Test the text of Popular
        Assert.assertEquals(hd.getLinkPopularText(), "Popular", "Mismatch in text Popular");

        //Tesst the Searchbar link is displayed or not
       Assert.assertTrue(hd.isLinkSearchbtnDisplayed(), "Navbar searchbtnLink not displayed");

       //Test the profile link is displayed or not
        Assert.assertTrue(hd.isLinkProfileDisplayed(), "Navabar profile link not displayed");

    }


    // Test Header Section Functionalities
    @Test(priority = 2)
    public void testHeaderSectionFunctionality() {

        // Test the navigation to Popular page
        hd.clickLinkPopular();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qamoviesapp.ccbp.tech/popular", "Navigation to Popular page failed");

        // // Test the navigation to Home page
        hd.clickLinkHome();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qamoviesapp.ccbp.tech/", "Navigation to Home Page failed");

        // Test the navigation to Account page
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='avatar-img']")));
        hd.clickLinkProfile();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/account"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qamoviesapp.ccbp.tech/account", "Navigation to accounts page failed");
    }
}
