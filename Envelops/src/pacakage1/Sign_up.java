package pacakage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sign_up {
	
	
@Test
	
	public void startDriver() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chanchal\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://envelopes-trade.streammarket.co.uk/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div[1]/a")).click();
		Thread.sleep(2000);
	WebElement e=	d.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/div[1]/ul/li[1]/a"));
		if(e.isEnabled())
		{
			e.click();
		}
		else
		{
			System.out.println("Element not found");
		}
		
		
//********************************Sign up****************************************************
		
		d.findElement(By.id("firstname")).sendKeys("First");
		d.findElement(By.id("lastname")).sendKeys("Last");
		d.findElement(By.id("email_address")).sendKeys("streammarket.sm.d@gmail.com");
		d.findElement(By.id("password")).sendKeys("stream@123");
		d.findElement(By.id("password-confirmation")).sendKeys("stream@123");
		d.findElement(By.name("billing_address_email")).sendKeys("first@gmail.com");
		d.findElement(By.name("type_of_company")).click();
		WebElement e1=	d.findElement(By.name("type_of_company"));		//Type of Company
		if(e1.isEnabled())
		{
			e1.click();
			Select oselect=new Select(e1);
		
			oselect.selectByValue("limited-company");
		}
		else
		{
			System.out.println("Element not found");
		}	

		d.findElement(By.id("company")).sendKeys("Company Name");
		d.findElement(By.name("company_address")).sendKeys("Hazratganj Lucknow");
		d.findElement(By.id("telephone")).sendKeys("5824713690");
		d.findElement(By.id("fax")).sendKeys("45632178");
		d.findElement(By.xpath("//*[@id=\"form-validate\"]/div[1]/fieldset[2]/div[5]/div/input")).sendKeys("123456780");
		d.findElement(By.xpath("//*[@id=\"taxvat\"]")).sendKeys("0987654321");
		d.findElement(By.name("primary_name")).sendKeys("primary name");
		d.findElement(By.name("job_title")).sendKeys("job title");
		d.findElement(By.name("department")).sendKeys("department");
		d.findElement(By.name("primary_email")).sendKeys("email@gmail.com");
		d.findElement(By.name("primary_telephone")).sendKeys("123654845");
		d.findElement(By.name("bank_name")).sendKeys("Bank Name");
		d.findElement(By.name("bank_address")).sendKeys("Address 1");
		d.findElement(By.name("bank_post_code")).sendKeys("520600");
		d.findElement(By.name("bank_account_name")).sendKeys("Account name");
		d.findElement(By.name("bank_account_no")).sendKeys("56010023236");
		d.findElement(By.name("bank_sort_code")).sendKeys("12345");
		d.findElement(By.name("expected_monthly_spend")).sendKeys("5000");
		WebElement e2=	d.findElement(By.name("mode_of_contact"));		//Mode of Contract
		if(e2.isEnabled())
		{
			e2.click();
			Select oselect=new Select(e2);
		
			oselect.selectByValue("exhibition");
		}
		else
		{
			System.out.println("Element not found");
		}	

		
		d.findElement(By.name("payable_name")).sendKeys("Payable name");
		d.findElement(By.name("payable_email")).sendKeys("pay@gmail.com");
		d.findElement(By.name("payable_telephone")).sendKeys("9874563210");
		d.findElement(By.name("factor_your_invoice")).click();
		d.findElement(By.name("street[]")).sendKeys("Street");
		d.findElement(By.name("city")).sendKeys("city");
		d.findElement(By.name("postcode")).sendKeys("890098");
		d.findElement(By.xpath("//*[@id=\"form-validate\"]/div[3]/div[1]/button")).click();      //button click
		
}
}
