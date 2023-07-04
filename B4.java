package B;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/test");
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("fullName")).sendKeys("Viraj Ramchandra Mali");
		driver.findElement(By.id("join")).clear();
		boolean sys1 = driver.findElement(By.id("fullName")).isSelected();
		boolean sys2 = driver.findElement(By.id("fullName")).isDisplayed();
		boolean sys3 = driver.findElement(By.id("fullName")).isEnabled();
		System.out.println(sys1);
		System.out.println(sys2);
		System.out.println(sys3);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Click")).click();
		WebElement ele = driver.findElement(By.id("home"));
		System.out.println(ele.getSize());
		System.out.println(ele.getLocation());
		
		Rectangle R = driver.findElement(By.id("home")).getRect();
		System.out.println("X :- "+R.getX());
		System.out.println("Y :- "+R.getY());
		System.out.println("Height :- "+R.getHeight());
		System.out.println("Width :- "+R.getWidth());
		
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Edit")).click();
		WebElement abc = driver.findElement(By.id("fullName"));
		System.out.println(abc.getTagName());
		System.out.println(abc.getAttribute("class"));
		
	}

}
