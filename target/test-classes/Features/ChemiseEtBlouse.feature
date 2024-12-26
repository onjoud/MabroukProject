#Author : Onjoud

Feature: ChemiseEtBlouse

Scenario: choisie un produit

Given utilisateur est sur la page de chemise et blouse

When utlisateur clique sur un produit "CHEMISE ISRA"

Then utilisateur se derig vers la page de produit choisi "CHEMISE ISRA"

And utilisateur choisir le couleur de produit
And utilisateur choisir la taille de produit 
And utlisateur ajouter le produit dans le panier
And le produit "CHEMISE ISRA - MOKA, M" est ajoutee au panier 

	