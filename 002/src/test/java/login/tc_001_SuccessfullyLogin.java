package login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001_SuccessfullyLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("https://unblit.com/recruiter/auth/signin");
		
		//find the email field element
		driver.findElement(By.id("email")).sendKeys("Test3@unblit.com");
		
		//find the password field element
		driver.findElement(By.id("password")).sendKeys("Demo@2026");
		
		//find the sign button element
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		//validate the url
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://unblit.com/recruiter/screens/dashboard";
		
		if(currentURL.equals(expectedURL)){
			System.out.println("Login successful, URL is correct");			
		}
		else {
			System.out.println("Login failed or navigated to wrong page: "+ currentURL);
		}
		
		//close the browser
		driver.quit();
	}

}
