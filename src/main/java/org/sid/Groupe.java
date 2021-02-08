package org.sid;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure{

	public List<Figure> Dessin=new ArrayList<>();
	Strategy strategie;
	
	public Figure ajouterFigure(Figure f) {
		Dessin.add(f);
		return f;
	}
	
	public void supprimerFigure(Figure figure) {
		     Dessin.remove(figure);	
	}
	

	public void afficherFigures() {
		for(Figure f:Dessin) {
			f.dessiner();
		}
	}
	
	public void effectuerStrategir() {
		strategie.traiter();
	}
	
	public void serialiser() {		
		System.out.println("Serialisation");
	}
	
	@Override
	public double perimetre() {
		double perimetre=0;
		for(Figure f:Dessin) {
			perimetre=f.perimetre()+perimetre;
		}
		return perimetre;
	}

	@Override
	public double surface() {
		double surface=0;
		for(Figure f:Dessin) {
			surface=f.surface()+surface;
		}
		return surface;
	}

	@Override
	public void dessiner() {
		for(Figure f:Dessin) {
			f.dessiner();
		}
	}
	
	

	
}
