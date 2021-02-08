package org.sid;

public interface Observe {

	public void ajouterObservateur(Observateur o);
	public void supprimerObservateur(Observateur o);
	public void notifierObservateur();
}
