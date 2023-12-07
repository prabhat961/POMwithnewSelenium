package testCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.readConfig;

import java.time.Duration;

public class baseClass {

    readConfig readConfig= new readConfig();

    public String baseURL = readConfig.getApplicationURL();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();

    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br) {
        logger = Logger.getLogger("ebanking");
        PropertyConfigurator.configure("Log4j.properties");

        if (br.equals("chrome")) {
            driver = new ChromeDriver();
            ChromeOptions options = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            options.setBinary(readConfig.getCFTPath());
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PropertyConfigurator.configure("log4j.properties");
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
