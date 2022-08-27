package seleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Railyatrisomecoloumn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.railyatri.in/time-table");
		List<WebElement> rows = driver.findElement(By.xpath("// div[2]/div/div/div/div/div/table")).findElements(By.tagName("tr"));
		//System.out.println(rows.size());
		
		
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String trainno = cols.get(0).getText();
			String trainnumber = cols.get(1).getText();
			System.out.println(trainno+"    "+trainnumber);
			
			}
			System.out.println();
		}
		

	}

	


