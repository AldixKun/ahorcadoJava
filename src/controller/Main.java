package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] tematicas= {"Pokemon","Zelda"};
		ArrayList <String> blanco = new ArrayList <String>();
		ArrayList<String> error = new ArrayList <String>();
		boolean terminado=false;
		
		
		System.out.println("¿Qué modo quieres jugar? (Introduce el número correspondiente)");
		for (int i = 0; i < tematicas.length; i++) {
			System.out.println("\r\n"+(i+1)+") "+tematicas[i]);
		}
		int inputNum = sc.nextInt();
		inputNum=introducirinfobien(inputNum,tematicas.length);
		PalabrasTema generarPalabra = new PalabrasTema ();
		//Asignar tematica Palabra
		switch (inputNum) {
			case 1:
				generarPalabra = new PalabrasTema (Tematicas.POKEMON);				
				break;
			case 2:
				generarPalabra = new PalabrasTema(Tematicas.ZELDA);
				break;
		}
		
		//Asignar espacios en blanco+ array con chars
		String palabra= generarPalabra.getPalabra();
		System.out.println(palabra);
		char[] caracteresPalabras = palabra.toCharArray();
		char[] caracteresBlanco = palabra.toCharArray();
		for (int i = 0; i< caracteresPalabras.length; i++) {
		blanco.add("_");
		}
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
		System.out.println(blanco);
		System.out.println("FELICIDADES :D");
		
	
	}
	
	

	
	public static int introducirinfobien(int opcion,int numopciones) {
		Scanner sc = new Scanner(System.in);
		while (opcion>numopciones || opcion<=0) {
			System.out.println("Introduce la información correctamente");
			opcion=sc.nextInt();
		}
		return opcion;
	}
}
