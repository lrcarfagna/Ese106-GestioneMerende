package gestionemerende;

public class Panino extends Articolo{
	
	private boolean vegetariano;
	private boolean carneSuina;
	
	public Panino(String ID,String descrizione,double calorie,
			double costoUnitario,
			boolean vegetariano,boolean carneSuina){
		
		super(ID,descrizione,costoUnitario,calorie);
		
		if(vegetariano && carneSuina){
			throw new IllegalArgumentException("panino sia vegetariano che con carne suina");
		}
		else{
			this.vegetariano=vegetariano;
			this.carneSuina=carneSuina;
			
		}

	}
		

		public boolean isVegetariano() {
			return vegetariano;
		}

		public boolean isCarneSuina() {
			return carneSuina;
		}
}
