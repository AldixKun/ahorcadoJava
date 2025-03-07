package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerCsv {

	public static ArrayList<CsvPokemons> leerCsvPokemon() {
		//Archivo prueba
//		String archivo = "C:/Users/Freddy/Downloads/csvPokemon.csv";
//		String archivo = "C:/Users/Freddy/Downloads/pokemon_primera_generacion.csv"; 
		// Ruta del archivo CSV
		
		String archivo = "pokemon_primera_generacion.csv"; 
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<CsvPokemons> pokemons= new ArrayList();
		CsvPokemons pokemon= new CsvPokemons();
		
		
		//FileReader abre el archivo y BufferedREader lo lee línea por línea
		 try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
	            String linea;
	            br.readLine(); // Saltar la primera línea (encabezado)
	         
	            while ((linea = br.readLine()) != null) {
	            	//Divide la línea en un array de String, separando los valores por comas
	                String[] partes = linea.split(",");
	                String nombre = partes[0];
	                String tipo1= partes[1];
	                String tipo2= partes[2];
	                String color= partes[3];

	                //Introducimos los valores con las posiciones del array en un objeto y lo guardamos en un ArrayList
	                pokemon= new CsvPokemons(nombre, tipo1, tipo2, color);
	                pokemons.add(pokemon);
	                
	            }
	        } catch (IOException e) {
	            System.out.println("Error al leer el archivo: " + e.getMessage());
	        }

		 //LEER OBJETOS
//		 for (int i = 0; i < pokemons.size(); i++) {
//			System.out.println(pokemons.get(i).toString());
//			System.out.println("");
//		}
		 return pokemons;
		
		 
		
	}
}
