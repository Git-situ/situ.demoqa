package com.demoqa.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void waitTillElementPresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	@Override
	public void jsClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

}
