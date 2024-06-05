package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActountPage {

    WebDriver driver;

    public ActountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "account-heading")
    WebElement text_accountHeading_ele;
    @FindBy(xpath = "//p[contains(text(),'Member ship')]")
    WebElement text_memberShip_ele;
    @FindBy(xpath = "//p[contains(text(),'Plan details')]")
    WebElement text_planDetails_ele;
    @FindBy(className = "plan-paragraph")
    WebElement text_premium_ele;
    @FindBy(className = "plan-details")
    WebElement text_ultraHd_ele;
    @FindBy(className = "logout-button")
    WebElement btn_logout_ele;

    public boolean isAccountHeadingDisplayed() {
        return text_accountHeading_ele.isDisplayed();
    }

    public boolean isMembershipDisplayed() {
        return text_memberShip_ele.isDisplayed();
    }

    public boolean isPlanDetailsDisplayed() {
        return text_planDetails_ele.isDisplayed();
    }

    public boolean isPremiumDisplayed() {
        return text_premium_ele.isDisplayed();
    }

    public boolean isultraHdDisplayed() {
        return text_ultraHd_ele.isDisplayed();
    }

    public boolean isLogoutBtnDisplayed() {
        return btn_logout_ele.isDisplayed();
    }

    public void clickBtnLogout() {
        btn_logout_ele.click();
    }
}
