package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/");
	    driver.findElement(By.linkText("Draggable")).click();
	    driver.switchTo().frame(driver.findElement(By.id("draggable")));
	    Actions act = new Actions(driver);
	    act.clickAndHold(driver.findElement(By.id("draggable")));
	    act.build().perform();
	}

}
