import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracseleniumRedditMail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Himanshu rajak");
		driver.findElement(By.name("passwd")).sendKeys("pass@Q123");
		driver.findElement(By.name("proceed")).click();
	}

}
