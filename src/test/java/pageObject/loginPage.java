package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver ldriver;

    public loginPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }



    @FindBy(xpath = "//img[@alt=\'Guru99 Demo Sites\']")
    @CacheLookup
    WebElement LoginPageLogo;

    @FindBy(xpath = "//td[@style=\'text-align:center;\'][1]")
    @CacheLookup
    WebElement LoginPageTestingLogo;

    @FindBy(xpath = "//td[@style=\'border:1px solid black;text-align:center;\'][1]")
    @CacheLookup
    WebElement LoginPageSeleniumLogo;

    @FindBy(xpath = "//td[@style=\'border:1px solid black;text-align:center;\'][2]")
    @CacheLookup
    WebElement LoginPageLiveProjectLogo;

    @FindBy(xpath = "//td[@style=\'text-align:center;\'][2]")
    @CacheLookup
    WebElement LoginPageJavaLogo;

    @FindBy(xpath = "//input[@name='uid']")
    @CacheLookup
    WebElement UsenameField;

    @FindBy(xpath = "//input[@name='password']")
    @CacheLookup
    WebElement PasswordField;

    @FindBy(xpath = "//input[@name='btnLogin']")
    @CacheLookup
    WebElement LoginBtn;

    @FindBy(xpath="//a[normalize-space()='Log out']")
    @CacheLookup
    WebElement lnkLogout;


    public void setUserName(String uname) {
        UsenameField.sendKeys(uname);
    }

    public void setPassword(String pwd) {
        PasswordField.sendKeys(pwd);
    }


    public void clickSubmit() {
        LoginBtn.click();
    }

    public void clickLogout() {
        lnkLogout.click();
    }

    public boolean loginPageLogoTest(){
        return LoginPageLogo.isDisplayed();
    }

    public boolean seleniumLogoTest(){
        return LoginPageSeleniumLogo.isDisplayed();
    }

    public boolean liveProjectLogoTest(){
        return LoginPageLiveProjectLogo.isDisplayed();
    }

    public boolean javaLogoTest(){
        return LoginPageJavaLogo.isDisplayed();
    }
}
