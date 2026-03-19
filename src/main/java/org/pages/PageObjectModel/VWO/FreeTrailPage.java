package org.pages.PageObjectModel.VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreeTrailPage {
    WebDriver driver;
    public FreeTrailPage(WebDriver driver) {
        this.driver = driver;
    }

    private By Email = By.id("page-v1-step1-email");
    private By CheckBox = By.xpath("//input[@data-qa='page-free-trial-step1-gdpr-consent-checkbox']");
    private By   CreateAccount = By.xpath("//button[@data-qa='page-su-submit']");


    public void ClickonFreeTrialAccount(String email) {
        driver.findElement(Email).sendKeys(email);
        driver.findElement(CheckBox).click();
        driver.findElement(CreateAccount).click();
    }
}
