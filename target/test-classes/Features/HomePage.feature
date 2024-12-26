#Author: Onjoud
Feature: HomePageMabrouk

  Scenario: verification de menu de la page dacceuilMabrouk
    Given utilisateur est sue la page dacceuil de Mabrouk
    When utilisateur survole la souris sur le menu "Femme"
    And utilisateur clique sur le sousmenu "Chemises & Blouses"
    Then utilisateur se derige ver la page de sousmenu "Chemises & Blouses"
