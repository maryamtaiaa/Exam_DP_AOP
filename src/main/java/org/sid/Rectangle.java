package org.sid;

public class Rectangle extends Figure{

	public double Hauteur;
	public double Largeur;
	public Point point;
	
     public Rectangle(double Hauteur,double Largeur, Point point) {
    	 this.Hauteur=Hauteur;
    	 this.Largeur=Largeur;
    	 this.point=point;
     }
     public Rectangle(double Hauteur,double Largeur) {
    	 this.Hauteur=Hauteur;
    	 this.Largeur=Largeur;
  
     }
	
	@Override
	public double perimetre() {
		return Hauteur*Largeur;
	}

	@Override
	public double surface() {
		return 2*(Hauteur+Largeur);
	}

	@Override
	public void dessiner() {
		System.out.println("L'état: Rectangle => Hauteur:" +Hauteur+ "Largeur: "+Largeur+ "Perimetre: "+perimetre()+ "Surface: "+surface());
	}

}
