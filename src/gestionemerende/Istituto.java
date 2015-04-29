package gestionemerende;

import java.util.Vector;

public class Istituto {
	
	private String nome;
	private Vector<Classe> classi;
	
	public Istituto(String nome){
		if(nome!=null){
			if(nome.length()>0){
				this.nome=nome;
			}
			else 
				throw new IllegalArgumentException("nome<=0");
		}
		else
			throw new IllegalArgumentException("nome=null");
			
		classi=new Vector<Classe>();
		
	}

	public String getNome() {
		return nome;
	}

	public Vector<Classe> getClassi() {
		return classi;
	}
}
