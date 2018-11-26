package com.example.demo.entity;

public class Produit {
	private String ref;
	private int quantite;

	private float prixUnitaire;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the prixUnitaire
	 */
	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	/**
	 * @param prixUnitaire the prixUnitaire to set
	 */
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Produit(String ref, int quantite, float priUnitaire) {
		super();
		this.ref = ref;
		this.quantite = quantite;
		this.prixUnitaire = priUnitaire;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
 

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// produit sont egaux si'ils ont la meme reference 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}

}
