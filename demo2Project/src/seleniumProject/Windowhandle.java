package seleniumProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		String currentwindow = driver.getWindowHandle();
		//System.out.println(currentwindow);
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		//System.out.println(allwindow);
		
		Object[] window =allwindow.toArray();
		
		String window1 = window[0].toString();
		String window2 = window[1].toString();
		
		System.out.println("this is window first"  +window1);
		System.out.println("this is window second" +window2);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window2);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window1);
		
		System.out.println(driver.getTitle());
		driver.close();
		
		

	}

}
