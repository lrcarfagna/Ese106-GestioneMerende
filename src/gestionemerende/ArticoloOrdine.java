package gestionemerende;

public class ArticoloOrdine {
	
	private Articolo articolo;
	private int quantita;
	
	
	
	ArticoloOrdine(Articolo a, int quantita){
		if(a!=null){
			articolo=a;
		}
		else
			throw new IllegalArgumentException("Articolo=null");
		if(quantita>0){
			this.quantita=quantita;
		}
		throw new IllegalArgumentException("la quantita deve essere maggiore di 0");
	}



	public Articolo getArticolo() {
		return articolo;
	}



	public int getQuantita() {
		return quantita;
	}
	
	public void setQuantita(int q){
		if(q>0){
			this.quantita=q;
		}

	}
	
}
	

	
	
