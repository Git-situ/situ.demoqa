package com.demoqa.BasePage;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Action ac;
	Actions as;

	public Page(WebDriver js) {
		this.driver = js;
		this.wait = new WebDriverWait(js, Duration.ofSeconds(15));
		this.js = (JavascriptExecutor) js;
		as = new Actions(js);
	}

	public abstract void waitTillElementPresent(WebElement element);

	/**
	 * This method click on an webelement using javascript executer
	 * 
	 * @author SITU
	 */
	public abstract void jsClick(WebElement element);

}
