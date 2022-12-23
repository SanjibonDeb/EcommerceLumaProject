package luma.us.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.us.basepage.Basepage;

public class WaitHelper extends Basepage{

	//public static void seleniumWait(WebElement ele) {	
		//WebDriverWait wait= new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		public static void seleniumWait(WebElement ele, long time) {		
		WebDriverWait wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
}
