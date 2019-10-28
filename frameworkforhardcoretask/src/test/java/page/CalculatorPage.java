package page;
import util.XpathForCalculatorValueCreator;
import model.CalculatorData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import service.CalculatorDataCreator;

public class CalculatorPage extends AbstractPage {

    private final String CALC_URL ="https://cloud.google.com/products/calculator/";
    private XpathForCalculatorValueCreator xpathForCalculatorValueCreator =new XpathForCalculatorValueCreator();
    private CalculatorData calculatorData = CalculatorDataCreator.withCredentialsFromProperty();

    @FindBy(xpath = "//div/div/div/div/div")
    private WebElement searchForAProduct;

    @FindBy(xpath = "//*[@id='input_53']")
    private WebElement fieldNumberOfInstanse;

    @FindBy(xpath = "//span[contains(.,'Free: Debian, CentOS, CoreOS')]")
    private WebElement fieldOperatingSystem;

    @FindBy(xpath = "//span[contains(.,'Regular')]")
    private WebElement fieldMachineClass;

    @FindBy(xpath = "//span[contains(.,'f1-micro')]")
    private WebElement fieldMachineType;

    @FindBy(xpath = "//md-checkbox/div")
    private WebElement fieldAddGPU;

    @FindBy(xpath = "//*[@id='select_value_label_346']")
    private WebElement fieldNumberOfGPU;

    @FindBy(xpath = "//span[contains(.,'NVIDIA Tesla K80')]")
    private WebElement fieldGPUType;

    @FindBy(xpath = "//*[@id='select_value_label_50']/span[1]")
    private WebElement fieldLocalSSD;

    @FindBy(xpath = "//span[contains(.,'Iowa')]")
    private WebElement fieldDataCenterLocation;

    @FindBy(xpath = "//span[contains(.,'None')]")
    private WebElement fieldCommitetUsage;

    @FindBy(xpath = "//div[13]/button")
    private WebElement buttonAddToEstimate;

    @FindBy(xpath = "//button[contains(.,'Email Estimate')]")
    private WebElement buttonEmailEstimate;

    @FindBy(xpath = "//div[3]/md-input-container/input")
    private WebElement fieldEmail;

    @FindBy(xpath = "//b[contains(.,'Total')]")
    private WebElement totalCost;

    @FindBy(id="myFrame")
    private WebElement switchFrame;

    @FindBy(xpath = "//button[contains(.,'Send Email')]")
    private WebElement sendEmail;

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[3]/div")
    private WebElement valueOfMachineTypeFromTable;




    public WebElement getTotalCost()
    {
        return totalCost;
    }

    public CalculatorPage(WebDriver driver) {
        super(driver);

    }
    public CalculatorPage openPage (){
        driver.navigate().to(CALC_URL);
        driver.switchTo().frame(switchFrame);
        return this;
    }
    public void switchFrame(){
            driver.switchTo().frame(switchFrame);
    }

    public void pasteEmail(String Email){
         fieldEmail.click();
         fieldEmail.sendKeys(Email);
    }

    public void sendEmail(){
        sendEmail.click();

    }

    public void findAndClickCalculatorElements(){
        searchForAProduct.click();
        fieldNumberOfInstanse.sendKeys("4");
        fieldOperatingSystem.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfOperatingSystem()).click();
        fieldMachineClass.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfMachineClass()).click();
        fieldMachineType.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfMachineType()).click();
        fieldAddGPU.click();
        fieldNumberOfGPU.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfNumberOfGPU()).click();
        fieldGPUType.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfGPUType()).click();
        fieldLocalSSD.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfLocalSSD()).click();
        fieldDataCenterLocation.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfDatacenterLocation()).click();
        fieldCommitetUsage.click();
        waitToBeClickable(xpathForCalculatorValueCreator.getXpathLocatorForValueOfCommitedUsage()).click();
        buttonAddToEstimate.click();
        buttonEmailEstimate.click();
    }


    public String getValueOfMachineTypeFromTable() {
        return valueOfMachineTypeFromTable.getText();
    }

    public String getValueOfMachineTypeFromDropDown() {
        return waitToBePresenceOfElementLocated(xpathForCalculatorValueCreator.getXpathLocatorForValueOfMachineType())
                .getText();
    }
}
