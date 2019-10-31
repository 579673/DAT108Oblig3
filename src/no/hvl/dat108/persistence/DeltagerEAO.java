package no.hvl.dat108.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import no.hvl.dat108.model.Deltager;

@Stateless
public class DeltagerEAO {
	
	@PersistenceContext(name = "DeltagerPU")
	EntityManager em;
	
	public void leggTilDeltager(Deltager d) {
		em.persist(d);
	}
	
}
