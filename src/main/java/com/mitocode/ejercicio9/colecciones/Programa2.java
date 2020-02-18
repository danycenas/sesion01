package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mitocode.ejercicio7.interfaces.CuentaAhorros;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		System.out.println("Estructura foreach: ");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.println("Usando iterator: ");
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<CuentaAhorros> listaCuentas = new ArrayList<>();
		
		CuentaAhorros c1 = new CuentaAhorros();
		c1.setNumeroCuenta("10");
		c1.setTitular("Dany");
		c1.setSaldo(1000);
		
		CuentaAhorros c2 = new CuentaAhorros();
		c2.setNumeroCuenta("11");
		c2.setTitular("Juan");
		c2.setSaldo(1200);
		
		CuentaAhorros c3 = new CuentaAhorros();
		c3.setNumeroCuenta("12");
		c3.setTitular("Pedro");
		c3.setSaldo(1500);
		
		listaCuentas.add(c1);
		listaCuentas.add(c2);
		listaCuentas.add(c3);
		
		for (CuentaAhorros cuentaAhorros : listaCuentas) {
			System.out.println(cuentaAhorros);
		}
		
	}

}