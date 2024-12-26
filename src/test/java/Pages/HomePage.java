package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
	List<WebElement> menues;
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[3]/div/ul/li/a/span")
	List<WebElement> submenues;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/h1")
	WebElement verif;
	
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void mouseHoverOnMenu (String menuName) {
		try {
		for(WebElement menus:menues) {
			if(menus.getText().contains(menuName)) {
				Config.actions= new Actions(Config.driver);
				Config.actions.moveToElement(menus).perform();
				Thread.sleep(6000);
				
			}
			
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	public void clickSousmenue(String sousmenueTitle) {
		try {
		for(WebElement sousmenues:submenues) {
			if(sousmenues.getText().contains(sousmenueTitle)) {
				sousmenues.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	
	public void verificationPage(String vevifTitle) {
		
		Config.atente(10);
		Assert.assertEquals(vevifTitle, verif.getText());	
	}
}

	
		
		
				
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

	


