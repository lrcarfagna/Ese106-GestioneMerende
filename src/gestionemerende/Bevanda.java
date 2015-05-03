package gestionemerende;

public class Bevanda extends Articolo{
	
	private double quantita;
	
	public Bevanda(String ID,String descrizione,double costoUnitario,
			double calorie,double quantita){
		
		super(ID,descrizione,costoUnitario,calorie);
		
		if(quantita>0){
			this.quantita=quantita;
		}
		else
			throw new IllegalArgumentException("quantita'<=0");
		
	}

}
