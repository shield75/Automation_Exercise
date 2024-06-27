package com.automation_exercise.pages;

import com.automation_exercise.tests.TestBasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.sql.RowSet;
import java.text.BreakIterator;

public class AccountCreatedPage{

    @FindBy(css = "h2[data-qa='account-created']")
    private WebElement accountCreated;

    @FindBy(css = "a[data-qa='continue-button']")
    private WebElement continueButton;

    public WebElement getAccountCreated() {
        return accountCreated;
    }

    private WebDriver driver;
    public AccountCreatedPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedHomePage continueButtonClick() {
        continueButton.click();
        return new LoggedHomePage(driver);
    }
}
