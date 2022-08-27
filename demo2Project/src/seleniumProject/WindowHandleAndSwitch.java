package seleniumProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAndSwitch {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://gmail.com");
	    String curwindow = driver.getWindowHandle();
	    System.out.println(curwindow);
	    driver.findElement(By.linkText("Help")).click();
	    Set<String> allwindow =driver.getWindowHandles();
	    Object[] win = allwindow.toArray();
	    String win1 = win[0].toString();
	    System.out.println(win1);
	    
	    String win2 = win[1].toString();
	    System.out.println(win2);
	    driver.switchTo().window(win2);
	    //driver.findElement(By.linkText("Community")).click();
	    driver.switchTo().window(win1);
	    driver.findElement(By.linkText("Privacy")).click();
	    String win3 = driver.getWindowHandle();
	    System.out.println("this is window three  "+win3);
	 
	}

}
