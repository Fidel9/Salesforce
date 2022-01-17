package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;

import models.AccountFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Log4j2
public class AccountTest extends BaseTest {

    @Test
    public void accountShouldBeCreated() {
        log.info("открываем основную страницу");
        loginPage
                .open()
                .login("llev7208-gnwy@force.com", "Bobruisk2021");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isAccountModalOpen, "папап не открыт");

       /* Account account = new Account("TestAccountName", "www.onliner.by", "Investor",
                "new account description.", "123-456", "1", "Apparel");*/

        Account account =  new AccountFactory().get();

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        assertTrue(isDetailsPageOpen, "Не открывается");

        assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "");
        assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(), "");
        assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "");
        assertEquals(accountDetailsPage.getFieldValueByName("Description"), account.getDescription(), "");
        assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(), "");
        assertEquals(accountDetailsPage.getFieldValueByName("Employees"), account.getEmployees(), "");
        assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(), "");

        log.info("закрываем тест");
    }
}
