package fr.epsi.jee.persistance.entity;

import java.time.LocalDate;
import java.util.Collection;

public class Commande {

  private Long id;
  
  private Collection<CommandeLigne> lignes;
  
  private LocalDate dateCreation;

  public Collection<CommandeLigne> getLignes() {
    return lignes;
  }

  public void setLignes(Collection<CommandeLigne> lignes) {
    this.lignes = lignes;
  }

  public LocalDate getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
  }
  
  
}
