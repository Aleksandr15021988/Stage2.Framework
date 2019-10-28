package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends AbstractPage {

    private final String BASE_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//*[@id='searchbox']/input")
    private WebElement buttonSearch;

    @FindBy(xpath="//a[text()[contains(.,'Google Cloud Platform Pricing Calc')]]")
    private WebElement searchCalc;

    public String getBASE_URL() {
        return BASE_URL;
    }

    public MainPage(WebDriver driver) {
            super(driver);
    }

    public MainPage openPage () {
            driver.navigate().to(BASE_URL);
            return this;
    }
    public SearchPage inputAndFindDataInSearch () {
            buttonSearch.click();
            buttonSearch.sendKeys("Google Cloud Platform Pricing Calculator");
            searchCalc.click();
            return new SearchPage(driver);
    }
}