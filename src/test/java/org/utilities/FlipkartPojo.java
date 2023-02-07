package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {
	public FlipkartPojo() {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getApple() {
		return apple;
	}

	public WebElement getFlipkatrAssured() {
		return flipkatrAssured;
	}

	public WebElement getRating4Above() {
		return rating4Above;
	}

	public WebElement getTenOffer() {
		return tenOffer;
	}

	

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCllose() {
		return cllose;
	}

	public WebElement getLoginbuton() {
		return loginbuton;
	}

	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}

	public WebElement getClk() {
		return clk;
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cllose;

	@FindBy(xpath = "//input[@class='_3704LK']")
	private WebElement search;

	@FindBy(xpath = "(//div[@class='_3879cV'])[1]")
	private WebElement apple;
	@FindBy(xpath = "(//label[@class='_2iDkf8 shbqsL']")
	private WebElement flipkatrAssured;

	@FindBy(xpath = "//a[@class='_1_3w1N']")
	private WebElement loginbuton;

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement clk;

	
	@FindBy(xpath = "(//div[@class='_3879cV'])[3]")
	private WebElement rating4Above;
	
	@FindBy(xpath = "(//div[@class='_3879cV'])[11]")
	private WebElement tenOffer;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart;
	
	@FindBy(xpath = "(//div[contains(text(),'APPLE iPhone 8 Plus (Space Grey, 64 GB)')])[1]")
	private WebElement product;
	@FindBy(xpath = "//button[text()='NOTIFY ME']")
	private WebElement notifyMe;
	public WebElement getNotifyMe() {
		return notifyMe;
	}
}
