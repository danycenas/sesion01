package com.mitocode.ejercicio91.genericos;

public class ClaseB<K, T, V, E> {

	private K objetoK;
	private T objetoT;
	private V objetoV;
	private E objetoE;

	public ClaseB(K objetoK, T objetoT, V objetoV, E objetoE) {
		super();
		this.objetoK = objetoK;
		this.objetoT = objetoT;
		this.objetoV = objetoV;
		this.objetoE = objetoE;
	}

	public void mostrarTipo() {
		System.out.println("K es una clase: " + objetoK.getClass());
		System.out.println("T es una clase: " + objetoT.getClass());
		System.out.println("V es una clase: " + objetoV.getClass());
		System.out.println("E es una clase: " + objetoE.getClass());
	}
	
}
