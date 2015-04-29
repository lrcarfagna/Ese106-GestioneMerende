package gestionemerende;

public class Panino {
	
	private boolean vegetariano;
	private boolean carneSuina;
	
	public Panino(String ID,double calorie,
			double costoUnitario,String descrizione,
			boolean vegetariano,boolean carneSuine){
		
		if(vegetariano && carneSuina){
			throw new IllegalArgumentException("panino sia vegetariano che con carne suina");
		}
		
		super(ID,calorie,costoUnitario,descrizione);
		
		
		
	}

}
