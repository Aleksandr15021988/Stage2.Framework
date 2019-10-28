package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReadMailPage extends AbstractPage {

    private final String READ_MAIL_PAGE_URL = "https://10minutemail.net/readmail.html?mid=WR0bvu";

    @FindBy(xpath = "//h3[contains(text(),'USD')]")
    private WebElement totalCost;


    public WebElement getTotalCost() {
        return totalCost;
    }

    public ReadMailPage(WebDriver driver) {
        super(driver);

    }

    public ReadMailPage openPage () {
        driver.navigate().to(READ_MAIL_PAGE_URL);
        return this;
    }
}
