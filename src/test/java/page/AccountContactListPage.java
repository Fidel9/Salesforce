package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountContactListPage extends BasePage{
    public static final By BREADFCRUMBS_LABEL_2 = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public AccountContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen2() {
        return isExist(BREADFCRUMBS_LABEL_2);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    public AccountContactListPage open() {
        driver.get(BASE_URL + "/lightning/o/Contact/home");
        return this;
    }

    public AccountModalPage clickNew(){
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
}
