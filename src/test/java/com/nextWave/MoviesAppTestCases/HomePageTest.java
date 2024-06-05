package com.nextWave.MoviesAppTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class HomePageTest extends TestBase {


//    WebDriver driver;
//    LoginPage lp;
//    HomePage hp;

//    @BeforeMethod
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        lp = new LoginPage(driver);
//        hp = new HomePage(driver);
//        driver.get("https://qamoviesapp.ccbp.tech");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        lp.login("rahul", "rahul@2021");
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }


    //Test the heading texts of each section
    @Test(priority = 1)
    public void testHeadingTextOfEachSection(){
        Assert.assertEquals(hp.getMoviesHeading(0).getText(), "Trending Now", "Mismatch in trending now text");
        Assert.assertEquals(hp.getMoviesHeading(1).getText(), "Originals", "Mismatch in originals text");
    }

    // Test whether the play button is displayed or not
    @Test(priority = 2)
    public void testPlayBtnIsDisplayed(){
        Assert.assertTrue(hp.isPalyBtnDisplayed(), "play btn no displayed");
    }

    // Test TrendingNow movies are displayed or not
    @Test(priority = 3)
    public void testTrendingNowMoviesAreDisplayed(){
        Assert.assertTrue(hp.areTrendingNowMoviesDisplayed(), "TrendingNow movies are not displayed");
    }

    //Test count of Trending now movies
    @Test(priority = 4)
    public void testCountOfTrendingNowMovies(){
        Assert.assertEquals(hp.countTrendingNowMovies(), 10, "mismatch in number of Trending now movies");
    }

    //Test Originals Movies are displayed or not
    @Test(priority = 5)
    public void testOriginalsMoviesAreDisplayed(){
        Assert.assertTrue(hp.areOriginalMoviesDisplayed(), "Originals movies are not displayed");
    }

    //Test count of Originals movies
    @Test(priority = 6)
    public void testCountOfOriginalsMovies(){
        Assert.assertEquals(hp.countOriginalMovies(), 10, "mismatch in number of Original movies");
    }


    // Test the Contact Us Section
    @Test(priority = 7)
    public  void testContactUsSection(){

        //Test the Contact us tex
        Assert.assertEquals(hp.getContactUstext(), "Contact Us", "Mismatch in Contact us text");

        // Test the ContactUs Icons are displayed or not
        Assert.assertTrue(hp.isIconGoogleDisplayed(),"Google Icon is not displayed");
        Assert.assertTrue(hp.isIconTwitterDisplayed(),"Twitter Icon is not displayed");
        Assert.assertTrue(hp.isIconInstagramDisplayed(),"Instagram Icon is not displayed");
        Assert.assertTrue(hp.isIconYoutubeDisplayed(),"Youtube Icon is not displayed");
    }

}
