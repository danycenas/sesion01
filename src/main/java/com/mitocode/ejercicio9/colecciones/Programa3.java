package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<>();
		lista.add("MAGENTA");
		lista.add("ROJO");
		lista.add("BLANCO");
		lista.add("AZUL");
		lista.add("CYAN");
		
		List<String> listaEliminar = new ArrayList<>();
		listaEliminar.add("ROJO");
		listaEliminar.add("BLANCO");
		listaEliminar.add("AZUL");
		
		Iterator<String> itetaror = lista.iterator();
		while (itetaror.hasNext()) {
			if (lista.contains(itetaror.next())) {
				itetaror.remove();
			}
		}
		System.out.println(lista.size());
		System.out.println(listaEliminar.size());
		
		for (String color : lista) {
			System.out.println(color);
		}
		
//		eliminar(lista, listaEliminar);
//		for (String color : lista) {
//			System.out.println(color);
//		}
		
	}
	
	
	public static void eliminar(Collection<String> lista1, Collection<String> lista2) {
		Iterator<String> iterator = lista1.iterator();
		while (iterator.hasNext()) {
			if (lista2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}

}
