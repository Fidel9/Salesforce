package page;

import elements.DropDown;
import elements.DropDownContact;
import elements.Input;
import elements.InputContact;
import models.Account;

import models.AccountContact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountContactModalPage extends BasePage{
    public static final By MODAL_TITLE_2 = By.xpath("//*[contains(@class, 'slds-modal__header')]");

    public AccountContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    @Override
    public boolean isPageOpen2() {
        return isExist(MODAL_TITLE_2);
    }

    public AccountContactDetailsPage create(AccountContact accountContact) {
        new InputContact(driver,"First Name").writeFirstName(accountContact.getFirstName());
        new InputContact(driver,"Last Name").writeLastName(accountContact.getLastName());
       // new InputContact(driver,"Account Name").writeAccountContactName(accountContact.getAccountName());
        new DropDownContact(driver, "Salutation").selectOption2(accountContact.getSalutation());
        new DropDownContact(driver,"Account Name").selectOption3(accountContact.getSalutation());
        new InputContact(driver,"Email").writeEmailContact(accountContact.getEmailContact());
        new  InputContact(driver,"Phone").writePhoneNumberContact(accountContact.getPhoneNumberContact());

        return clickSave();
    }

    public AccountContactDetailsPage clickSave() {
        driver.findElement(SAVE_CONTACT_BUTTON).click();
        return new AccountContactDetailsPage(driver);
    }
}
