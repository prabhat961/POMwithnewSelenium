package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.loginPage;

public class loginPageTest extends baseClass{
    @Test
    public void loginTest(){
        logger.info("URL is opened");

        loginPage lp=new loginPage(driver);
        lp.setUserName(username);
        logger.info("Entered username");

        lp.setPassword(password);
        logger.info("Entered password");

        lp.clickSubmit();

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
        {
            Assert.assertTrue(true);
            logger.info("Login test passed");
        }

    }
}
