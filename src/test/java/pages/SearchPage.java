package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    WebDriver driver;
    public  SearchPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}


@FindBy(className = "search-input-field")
    WebElement input_search_ele;
@FindBy(className = "search-button")
    WebElement btn_serch_ele;
@FindBy(className = "link-item")
    List<WebElement> img_search_result_ele;

public  void enterMovieName(String movieName){
    input_search_ele.sendKeys(movieName);
}
public  void clickBtnSearch(){
    btn_serch_ele.click();
}

public  int getTotalMoviesDisplayed(){
    return img_search_result_ele.size();
}

}
