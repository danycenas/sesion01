package com.mitocode.ejercicio9.colecciones;

public class Programa1 {
	
	public static void main(String[] args) {
		
		Integer[] lista = new Integer[10];
		
		lista[0] = 5; // unboxing
		
		int valor = lista[0]; // boxing
		
		System.out.println(valor ==  lista[0]);
	}

}
