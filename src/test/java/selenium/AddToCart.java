package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart {
	
    @Test
	public void cart() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/53048/eclipse-workspace/TestProject/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    	
    	String[] names = {"Brocolli","Tomato","Beans"};
    	List<String> cartItems = Arrays.asList(names);
    	List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));
    	Thread.sleep(3000);
    	int j=0;
    	for(int i=0;i<products.size();i++)
    	{
    		j++;
    		String prod = products.get(i).getText();
    		String[] prods = prod.split("-");
    		String product = prods[0].trim();
    		if(cartItems.contains(product))
    		{
    			driver.findElement(By.xpath("(//div[@class='product-action']/button)["+j+"]")).click();
    			Thread.sleep(5000);
    		}
    	}
	}

}
