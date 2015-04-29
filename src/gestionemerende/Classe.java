package gestionemerende;

import java.util.Vector;

public class Classe {
	
	private String nome;
	private Vector<Ordine> ordini;

	
	public Classe(String nome){
		
		if(nome!=null){
			if(nome.length()>0){
				this.nome=nome;
			}
			else 
				throw new IllegalArgumentException("nome<=0");
		}
		else
			throw new IllegalArgumentException("nome=null");
			
		ordini=new Vector<Ordine>();
	}


	public String getNome() {
		return nome;
	}


	public Vector<Ordine> getOrdini() {
		return ordini;
	}
	
	public void addOrdine(Ordine o) throws Exception{
		if(!ordineEffettuato(o)){
			this.ordini.addElement(o);
			o.setClasse(this);
		}
		else
			throw new Exception("ordine già presente");
		
	}
	
	private boolean ordineEffettuato(Ordine o) {
		
		boolean effettuato=false;
		if(o!=null){
				for(int i=0;i<ordini.size();i++){
					if(this.ordini.elementAt(i).getCodice().equals(o.getCodice())){
						effettuato=true;
						i=ordini.size();
					}
				}
		}
		return effettuato;
	}
	
}
