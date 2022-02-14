package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class browser1 
{
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]") private WebElement searchbox1;
    @FindBy(id="add-to-cart-button") private WebElement add;
    public void browser_2()
    {
    	searchbox1.click();
    }
    
    public void add1()
    {
    	add.click();
    }
}
