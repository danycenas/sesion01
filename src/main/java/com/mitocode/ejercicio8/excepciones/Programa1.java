package com.mitocode.ejercicio8.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese numerador: ");
		int numerador = sc.nextInt();
		
		System.out.print("Ingrese denominador: ");
		int denominador = sc.nextInt();
		
//		try {
//			int resultado = numerador / denominador;
//			System.out.println("Resultado: " + resultado);
//		} catch (ArithmeticException e) {
//			System.out.println("Cero es un denominador invalido.");
//		} catch (InputMismatchException e) {
//			System.out.println("Denominador formato incorrecto.");
//		} finally {
//			System.out.println("finally siempre");
//		}

//		Forma2
//		int resultado = dividir(numerador, denominador);
//		System.out.println("Resultado: " + resultado);
		
//		Usando throws
		try {
			int resultado = dividir2(numerador, denominador);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Denominador formato incorrecto.");
		}

		sc.close();
		
	}
	
	public static int dividir(int numerador, int denominador) {
		try {
			return numerador / denominador;
		} catch (Exception e) {
			System.out.println("Cero es un denominador invalido.");
			return -1;
		} finally {
			System.out.println("finally siempre");
		}
	}
	
	public static int dividir2(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}

}
