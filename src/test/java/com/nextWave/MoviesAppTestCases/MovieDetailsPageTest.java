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

public class MovieDetailsPageTest extends TestBase {

    //Test the TrendingNow movie page
    @Test(priority = 1)
    public void testTrendingNowMoviesPage() {

        //Navigating to Trendingnow movie details page
        hp.clickFirstTrendingNowMovie();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-title")));

        //Test Movie name is displayed or not
        Assert.assertTrue(mp.isMovieNameDisplayed(), "Movie name is not displayed");

        //Test Watch time is displayed or not
        Assert.assertTrue(mp.isWatchTimeDisplayed(), "Watching time is not displayed");

        //Test the Release year is displayed or not
        Assert.assertTrue(mp.isReleaseYearDisplayed(), "Release year not displayed");

        //Test the Overview is displayed or not
        Assert.assertTrue(mp.isMovieOverviewDisplayed(), "Movie overview not displayed");

        //Test the SensorRating is displayed or not
        Assert.assertTrue(mp.isSensorRatingDisplayed(), "SensorRating is not displayed");

        //Test the play button is displayed or not
        Assert.assertTrue(mp.isBtnPlayDisplayed(), "Play button is not displayed");
    }

    //Test the Originals movie page
    @Test(priority = 2)
    public void testOriginalsMoviePage() {
        //Navigating to Originals Movie page
        hp.clickOnFirstOriginalsMovie();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-title")));

        //Test Movie name is displayed or not
        Assert.assertTrue(mp.isMovieNameDisplayed(), "Movie name is not displayed");

        //Test Watch time is displayed or not
        Assert.assertTrue(mp.isWatchTimeDisplayed(), "Watching time is not displayed");

        //Test the Release year is displayed or not
        Assert.assertTrue(mp.isReleaseYearDisplayed(), "Release year not displayed");

        //Test the Overview is displayed or not
        Assert.assertTrue(mp.isMovieOverviewDisplayed(), "Movie overview not displayed");

        //Test the SensorRating is displayed or not
        Assert.assertTrue(mp.isSensorRatingDisplayed(), "SensorRating is not displayed");

        //Test the play button is displayed or not
        Assert.assertTrue(mp.isBtnPlayDisplayed(), "Play button is not displayed");
    }

}
