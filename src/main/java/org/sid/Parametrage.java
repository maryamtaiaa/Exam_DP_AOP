package org.sid;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observe{

	private int EpaisseurContour;
	private int CouleurContour;
	private int CouleurRemplissage;
	private List<Observateur> observateurs=new ArrayList<>();
	
	@Override
	public void ajouterObservateur(Observateur o) {
		observateurs.add(o);
	}
	@Override
	public void supprimerObservateur(Observateur o) {
		observateurs.remove(o);
	}
	@Override
	public void notifierObservateur() {
		for(Observateur o:observateurs) {
			o.modifier(this);
		}
	}
	
	public int getEpaisseurContour() {
		return EpaisseurContour;
	}
	public void setEpaisseurContour(int epaisseurContour) {
		EpaisseurContour = epaisseurContour;
		this.notifierObservateur();
	}
	public int getCouleurContour() {
		return CouleurContour;
	}
	public void setCouleurContour(int couleurContour) {
		CouleurContour = couleurContour;
		this.notifierObservateur();
	}
	public int getCouleurRemplissage() {
		return CouleurRemplissage;
	}
	public void setCouleurRemplissage(int couleurRemplissage) {
		CouleurRemplissage = couleurRemplissage;
		this.notifierObservateur();
	}
	
	
	
}
