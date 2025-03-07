package model;

import java.util.Scanner;

import controller.Main;

public class Menu {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		imprimirMenu();
		int input=sc.nextInt();
		introducirinfobien(input, 4);
		switch (input) {
		case 1:
			PalabrasTema palabra = new PalabrasTema ();
			palabra= seleccionTematica();
			Juego.juego(palabra);
			break;
		case 2:
			tienda();
			break;	
		case 3:
			ayuda();
			break;	
			

		default:
			break;
		}
		
	}
	public static void imprimirMenu() {
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1)Jugar\n2)Tienda\n3)Ayuda\n4)Salir");
	}
	public static PalabrasTema seleccionTematica() {
		Scanner sc = new Scanner(System.in);
		String [] tematicas= {"Pokemon","Zelda"};
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
//		Juego.juego();
//		Main.main(tematicas);
		return generarPalabra;
		
	}
	public static void tienda() {
		
		
	}
	public static void ayuda() {
		
		
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
