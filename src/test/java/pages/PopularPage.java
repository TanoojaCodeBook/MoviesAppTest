package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PopularPage {

    WebDriver driver;
    public PopularPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//a[@class='link-item']")
List<WebElement> img_popularMovies_list;

    public boolean arePopularMovieImgDisplayed(){
        boolean result=false;
        for(WebElement eachMovieImg: img_popularMovies_list){
            if(eachMovieImg.isDisplayed()){
                result=true;
            }
        }
        return  result;
    }

    public int countOfPopularMovieImg(){
        return  img_popularMovies_list.size();
    }

    public  void clickOnFirstPopularMovie(){
        img_popularMovies_list.get(0).click();
    }
}
