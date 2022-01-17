package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage{
          public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
         // String fieldValue = "//records-lws-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";
          String fieldValue = "//div[contains(@class,'test-id__record-layout-container')]";
    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    @Override
    public boolean isPageOpen2() {
        return false;
    }

    public String getFieldValueByName(String fieldName){
      return   driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }
}
