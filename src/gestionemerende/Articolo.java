package gestionemerende;

public class Articolo {
	
	private String ID;
	private double calorie;
	private double costoUnitario;
	private String descrizione;
	
	
	public Articolo(String ID,double calorie,
			double costoUnitario,String descrizione){
		
		if(ID!=null){
			if(ID.length()>0){
				this.ID=ID;
			}
			else
				throw new IllegalArgumentException("ID<=0");
		}
		else
			throw new IllegalArgumentException("ID=null");
	
		if(descrizione!=null){
			if(descrizione.length()>0){
				this.descrizione=descrizione;
			}
			else
				throw new IllegalArgumentException("Descrizione<=0");
		}
		else
			throw new IllegalArgumentException("Descrizione=null");
		
		if(calorie>0){
			this.calorie=calorie;
		}
		else
			throw new IllegalArgumentException("calorie<=0");
		
		if(costoUnitario>0){
			this.costoUnitario=costoUnitario;
		}
		else
			throw new IllegalArgumentException("costoUnitario<=0");
			
		
		
	}
	
	
	public String getID() {
		return ID;
	}
	public double getCalorie() {
		return calorie;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public String getDescrizione() {
		return descrizione;
	}

}
