package gestionemerende;

import java.util.Vector;

public class Ordine {
	
	private String codice;
	private Vector<Articolo> articoli;
	private Classe classe;
	
	
	public Ordine(String codice){
		if(codice!=null){
			if(codice.length()>0){
				this.codice=codice;
			}
			else 
				throw new IllegalArgumentException("nome<=0");
		}
		else
			throw new IllegalArgumentException("nome=null");
			
		articoli=new Vector<Articolo>();
		
	}


	public String getCodice() {
		return codice;
	}


	public Vector<Articolo> getArticoli() {
		return articoli;
	}
	
	public void setClasse(Classe c){
		if(c!=null){
			this.classe=c;
		}
		else 
			throw new IllegalArgumentException("classe=null");
	}
	
	public void addArticolo(Articolo a){
		if(a!=null){
			this.getArticoli().addElement(a);
		}
		else
			throw new IllegalArgumentException("Articolo=null");
	}
	
	public int getNumeroArticoli(){
		return articoli.size();
	}
	
	public double getCostoTotale(){
		double costoTotale=0;
		for(int i=0;i<articoli.size();i++){
			costoTotale+=articoli.elementAt(i).getCostoUnitario();
		}
		return costoTotale;
	}
	
	public Classe getClasse(){
		return this.classe;
	}
	

}
