package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Objetos extends Tienda{
	
	 static Objetos pista = new Objetos("Pista", Tipo.BUFO, 5, false);
	 static Objetos clon = new Objetos("Clon de Sombra", Tipo.BUFO, 15, false);
	 static Objetos vidaExtra = new Objetos("Letra", Tipo.BUFO, 10, false);
	 static Objetos falloDoble = new Objetos("Doble fallo", Tipo.DEBUFO, 5, false);
	 static Objetos TemaRandom = new Objetos("Tema Random", Tipo.DEBUFO, 10, false);
	 static Objetos unaVida = new Objetos("ONE HIT", Tipo.DEBUFO, 15, false);
	
	 
	 
	public Objetos(String nombre, Tipo tipo, int precio, boolean tener) {
	    super(nombre,tipo, precio, tener);


	}
	public static void pregImprimirObjetos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué quieres ver?");
		System.out.println("1)Bufos");
		System.out.println("2)Debufos");
		int input= sc.nextInt();
		Menu.introducirinfobien(input, 2);
		imprimirObjetos(input);
	}
	public static void imprimirObjetos(int input) {
		ArrayList <Objetos> objetos = new ArrayList<>();
		objetos=asignarArraysObjetos(input,objetos);
		for (int i = 0; i < objetos.size(); i++) {
			System.out.println(objetos.get(i));
		}
	}
	public static ArrayList<Objetos> asignarArraysObjetos(int input, ArrayList<Objetos> objetos) {
		if (input==1) {
			objetos.add(pista);
			objetos.add(clon);
			objetos.add(vidaExtra);
		}else {
			objetos.add(falloDoble);
			objetos.add(TemaRandom);
			objetos.add(unaVida);
		}
		return objetos;
		
	}

	   

}
