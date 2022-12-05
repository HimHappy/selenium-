import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLoginAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//LOGIN
//		driver.findElement(By.id("email")).sendKeys("9999999999");
//		driver.findElement(By.id("pass")).sendKeys("0909090909");
//		driver.findElement(By.id("loginbutton")).click();
		
		//FORGET ACCOUNT
//		driver.findElement(By.className("_97w4")).click();
		
		//SIGN-UP
		driver.findElement(By.className("_97w5")).click();
		//from here we will go to sign-up page
		//lets try to work for sign-up page
		driver.findElement(By.name("firstname")).sendKeys("happy");
		driver.findElement(By.name("lastname")).sendKeys("king khan");
		driver.findElement(By.name("reg_email__")).sendKeys("happy123king@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("happy123king@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Happy@123");
		driver.findElement(By.name("birthday_day")).sendKeys("25");
		driver.findElement(By.name("birthday_month")).sendKeys("April");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		
		//how to choose radio button => Done do it by ID
//		WebElement elementMale = driver.findElement(By.id("u_0_5_YO"));
//		elementMale.click();
//		elementMale.isSelected();
//		driver.findElement(By.className("_8esa")).click();
		WebElement elementMale = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]"));
		elementMale.click();
		driver.findElement(By.name("websubmit")).click();
	}

}
