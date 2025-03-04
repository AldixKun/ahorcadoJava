package controller;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		String palabra = "";
		
		ArrayList <String> palabras = new ArrayList <String>();
		
		palabras.add("Melon");
		palabras.add("Sandia");
		palabras.add("Platano");
		palabras.add("Kiwi");
		
		ArrayList <String> blanco = new ArrayList <String>();
	
		
		Random random= new Random();
		
		palabra= palabras.get(random.nextInt(palabras.size())) ;
		
		
		char[] caracteresPalabras = palabra.toCharArray();
		char[] caracteresInvertidos = palabra.toCharArray();
		for (int i = 0; i< caracteresPalabras.length; i++) {
		blanco.add("_");
		
		}
		
		System.out.println(blanco);
		System.out.println(palabra);
	}

}
