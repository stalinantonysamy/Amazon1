package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Browser3
{
	@FindBy(xpath="//input[@id='continue']") private WebElement clickgo;
	@FindBy(xpath="//input[@id='ap_password']") private WebElement password;
	@FindBy(id="signInSubmit") private WebElement submit;
	
	public void click1()
	{
		clickgo.click();
	}
	
	public void password1()
	{
		password.sendKeys("123456");
	}
	
	public void submit1()
	{
		submit.click();
	}

}
