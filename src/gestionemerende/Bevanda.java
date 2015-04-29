package gestionemerende;

public class Bevanda extends Articolo{
	
	private double quantita;
	
	public Bevanda(String ID,double calorie,
			double costoUnitario,String descrizione,double quantita){
		
		super(ID,calorie,costoUnitario,descrizione);
		
		if(quantita>0){
			this.quantita=quantita;
		}
		else
			throw new IllegalArgumentException("quantita'<=0");
		
	}

}
