package org.sid;

public class Cercle extends Figure{

	public double Rayon;
	public Point point;
	
	 public Cercle(double Rayon) {
    	 this.Rayon=Rayon;
     }
	 public Cercle(double Rayon, Point point) {
    	 this.Rayon=Rayon;
    	 this.point=point;
     }
	 
	@Override
	public double perimetre() {
		return 2*3.14*Rayon;
	}

	@Override
	public double surface() {
		return 3.14*Rayon*Rayon;
	}

	@Override
	public void dessiner() {
		System.out.println("L'état: Cercle => Rayon :"+Rayon+ "Perimetre: "+perimetre()+ "Surface: "+surface());		
	}

}
