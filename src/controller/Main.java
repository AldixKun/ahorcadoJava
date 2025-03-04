package controller;

import model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

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
		char[] caracteresBlanco = palabra.toCharArray();
		for (int i = 0; i< caracteresPalabras.length; i++) {
		blanco.add("_");
		
		}
		System.out.println(palabra);
		System.out.println(blanco);
		String input = sc.next();
		input=input.toLowerCase();
		
		while(input.length()>1 || input.length()<0) {
			System.out.println("Introduce un caracter");
			input=sc.next();
		}
		
		//charAt consigue el primer caracter del String
		char inputChar= input.charAt(0);
		
		for (int i = 0; i < caracteresPalabras.length; i++) {
			if (caracteresPalabras[i]==inputChar) {
				caracteresBlanco[i]=inputChar;
				//método en Java que convierte diferentes tipos de datos en una representación de cadena (String)
				blanco.set(i, String.valueOf(caracteresBlanco[i]));
			}
		}
		System.out.println(blanco);
		
		System.out.println(palabra);
	}

}
