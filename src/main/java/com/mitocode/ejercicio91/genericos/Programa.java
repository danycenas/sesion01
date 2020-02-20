package com.mitocode.ejercicio91.genericos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Dany");
		
		System.out.println(lista.get(0));
		
		// Operador diamante con 1 esterotipo
//		ClaseA<String> c1 = new ClaseA<>("Dany");
//		c1.mostrarTipo();
//		
//		ClaseA<Integer> c2 = new ClaseA<>(29);
//		c2.mostrarTipo();
		
		
		// Operador diamante con varios estereotipos
		ClaseB<String, Integer, String, Double> cb1 
			= new ClaseB<>("Dany", 29, "Cenas", 65.5);
		cb1.mostrarTipo();
		
		List<ClaseB<String, Integer, String, Double>> lista2 = new ArrayList<>();
		lista2.add(new ClaseB<>("Dany", 29, "Cenas", 65.5));
		
		
		
		
	}

}
