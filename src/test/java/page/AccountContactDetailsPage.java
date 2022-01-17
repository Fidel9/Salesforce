package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class AccountContactDetailsPage extends BasePage{
        public static final By DETAILS_LINK_2 = By.xpath("//fieldset[@class='slds-form-element']");
       // String fieldValue2 = "//records-lws-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";

        public AccountContactDetailsPage(WebDriver driver) {
            super(driver);
        }

        @Override
        public boolean isPageOpen2() {
            return isExist(DETAILS_LINK_2);
        }

        @Override
        public boolean isPageOpen() {
            return false;
        }

        public String getFieldValueByName2(String fieldName){
            return   driver.findElement(By.xpath(String.format(fieldName))).getText();
        }
    }

