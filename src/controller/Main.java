package controller;

import model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String palabra = "";
		
		boolean terminado=false;
		
		ArrayList <String> palabras = new ArrayList <String>();
		
		palabras.add("melon");
		palabras.add("sandia");
		palabras.add("platano");
		palabras.add("kiwi");
		
		ArrayList <String> blanco = new ArrayList <String>();
		
		ArrayList<String> error = new ArrayList <String>();
	
		
		Random random= new Random();
		
		palabra= palabras.get(random.nextInt(palabras.size())) ;
		
		
		char[] caracteresPalabras = palabra.toCharArray();
		char[] caracteresBlanco = palabra.toCharArray();
		for (int i = 0; i< caracteresPalabras.length; i++) {
		blanco.add("_");
		
		}
		System.out.println(palabra);
		
		while (terminado==false) {
		System.out.println(blanco);
		String input = sc.next();
		input=input.toLowerCase();
		
		
		
		while(input.length()>1 || input.length()<0) {
			System.out.println("Introduce un caracter");
			input=sc.next();
		}
		
		//charAt consigue el primer caracter del String
		char inputChar= input.charAt(0);
		int numLetra=0;
		for (int i = 0; i < caracteresPalabras.length; i++) {
			if (caracteresPalabras[i]==inputChar) {
				caracteresBlanco[i]=inputChar;
				//método en Java que convierte diferentes tipos de datos en una representación de cadena (String)
				blanco.set(i, String.valueOf(caracteresBlanco[i]));
				numLetra++;
				
			}
			
		}
		if (numLetra == 0) {
			error.add(input);
		}
		System.out.println(error);
		
		int contador = 0;
		int numGuiones = 0;
		
		while(contador < blanco.size()) {
			
			if(blanco.get(contador).equals("_")) {
				
				numGuiones++;
				
			}
			
			contador++;
		}
		
		if (numGuiones == 0) {
			terminado = true;
		}

		
		}
	}

}
