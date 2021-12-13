package page;

import elements.DropDown;
import elements.Input;
import models.Account;
import models.AccountAddress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'inlineTitle')]");
    // String inputLocator = "//div[contains(@class, 'modal body')//span[text()='%s']/ancestor::div[contains(@class, uiInput)]//input";

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public AccountDetailsPage create(Account account, AccountAddress account2) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new Input(driver, "Description").write2(account.getDescription());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Employees").write3(account.getEmployees());
        new DropDown(driver, "Type").selectOption(account.getType());
        new DropDown(driver, "Industry").selectOption(account.getIndustry());

        new Input(driver, "Billing Address").write4(account2.getBillingAddress());
        new Input(driver, "Address enter").write6(account2.getAddressEnter());
        new Input(driver,"Billing Street").write5(account2.getBillingStreet());

        return clickSave();
    }

    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}


