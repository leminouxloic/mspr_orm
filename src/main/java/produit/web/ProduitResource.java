package produit.web;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import produit.modele.*;

@Path("/produit")
public class ProduitResource {

	@GET
	@Produces("application/json")
	public List<Produit> getProduits() {
		List<Produit> mesProduits = new ArrayList<Produit>();
		mesProduits.add(new Produit("mon produit 1"));
		mesProduits.add(new Produit("mon produit 2"));
		mesProduits.add(new Produit("mon produit 3"));
		return mesProduits;
	}
}
