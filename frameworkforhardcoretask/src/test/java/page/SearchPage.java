package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends AbstractPage {

    private final String SEARCH_URL ="https://cloud.google.com/s/results/?q=Google+Cloud+Platform+Pricing+Calculator&p=%2F";

    @FindBy (xpath="//b[contains(.,'Google Cloud Platform Pricing Calculator')]")
    private WebElement cloudCalculator;

    public SearchPage(WebDriver driver) {
        super(driver);

    }

    @Override
    public SearchPage openPage() {
        driver.navigate().to(SEARCH_URL);
        return this;
    }
    public CalculatorPage clickCloudCalculator(){
        cloudCalculator.click();
        return new CalculatorPage(driver);
    }
}
