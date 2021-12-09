package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;
import static page.LoginPage.MENU_HOME_LINK;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        loginPage.open();
        loginPage.isPageOpen();
        loginPage.login("llev7208-1q4u@force.com", "Bobruisk2021");


        assertTrue(homePage.isPageOpen(), "Страница HomePage не открылась ");
    }

}
