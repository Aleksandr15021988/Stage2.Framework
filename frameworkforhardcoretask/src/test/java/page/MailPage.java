package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


public class MailPage extends AbstractPage {

    private final  String MAIL_URL="https://10minutemail.net";

    @FindBy(xpath = "//*[@id='fe_text']")
    private WebElement mailAdressField;

    public MailPage(WebDriver driver) {
        super(driver);

    }
    public MailPage openPage () {
        driver.navigate().to(MAIL_URL);
        return this;
    }

    public String getMailAdress(){
        return mailAdressField.getAttribute("value");
    }

    public ReadMailPage openLetter(){
        longWaitToBeClickable("//a[text()[contains(.,'Google Cloud Platform Price Estimate')]]").click();
        return new ReadMailPage(driver);
    }
}
