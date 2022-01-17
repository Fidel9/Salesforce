package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownContact {

    String dropdownLocator2 = "//*[text()='Salutation']/..";
    String optionLocator2 = "//div[contains(@class, 'visible')]//span[text()='Mr.']";

    String dropdownLocator3 = "//label[text()='Account Name']/..";
    String optionLocator3 = "//div[contains(@class, 'visible')]//span[text()='TestAccountName']";

    WebDriver driver;
    String label;

    public DropDownContact(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }


    public void selectOption2(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocator2, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator2, option))).click();
    }
    public void selectOption3(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'\n", option, this.label);
        driver.findElement(By.xpath(String.format(dropdownLocator3, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator3, option))).click();
    }
}


