package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Browser2
{
	@FindBy(name="proceedToRetailCheckout") private WebElement addtocart;
	@FindBy(xpath="//input[@id='ap_email']") private WebElement mail;
	
	
	public void addto_cart()
	{
		
		addtocart.click();
	}
	
	public void mail1()
	{
		mail.sendKeys("stalincse604@gmail.com");
	}
	
	

}
