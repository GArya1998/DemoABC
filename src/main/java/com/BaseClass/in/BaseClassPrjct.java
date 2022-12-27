package com.BaseClass.in;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassPrjct {

	public static WebDriver driver;// null driver

	// BROWSERLAUNCH
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vvmvk\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "//Firefox.exe");
			driver = new FirefoxDriver();

		} else {
			System.out.println("Check the browser");
		}
		driver.manage().window().maximize();
		return driver;
	}

	// fullscreen

	public static void fullScreenPage() {
		driver.manage().window().fullscreen();

	}

	// Get URL
	public static void getTheUrl(String url) {
		driver.get(url);
	}

	// Alert
	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertDismiss() {
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}

	// Actions

	public static void rightClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.contextClick(ele).build().perform();
	}

	// draganddrop

	public static void DragAndDropTheValue(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
	}

	// Mousehover

	public static void MoveToTheElement(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	// close

	public static void closeThePage() {
		driver.close();
	}
	// quit

	public static void quitTheBrowser() {
		driver.quit();

	}

	// getTitle
	public static void getTheTitle() {
		// driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
	}

	// getCurrentUrl
	public static void getTheCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	// NavigateBack
	public static void navigateBackPage() {
		driver.navigate().back();
	}

	// NavigateTo
	public static void navigateToPage(String url) {
		driver.navigate().to(url);
	}

	// NavigateForward
	public static void NavigateForwardPage() {
		driver.navigate().forward();
	}

	// Refresh
	public static void RefreshThePage() {
		driver.navigate().refresh();
	}

	public static void SwitchToFrame(int index) {
		driver.switchTo().frame(index);

	}
	// switchTo.defaultContent

	public static void SwitchToDefaultContent() {
		driver.switchTo().defaultContent();

	}

	// element methods
	// click---- clickOnElement

	public static void clickOnElement(WebElement ele) {
		ele.click();
	}

//sendkeys
	public static void enterValue(WebElement ele, String str) {
		ele.sendKeys(str);
	}

//getText
	public static void getTheText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}

//isSelected
	public static void isSelected(WebElement ele) {
		boolean selected = ele.isSelected();
		System.out.println(selected);
	}

	// isDisplayed
	public static void isDisplayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		System.out.println(displayed);
	}

	// dropdown(ele,string value,string i)
	public static void dropdown(WebElement ele, String value, String i) {
		Select s = new Select(ele);
		if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));

		}

		else if (value.equals("value")) {
			s.selectByValue(i);

		} else if (value.equals("text")) {
			s.selectByVisibleText(i);
		}
	}

}
