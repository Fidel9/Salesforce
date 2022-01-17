package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputContact {

    String firstName = "//input[@name='firstName']";
    String lastName = "//input[@placeholder='Last Name']";

    //String accountContactName = "//*[text()='Recent Accounts']";

    String emailContact = "//input[@inputmode='email']";
    String phoneNumberContact = "//input[@name='Phone']";

    WebDriver driver;
    String label;

    public InputContact(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

   /* public void writeContact(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(inputFieldContact, this.label))).sendKeys(text);
    }*/
    public void writeFirstName(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(firstName, this.label))).sendKeys(text);
    }
    public void writeLastName(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(lastName, this.label))).sendKeys(text);
    }
    /*public void writeAccountContactName(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(accountContactName, this.label))).sendKeys(text);
    }*/
    public void writeEmailContact(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(emailContact, this.label))).sendKeys(text);
    }
    public void writePhoneNumberContact(String text) {
        System.out.printf("Writing text '%s' into input with label '%s'", text, this.label);
        driver.findElement(By.xpath(String.format(phoneNumberContact, this.label))).sendKeys(text);
    }
}

