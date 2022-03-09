package fr.epsi.jee.persistance.entity;

import java.math.BigDecimal;

public class Produit {

  private Long id;
  
  private String libelle;
  
  private String description;
  
  private BigDecimal prix;
  
  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrix() {
    return prix;
  }

  public void setPrix(BigDecimal prix) {
    this.prix = prix;
  }

}
