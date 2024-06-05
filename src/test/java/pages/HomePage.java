package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(className = "movies-list-heading")
    List<WebElement> moviesHeadingsList_eles;

    @FindBy(className = "home-movie-play-button")
    WebElement btn_play_ele;

    @FindBy(xpath = "//h1[contains(text(),'Trending Now')]/following-sibling::div/descendant::img")
    List<WebElement> trendingNowMoviesList_eles;

    @FindBy(xpath = "//h1[contains(text(),'Originals')]/following-sibling::div/descendant::img")
    List<WebElement> originalMoviesList_eles;

    @FindBy(className = "contact-us-paragraph")
    WebElement textContactus_ele;

    @FindBy(css = "svg[class *='icon-element google-']")
    WebElement icon_google_ele;

    @FindBy(css = "svg[class *='icon-element twitter-ic']")
    WebElement icon_twitter_ele;

    @FindBy(css = "svg[class *='icon-element instagram-']")
    WebElement icon_instagram_ele;

    @FindBy(css = "svg[class *='icon-element youtube-']")
    WebElement icon_youtube_ele;

    public WebElement getMoviesHeading(int index) {
        return moviesHeadingsList_eles.get(index);
    }

    public boolean isPalyBtnDisplayed() {
        return btn_play_ele.isDisplayed();
    }

    public boolean areTrendingNowMoviesDisplayed() {
        boolean result = false;
        for (WebElement eachMovie : trendingNowMoviesList_eles) {
            if (eachMovie.isDisplayed()) {
                result = true;
            }
        }
        return result;

    }


    public boolean areOriginalMoviesDisplayed() {
        boolean result = false;
        for (WebElement eachMovie : originalMoviesList_eles) {
            if (eachMovie.isDisplayed()) {
                result = true;
            }
        }
        return result;
    }

    public int countTrendingNowMovies() {
        return trendingNowMoviesList_eles.size();
    }

    public int countOriginalMovies() {
        return originalMoviesList_eles.size();
    }

    public String getContactUstext() {
        return textContactus_ele.getText();
    }

    public void clickFirstTrendingNowMovie() {
        trendingNowMoviesList_eles.get(0).click();

    }

    public void clickOnFirstOriginalsMovie(){
        originalMoviesList_eles.get(0).click();
    }

    public boolean isIconGoogleDisplayed() {
        return icon_google_ele.isDisplayed();
    }

    public boolean isIconTwitterDisplayed() {
        return icon_twitter_ele.isDisplayed();
    }

    public boolean isIconInstagramDisplayed() {
        return icon_instagram_ele.isDisplayed();
    }

    public boolean isIconYoutubeDisplayed() {
        return icon_youtube_ele.isDisplayed();
    }
}
