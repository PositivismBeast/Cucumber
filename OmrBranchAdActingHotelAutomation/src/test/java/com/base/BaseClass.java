package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author sarav
 * @date 02/10/2022
 * @see BaseClass Use For The Code Reusability
 *
 */
public class BaseClass {
	public static WebDriver driver;


	/**
	 * 
	 * @param element
	 * @see Use For Getting The Locator With Required Times
	 */
	public void implicitWait(WebElement element) {
   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	
/**
 * 
 * @return byte[]
 * @see Take ScreenShots For Pass and Failed Cases
 */
	public byte[] screenshot() {

		TakesScreenshot screenshot = (TakesScreenshot)driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
		
		
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Use For The Before Class Operation
	 */
	
	public static String getPropertiesFileValue(String key) throws FileNotFoundException, IOException {
Properties properties = new Properties();
properties.load(new FileInputStream(System.getProperty("user.dir")+ "\\Conifg\\Config.properties"));
		String value = (String)properties.get(key);
		return value;
		
		
	}
	
	/**
	 * 
	 * @param browserType
	 * @see Select The BrowserType
	 */
	public  static void getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			break;
		default:
			break;
		}
		
		
		
		
	}
	


	
	
	/**
	 * 
	 * @param url
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Used For Enter Application Url
	 */
public static void enterUrl(String url) throws FileNotFoundException, IOException {
	driver.get(getPropertiesFileValue("url"));

}

/**
 * @see Maximize The Window
 */
public static void maximizeWindow() {
	driver.manage().window().maximize();
}

/**
 * 
 * @param element
 * @param data
 * @throws InterruptedException 
 * @see Input Values Into Textbox
 */
public void elementSendkeys(WebElement element, String data) throws InterruptedException {
	implicitWait(element);

elementClear(element);
	element.sendKeys(data);

}
/**
 * 
 * @param element
 * @param data
 * @see Input Values Via Js 
 */
public void elementSendkeysJs(WebElement element, String data) {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	
}

/**
 * 
 * @param element
 * @see 
 */
public  void drawBorderJS(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].style.border='3px solid red'", element);

}

/**
 * 
 * @param element
 * @return String
 */
public String getTitleByJS(WebElement element) {
	JavascriptExecutor jk =(JavascriptExecutor)driver;
	String title = jk.executeScript("return document.title").toString();
	return title;
}



/**
 * 
 * @param element
 * @see Use For Click WebElement
 */
public void elementClick(WebElement element) {
	
	element.click();

}
/**
 * 
 * @param element
 * @see Use For Clear Textbox
 */
public void elementClear(WebElement element) {
	implicitWait(element);
	
	element.clear();

}

/**
 * 
 * @return
 * @see Get the Application Title
 */
public String getApplicationTitle() {
	String title = driver.getTitle();
	return title;
}

/**
 * 
 * @param AttributeValue
 * @return WebElement
 * @see Find The Element By Using Id Locator
 * 
 */
public WebElement findLocatorById(String AttributeValue) {
	
	WebElement element = driver.findElement(By.id(AttributeValue));
	implicitWait(element);
	return element;

}
/**
 * 
 * @param AttributeValue
 * @return WebElement
 * @see Find The Element By Using Name Locator
 */
public WebElement findLocatorByName(String AttributeValue) {
	WebElement element = driver.findElement(By.name(AttributeValue));
	implicitWait(element);
	return element;
}

/**
 * 
 * @param AttributeValue
 * @return WebElement
 * @see Find The Element By Using ClassName Locator
 */
public WebElement findLocatorByclassName(String AttributeValue) {
	WebElement element = driver.findElement(By.className(AttributeValue));
	return element;
}	

/**
 * 
 * @param xpath
 * @return WebElement
 * @see Find The Element By Using Xpath
 */
public WebElement findLocatorByXpath(String xpath) {
	WebElement element = driver.findElement(By.xpath(xpath));
	return element;
}	

/**
 * 
 * @param tgName
 * @return WebElement
 * @see Find Element By Using TagName
 */
public WebElement findLocatorByTagname(String tgName) {
	
	WebElement element = driver.findElement(By.tagName(tgName));
	implicitWait(element);
	return element;
}
/**
 * @see Use for Close Current Window
 */
public void closeWindow() {
	driver.close();

}
/**
 * @see Use For Close all Window
 */
public  void quitWindow() {
	driver.quit();

}
/**
 * 
 * @param element
 * @return String
 * @see Get The Text From The WebElement
 */
public String elementGetText(WebElement element) {
	elementClear(element);
	String text = element.getText();
	return text;

}

/**
 * 
 * @return String
 * @see Get The Application Url
 */
public String getApplicationUrl() {
	String url = driver.getCurrentUrl();
	return url;
}

/**
 * 
 * @param element
 * @param attributename
 * @return String
 * @see Get The Attribute Of Selected WebElement
 */
//maybe anything
public String elementGetAttributeValue(WebElement element ,String attributename) {
	String attribute = element.getAttribute(attributename);
	implicitWait(element);
	return attribute;
}

/**
 * 
 * @param element
 * @return String
 * @see Get The Attribute Of Selected WebElement
 */
//value as attribute
public String elementGetAttributeValue(WebElement element) {
	String attribute = element.getAttribute("value");
	implicitWait(element);
	return attribute;
}
/**
 * 
 * @param element
 * @param text
 * @See Select The Text From Dropdown
 */
public void selectoptionByText(WebElement element,String text) {
	implicitWait(element);
	Select select=new Select(element);
	select.selectByVisibleText(text);
}

/**
 * 
 * @param element
 * @param attributeName
 * @see Select The Option From Dropdown
 * 
 */
public void selectoptionByAttributeValue(WebElement element,String attributeName) {
	Select select=new Select(element);
	select.selectByValue(attributeName);
}

/**
 * 
 * @param element
 * @param index
 * @see Select The Index Position From Dropdown
 */
public void selectoptionByIndexValue(WebElement element,int index) {
	Select select=new Select(element);
	select.selectByIndex(index);
}

/**
 * 
 * @return String
 * @see Use For Handle the Windows
 */
public String getwindowHandle() {
	String handle = driver.getWindowHandle();
	return handle;

}



/**
 * @see Use for Handle Popups
 */
public void getSimpleAlert() {
	Alert alert=driver.switchTo().alert();
	alert.accept();

}

/**
 * @see Use For Handle Popups 
 */
public void getConfirmAlert() {
	Alert alert=driver.switchTo().alert();
	alert.dismiss();

}

/**
 * 
 * @param text
 * @see Use for Enter Text Into Popups
 */
public void promptAlret(String text) {
	Alert alert=driver.switchTo().alert();
	alert.sendKeys(text);
}

/**
 * 
 * @return String
 * @see Get the Text From Popups
 */
public String getTextAlert() {
	Alert alert=driver.switchTo().alert();
	String text = alert.getText();
	return text;
	

}

/**
 * @see Backward Process
 */
public void getBack() {
	driver.navigate().back();

}

/**
 * @see Forward Process
 */
public void getforward() {
	driver.navigate().forward();

}

/**@see Use For Refresh the Page
 * 
 */
public void getRefresh() {
	driver.navigate().refresh();
}

/**
 * 
 * @param url
 * @see Enter Url Using Navigation
 */
public void openApplicationNavigation(String url) {
	driver.navigate().to(url);
}	

/**
 * 
 * @param element
 * @return WebElement
 * @see Print The First Selected Option
 */
public WebElement getFirstSelectionOption(WebElement element) {
	Select select=new Select(element);
	WebElement option = select.getFirstSelectedOption();
	return option;
}

/**
 * 
 * @param element
 * @param index
 * @see Deslect The Dropdown Option by Index
 */
public void getdeSelectByIndex(WebElement element,int index) {
	Select select=new Select(element);
	select.deselectByIndex(index);

}

/**
 * 
 * @param element
 * @param attributeName
 * @see Deselect DropdownOption By Value
 */
public void deselectByValue(WebElement element, String attributeName) {
	Select select=new Select(element);
	select.deselectByValue(attributeName);

}


}
