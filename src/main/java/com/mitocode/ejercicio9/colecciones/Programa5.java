package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programa5 {
	
	private static int ELEMENTOS = 50000;
	
	public static void main(String[] args) {
		
		// creamos 2 listas
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		// Agregar
		System.out.println("****** Agregar *******");
		long start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.add("elemento #" + i);
		}
		long tiempo = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + tiempo + " ms");
		
		// LinkedList
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.add("elemento #" + i);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + tiempo + " ms");
		
		
		
		
		// Obtener
		System.out.println("****** Obtener *******");
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.get(i);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + tiempo + " ms");
		
		// LinkedList
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.get(i);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + tiempo + " ms");
		
		
		// Modificar
		System.out.println("****** Modificar *******");
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.set(i, "elemento #" + i);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + tiempo + " ms");
		
		// LinkedList
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.set(i, "elemento #" + i);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + tiempo + " ms");
		
		
		
		// Eliminar
		System.out.println("****** Eliminar *******");
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.remove(0);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + tiempo + " ms");
		
		// LinkedList
		start = System.currentTimeMillis();
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.remove(0);
		}
		tiempo = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + tiempo + " ms");
		
		
	}

}
