package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefHomePage {

	@Given("utilisateur est sue la page dacceuil de Mabrouk")
	public void utilisateur_est_sue_la_page_dacceuil_de_mabrouk() {
	   Config.driver= new ChromeDriver();
	   Config.maximazeWindow();
	   String url="https://mabrouk.tn/";
	   Config.driver.get(url);
	
	}

	@When("utilisateur survole la souris sur le menu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu(String nommenu) {
		
		HomePage page=new HomePage();
		page.mouseHoverOnMenu(nommenu);
		
		
	    
}

	@When("utilisateur clique sur le sousmenu {string}")
	public void utilisateur_clique_sur_le_sousmenu(String nomsousmenue) {
		HomePage page=new HomePage();
		page.clickSousmenue(nomsousmenue);
	    
	}

	@Then("utilisateur se derige ver la page de sousmenu {string}")
	public void utilisateur_se_derige_ver_la_page_de_sousmenu(String veriftitre) {
		HomePage page=new HomePage();
		page.verificationPage(veriftitre);
		
	   
	}
}
