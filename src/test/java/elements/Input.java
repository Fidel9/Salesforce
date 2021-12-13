package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    String inputLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input";

    String inputTextarea = "//textarea[@class=' textarea']";
    String inputEmployees = "//input[@data-aura-class='uiInputSmartNumber']";

    String inputBillingAddress = "//span[@class='searchLabel']";
    String closeBillingAddress = "//button[@title='Close']";
    String inputBillingStreet = "//textarea[@placeholder='Billing Street']";


    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);
    }

    public void write2(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(inputTextarea, this.label))).sendKeys(text);
    }

    public void write3(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(inputEmployees, this.label))).sendKeys(text);
    }
    public void write4(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(inputBillingAddress, this.label))).click();
    }
    public void write6(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(closeBillingAddress, this.label))).click();
    }
    public void write5(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(inputBillingStreet, this.label))).sendKeys();
    }
}
