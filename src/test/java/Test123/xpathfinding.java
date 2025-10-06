package Test123;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathfinding {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
			
		List<WebElement> users=driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]"));
		
		
		for(WebElement Option: users) {
			
			String Users= Option.getText();
			System.out.println(Users);
			if(Users.equals("MOHSINM")) {
				
				driver.findElement(By.xpath("//div[text()='MOHSINM']/following::button[2]")).click();
				break;
				
				
			}
			
		}
		
   driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).clear();
   driver.findElement(By.xpath("//label[text()='Username']/following::input[1]]")).sendKeys("MOhsin")	;
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("mohsin");
		
		
		
	}

}
