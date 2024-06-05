package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovieDetailspage {
    WebDriver driver;

    public MovieDetailspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "movie-title")
    WebElement text_movieName_ele;
    @FindBy(className = "watch-time")
    WebElement text_wachtime_ele;
    @FindBy(className = "sensor-rating")
    WebElement text_sensorRating_ele;
    @FindBy(className = "release-year")
    WebElement text_releaseYear_ele;
    @FindBy(className = "movie-overview")
    WebElement text_movieOverview_ele;
    @FindBy(className = "play-button")
    WebElement btn_play_ele;

    public boolean isMovieNameDisplayed() {
        return text_movieName_ele.isDisplayed();
    }

    public boolean isWatchTimeDisplayed() {
        return text_wachtime_ele.isDisplayed();
    }

    public boolean isSensorRatingDisplayed() {
        return text_sensorRating_ele.isDisplayed();
}

    public boolean isReleaseYearDisplayed() {
        return text_releaseYear_ele.isDisplayed();
    }

    public boolean isMovieOverviewDisplayed() {
        return text_movieOverview_ele.isDisplayed();
    }

    public boolean isBtnPlayDisplayed() {
        return btn_play_ele.isDisplayed();
    }

}
