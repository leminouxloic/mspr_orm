package produit.modele;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity

public class Produit {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Basic
    private String libelle;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Produit(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	
   
}
