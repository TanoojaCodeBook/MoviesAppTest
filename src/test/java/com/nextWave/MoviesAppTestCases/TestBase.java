package com.nextWave.MoviesAppTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class TestBase {

    WebDriver driver;
    LoginPage lp;
    HeaderPage hd;
    ActountPage ap;
    HomePage hp;
    MovieDetailspage mp;
    PopularPage pp;
    SearchPage sp;
    WebDriverWait wait;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
        hd = new HeaderPage(driver);
        ap = new ActountPage(driver);
        hp = new HomePage(driver);
        mp = new MovieDetailspage(driver);
        pp=new PopularPage(driver);
        sp = new SearchPage(driver);

        driver.get("https://qamoviesapp.ccbp.tech");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        lp.login("rahul","rahul@2021");
        
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
