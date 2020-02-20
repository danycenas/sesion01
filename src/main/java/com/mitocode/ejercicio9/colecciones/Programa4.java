package com.mitocode.ejercicio9.colecciones;

import java.util.Arrays;
import java.util.LinkedList;

public class Programa4 {

	public static void main(String[] args) {
		
		String[] colores = {"negro", "azul", "amarillo"} ;
		
		LinkedList<String> lista = new LinkedList<String>(Arrays.asList(colores));
		
//		lista.add("negro");
//		lista.add("azul");
//		lista.add("amarillo");
		
		for (String color : lista) {
			System.out.println(color);
		}
		
		// añadir en posicion
		lista.add(2, "verde");
		System.out.println("Se añadio en la posicion 2:");
		for (String color : lista) {
			System.out.println(color);
		}
		
		// añadir al inicio
		lista.addFirst("rosa");
		System.out.println("Se añadio al inicio:");
		for (String color : lista) {
			System.out.println(color);
		}
		
		// añadir ultimo
		lista.addLast("cyan");
		for (String color : lista) {
			System.out.println(color);
		}
		
		
		
		
	}
}
