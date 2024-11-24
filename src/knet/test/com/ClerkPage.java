package knet.test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClerkPage {
	
private WebDriver driver;
	
	public ClerkPage(String driverPath) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		
		this.driver = new ChromeDriver(options);
	}
	
	public void openLink() {
		driver.get("http://localhost:9997/login");
	}
	
	
	//logging into as a clerk
	public void LoginClerk() {
	WebElement username = driver.findElement(By.id("username-in"));
		username.click();
		username.clear();
		username.sendKeys("clerk");
		
		WebElement password = driver.findElement(By.id("password-in"));
		password.click();
		password.clear();
		password.sendKeys("clerk");
		
		WebElement clerkSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
		clerkSubmit.click();
		
		
	}
	
	//verify dashboard title
		public void dashBoard() {
			WebElement dashboardTitle = driver.findElement(By.xpath("/html/body/div[1]/div[1]/h1"));
			
		}
	
	
	//filling of the clerk form
	public void fillClerkForm() {
				
		WebElement dashboardTitle = driver.findElement(By.xpath("/html/body/div[1]/div[1]/h1"));
		
		//click on Add a hero
		WebElement addHero = driver.findElement(By.xpath("By.id(\"dropdownMenuButton2"));
		addHero.click();
		
		WebElement addButton = driver.findElement(By.id("natid-in"));
		addButton.click();
		
		//ADDING NAT ID
		WebElement natID = driver.findElement(By.id("natid-in"));
		natID.clear();
		natID.click();
		natID.sendKeys("100020");
		
		//Selecting gender
		WebElement gender = driver.findElement(By.id("gender-radio-2"));
		gender.click();
		
		WebElement dob = driver.findElement(By.id("birth-date"));
		dob.clear();
		dob.click();
		dob.sendKeys("2024-11-24");
		
		WebElement brownie = driver.findElement(By.id("brownie-pts-in"));
		brownie.clear();
		brownie.click();
		brownie.sendKeys("brownie test");
		
		
		WebElement salary = driver.findElement(By.id("salary-in"));
		salary.clear();
		salary.click();
		salary.sendKeys("6000");
		
		
		WebElement tax = driver.findElement(By.id("tax-paid-in"));
		tax.clear();
		tax.click();
		tax.sendKeys("560");
		
		WebElement name = driver.findElement(By.id("tax-paid-in"));
		name.clear();
		name.click();
		name.sendKeys("Tom Berry");
		
		WebElement dod = driver.findElement(By.id("tax-paid-in"));
		dod.clear();
		dod.click();
		dod.sendKeys("2024-11-24");
		
		//click submit button
		WebElement create = driver.findElement(By.xpath("//button[@onclick='addHero()']"));
		create.click();
		
	
	}
	
	//click back button as a clerk
		public void back() {
			//click submit button
			WebElement back = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[1]/a"));
			back.click();
			
		}
	
	
	
	
	//logging out as a clerk
	public void Logout() {
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"menu-item-1255\"]/a"));
		logout.click();
		
	}
	
	
	//upload csv
		public void uploadCSV() {
			
			WebElement upload = driver.findElement(By.xpath("//*[@id=\"upload-csv-file\"]"));
			upload.click();
			
			WebElement uploadCreate = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/button\n"));
			uploadCreate.click();			
		}
	
	
	

	public void closeBrowser() {
		driver.quit();

		
	}
	
	

}
