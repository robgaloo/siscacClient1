package br.com.memory.bean;

public class Telefone {

	private String numero;
	private String tipo;
	
	public Telefone(String tipo){
		this.tipo = tipo; 
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
}
