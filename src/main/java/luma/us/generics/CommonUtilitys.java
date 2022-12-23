package luma.us.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import luma.us.basepage.Basepage;

public class CommonUtilitys extends Basepage {

	//for any clickable method i need to use this method
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
	}

	public static void getAssert(String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println("Verified Actual and Expected");
	}

	//for mouseHover 
	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}
	
	// Select value from Drop down
	public static void getSelectValue(WebElement ele, String text) {
		Select sc = new Select(ele);
		//sc.deselectByVisibleText(text);
		sc.selectByVisibleText(text);

	}
	public static void pageDown() {
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
			
		}
	
	//if clickable method is not working i can use JavaScript
	public static void getJSClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public static void Highlighter(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='6px solid green'", ele);
	}
	
	
	
}


