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
import pages.SearchPage;

import java.time.Duration;

public class SearchPageTest extends TestBase {
//    WebDriver driver;
//    LoginPage lp;
//    HeaderPage hd;
//    SearchPage sp;
//    WebDriverWait wait;

//    @BeforeMethod
//    public void setUp() {
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        lp = new LoginPage(driver);
//        hd = new HeaderPage(driver);
//        sp = new SearchPage(driver);
//        driver.get("https://qamoviesapp.ccbp.tech");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        lp.login("rahul", "rahul@2021");
//    }

//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }

    //Test the search functionality with "Avatar" movie name
    @Test(priority = 1)
    public void testSearchFunctionalityTest1() {
        hd.clickLinkSearchBtn();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/search"));
        sp.enterMovieName("avatar");
        sp.clickBtnSearch();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("link-item")));
        Assert.assertEquals(sp.getTotalMoviesDisplayed(), 1, "mismatch in count of movies displayed");
    }

    //Test the search functionality with "No Time to Die" movie name
    @Test(priority = 2)
    public void testSearchFunctionalityTest2() {
        hd.clickLinkSearchBtn();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/search"));
        sp.enterMovieName("No Time to Die");
        sp.clickBtnSearch();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("link-item")));
        Assert.assertEquals(sp.getTotalMoviesDisplayed(), 1, "mismatch in count of movies displayed");
    }

}
