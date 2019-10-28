package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    private final int WAIT_TIME_OUT = 10;
    private final int LONG_WAIT_TIME_OUT = 180;

    protected WebDriver driver;

    protected abstract AbstractPage openPage();

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    protected WebElement longWaitToBeClickable(String xpath) {
        return  new WebDriverWait(driver, LONG_WAIT_TIME_OUT)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    protected WebElement waitToBeClickable(String xpath) {
        return  new WebDriverWait(driver, WAIT_TIME_OUT)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    protected WebElement waitToBePresenceOfElementLocated(String xpath) {
        return  new WebDriverWait(driver, WAIT_TIME_OUT)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
}