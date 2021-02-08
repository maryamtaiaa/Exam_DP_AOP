package org.sid;

public abstract class Figure implements Observateur{
	
	
	
	public Figure() {
		
	}
	public abstract double perimetre();
	public abstract double surface();
	public abstract void dessiner();
	
	@Override
	public void modifier(Observe o) {
		int etat1=((Parametrage)o).getEpaisseurContour();
		int etat2=((Parametrage)o).getCouleurContour();
		int etat3=((Parametrage)o).getCouleurRemplissage();
		
		((Parametrage)o).setEpaisseurContour(etat1+2);
		((Parametrage)o).setCouleurContour(etat2+3);
		((Parametrage)o).setCouleurRemplissage(etat3+4);
		
		System.out.println("Modification effectuee");
	}
	
	
	
	
}
