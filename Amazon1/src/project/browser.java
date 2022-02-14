package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class browser
{
	@FindBy(id="twotabsearchtextbox") private WebElement searchbox;
	@FindBy(id="nav-search-submit-button") private WebElement search;
	
	public void search_box()
	{
		searchbox.sendKeys("the immortals of meluha");
	}
	
	public void search1()
	{
		search.click();
	}

}
