package gestionemerende;

import java.util.Vector;

public class Ordine {
	
	private String codice;
	private Vector<ArticoloOrdine> articoli;
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
			
		articoli=new Vector<ArticoloOrdine>();
		
	}


	public String getCodice() {
		return codice;
	}


	public Vector<ArticoloOrdine> getArticoli() {
		return articoli;
	}
	
	public void setClasse(Classe c){
		if(c!=null){
			this.classe=c;
		}
		else 
			throw new IllegalArgumentException("classe=null");
	}
	
	public void addArticolo(ArticoloOrdine a){
		boolean trovato=false;
		
		if(a!=null){
			for(ArticoloOrdine ao: this.articoli){
				if(a==ao){
					a.setQuantita(a.getQuantita()+ao.getQuantita());
					trovato=true;
				}
				break;
			}
			
			if(trovato==false){
				articoli.addElement(a);
				a.getArticolo().addArticoloOrdine(a);
			}
			
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
			costoTotale+=articoli.elementAt(i).getArticolo().getCostoUnitario();
		}
		return costoTotale;
	}
	
	public Classe getClasse(){
		return this.classe;
	}
	

}
