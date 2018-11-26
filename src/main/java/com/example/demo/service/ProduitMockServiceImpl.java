package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

//si on met pas l'annotation @Service Field produitService in com.example.demo.controller.ProduitController required a bean of type 'com.example.demo.service.IProduitService' that could not be found.

@Service
public class ProduitMockServiceImpl implements IProduitService {

	public List<Produit> produits;

	public ProduitMockServiceImpl() {

		produits = new ArrayList<Produit>();

		produits.add(new Produit("Livre", 50, 20));
		produits.add(new Produit("cahier", 200, 5.25f));
		produits.add(new Produit("Stylo", 200, 2.10f));

	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void addProduit(Produit produit) {
		produits.add(produit);

	}

	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);

	}

	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		produits.remove(produit);
	}

}
