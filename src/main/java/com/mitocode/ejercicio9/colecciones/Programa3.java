package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> lista = new LinkedList<>();
		lista.add("MAGENTA");
		lista.add("ROJO");
		lista.add("BLANCO");
		lista.add("AZUL");
		lista.add("CYAN");
		
		System.out.println("Colores: ");
		for (String color : lista) {
			System.out.print(color + " ");
		}
		
		LinkedList<String> listaEliminar = new LinkedList<>();
		listaEliminar.add("ROJO");
		listaEliminar.add("BLANCO");
		listaEliminar.add("AZUL");
		
		System.out.println("\nElementos a eliminar: ");
		for (String color : listaEliminar) {
			System.out.print(color + " ");
		}
		
		System.out.println();
		eliminar(lista, listaEliminar);
		for (String color : lista) {
			System.out.println(color);
		}
		
	}
	
	
	public static void eliminar(Collection<String> lista1, Collection<String> lista2) {
		Iterator<String> iterator = lista1.iterator();
		while (iterator.hasNext()) {
			if (lista2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
	
	public static int sumar(Integer x, Integer y) {
		return x + y;
	}

}
