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
import pages.PopularPage;

import java.time.Duration;

public class PopularPageTest extends TestBase {
//    WebDriver driver;
//    LoginPage lp;
//    HeaderPage hd;
//    PopularPage pp;
//    @BeforeMethod
//    public  void setUp(){
//        driver=new ChromeDriver();
//        lp=new LoginPage(driver);
//        hd=new HeaderPage(driver);
//        pp=new PopularPage(driver);
//        driver.get("https://qamoviesapp.ccbp.tech");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        lp.login("rahul","rahul@2021");
//        hd.clickLinkPopular();
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
//        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='link-item']")));
//    }
//
//    @AfterMethod
//    public  void tearDown(){
//        driver.quit();
//    }
//

    //Test Popular movie images displayed or not
    @Test(priority = 1)
    public  void testPopularPageUI(){
        hd.clickLinkPopular();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='link-item']")));
        Assert.assertTrue(pp.arePopularMovieImgDisplayed(),"Popular Images are not displaying");
    }


    //Tst the count of Popular movie Image displayed
    @Test(priority = 2)
    public  void testCountOfPopularMovieImg(){
        hd.clickLinkPopular();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='link-item']")));
        Assert.assertEquals(pp.countOfPopularMovieImg(),30,"Mismatch in count of Popular Movie Images");
    }
}
