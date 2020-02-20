package com.mitocode.ejercicio91.genericos;

public class ClaseA<T> {

	private T objeto;

	public ClaseA(T objeto) {
		super();
		this.objeto = objeto;
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
	
	public void mostrarTipo() {
		System.out.println("T es una clase. " + objeto.getClass());
	}

}
