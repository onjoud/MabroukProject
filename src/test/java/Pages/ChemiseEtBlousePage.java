package Pages;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Helper.Config;

public class ChemiseEtBlousePage {
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> produit;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
	WebElement verifprouit;
	@FindBy(xpath="//*[@id=\"variation_pa_couleur\"]/div[3]/span[1]")
	WebElement couleur;
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[2]")
	WebElement taille;
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement panier;
	@FindBy(xpath="//*[@id=\"masthead\"]/div/div[1]/ul[2]/li[3]/div[1]/div[2]/ul/li/div/a")
	WebElement verifPanier;
	
	public ChemiseEtBlousePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void choisirProduit(String productname) {
		try {
			Config.atente(10);
		for(WebElement produits:produit) {
			if(produits.getText().contains(productname)) {
				produits.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verification(String verifP) {
		Config.atente(10);
		Assert.assertEquals(verifP, verifprouit.getText());
	}
	
	public void choisirCouleur() {
		couleur.click();
		
	}
	public void choisieTaille() {
		taille.click();
	}
	public void ajouterPanier() throws Exception {
		Thread.sleep(6000);
		
		panier.click();
		
		
	
	}
	public void verifPanier(String nameproduit) throws Exception {
		Thread.sleep(6000);
		Assert.assertEquals(nameproduit, verifPanier.getText());
	}

}
