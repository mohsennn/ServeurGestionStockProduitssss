package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@Service
//car on a 2 classe qui implementent le meme interface don il faut prisiser et prioriser une implementation sur l'autre  
//pour n'est pas avoir de conflit 
@Primary
public class ProduitService  implements IProduitService{
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		 produitRepository.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		 
		produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(@PathVariable Long id ) {
 
		Produit produit =new Produit();
		produit.setId(id);
		produitRepository.delete(produit);
	}

}
