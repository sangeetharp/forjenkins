package org.stepdefnition;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefnition extends BaseClass {
	
	@Given("User should launch flipkart")
	public void user_should_launch_flipkart() {
			launchChrome();
			loadUrl("https://www.flipkart.com/");
			winMax();
			implicitWaits(10);
	}
	@When("close the popup")
	public void close_the_popup() {
		FlipkartPojo f= new FlipkartPojo();
	btnClick(f.getCllose());
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       
	}

	@When("user should search a product using keyword")
	public void user_should_search_a_product_using_keyword(DataTable d) throws AWTException {
		FlipkartPojo f= new FlipkartPojo();
		List<String> a = d.asList();
		fill(f.getSearch(),a.get(0) );
		toEnterWithRobot();
		
		 //driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		 
//		 Robot r=new Robot();
//	       r.keyPress(KeyEvent.VK_ENTER);
//	       r.keyRelease(KeyEvent.VK_ENTER);
	       
	}

	@When("user should add some filters and click a product")
	public void user_should_add_some_filters_and_click_a_product() throws InterruptedException {
	FlipkartPojo f= new FlipkartPojo();
	btnClick(f.getApple());
	Thread.sleep(2000);

btnClick(f.getTenOffer());
Thread.sleep(2000);
btnClick(f.getRating4Above());
	
}

	@Then("user should navigate to product detail page")
	public void userShouldNavigateToproductDetailPage() throws InterruptedException {
		FlipkartPojo f= new FlipkartPojo();
		
		
		
		 //btnClick(f.getProduct());
	      String c = driver.getWindowHandle();
	      System.out.println(c);
	      //WebElement scroll=driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 (Purple, 128 GB)')]"));
	      //JavascriptExecutor js=(JavascriptExecutor)driver;
	      //js.executeScript("arguments[0].scrollIntoView(true)", scroll);
	      //js.executeScript("arguments[0].click()", scroll);
	      toViewJavascriptExecutor(f.getProduct()); 
			 toclickWithJse(f.getProduct());
	       Set<String> wh = driver.getWindowHandles();
	       for (String w : wh) {
	    	   
	    	  if(!w.equals(c)) {
	    		  driver.switchTo().window(w);
	    	  }
			
		
	       }
	       }
	       @Then("user should Add a product to cart")
	       public void user_should_Add_a_product_to_cart() {
	    	   FlipkartPojo f= new FlipkartPojo();
	    	   btnClick(f.getNotifyMe());
	       }




	

}
