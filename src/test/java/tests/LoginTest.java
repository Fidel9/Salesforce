package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("llev7208-gnwy@force.com", "Bobruisk2021")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась ");
    }

}
