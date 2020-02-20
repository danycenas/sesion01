package com.mitocode.ejercicio9.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programa8 {

	public static void main(String[] args) {
		
		Map<String, String> paises = new HashMap<String, String>();
		
		paises.put("PE", "Peru");
		paises.put("CO", "Colombia");
		paises.put("CH", "Chile");
		paises.put("EC", "Ecuador");
		
		// Validar si es vacio
		System.out.println("map vacio :" + paises.isEmpty());
		
		// obtener las valores
		Collection<String> valores = paises.values();
		System.out.println("valores: " + valores);
		
		// obtener las claves
		Set<String> claves = paises.keySet();
		System.out.println("claves: "+ claves);
		
		// obtener un valor
		System.out.println("valor: " + paises.get("CO"));
		
		// eliminar un elemento
		paises.remove("CO");
		System.out.println("Sin Colombia: "+ paises);
		
		// eliminar todo
		paises.clear();
		System.out.println("Eliminar todo: "+ paises);
		
	}
}
