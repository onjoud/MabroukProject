package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.ChemiseEtBlousePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefChemisePage {
	
	@Given("utilisateur est sur la page de chemise et blouse")
	public void utilisateur_est_sur_la_page_de_chemise_et_blouse() {
	    Config.driver= new ChromeDriver();
	    Config.maximazeWindow();
	    String url="https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/";
	    Config.driver.get(url);
	}

	@When("utlisateur clique sur un produit {string}")
	public void utlisateur_clique_sur_un_produit(String nomProduit) {
		ChemiseEtBlousePage produit=new ChemiseEtBlousePage();
		produit.choisirProduit(nomProduit);
		
		
	   
	}

	@Then("utilisateur se derig vers la page de produit choisi {string}")
	public void utilisateur_se_derig_vers_la_page_de_produit_choisi(String veiftitre) {
		ChemiseEtBlousePage produit=new ChemiseEtBlousePage();
		produit.verification(veiftitre);
	}
		
		@Then("utilisateur choisir le couleur de produit")
		public void utilisateur_choisir_le_couleur_de_produit() {
			ChemiseEtBlousePage produit=new ChemiseEtBlousePage();
			produit.choisirCouleur();
			
		}
		    

		@Then("utilisateur choisir la taille de produit")
		public void utilisateur_choisir_la_taille_de_produit() {
			ChemiseEtBlousePage produit=new ChemiseEtBlousePage();
			produit.choisieTaille();
		
		}

		@Then("utlisateur ajouter le produit dans le panier")
		public void utlisateur_ajouter_le_produit_dans_le_panier() throws Exception {
			ChemiseEtBlousePage produit=new ChemiseEtBlousePage();
			produit.ajouterPanier();
		}

		@Then("le produit {string} est ajoutee au panier")
		public void le_produit_est_ajoutee_au_panier(String nomProduit) throws Exception {
			ChemiseEtBlousePage produit=new ChemiseEtBlousePage();
			produit.verifPanier(nomProduit);
		    
		}

		
	    
	}



