package org.testes.VWO;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.PageObjectModel.VWO.DashBoardPage;
import org.pages.PageObjectModel.VWO.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utils.WaitHelpers;

public class TestVWOLogin_01_Normal_POM {


 /*   @Owner("Tejas")
    @Description("verifing the Invalid Login, pass and error message")
    @Test
    public void test_negative_vwo_login(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        LoginPage loginPage = new LoginPage(driver);
       String error_msg =  loginPage.loginToVWOInvalidCreds("User@email.com", "12345");

       //Assertion
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Owner("Tejas")
    @Description("Verify that with valid email, pass,logins and open Dashboard page.")
    @Test
    public void test_positive_vwo_login() {

        // Driver Manager Code - 1 - D
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToVWOValidCreds("cxh04@tempumail.cc","ILoveDrive#08");
        // Assertions - 3 - V
        DashBoardPage dashboardPage = new DashBoardPage(driver);
        String userNameLoggedIn = dashboardPage.loggedInUserName();

        Assert.assertEquals(userNameLoggedIn,"Kishore J");
        driver.quit();
    }
*/
    @Owner("Tejas")
    @Description("Verify that with valid email, pass,logins and open Dashboard page.")
    @Test
    public void  free_trial_vwo_login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickStartFreeTrial();
        WaitHelpers.waitJVM(2000);



    }
}
