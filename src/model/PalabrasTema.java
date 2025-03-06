package model;

import java.util.Arrays;
import java.util.Random;

public class PalabrasTema {
	private  String [] pokemons={
			"Bulbasaur","Squirtle","Charmander","Rowlet","Mimikyu","Psyduck"
		};
		private  String [] zelda= {
				"link","zelda","ganondorf"
		};
		private String palabra;
		private Tematicas tema;
		private int i=0;
		public PalabrasTema() {
			
		}
		
		public PalabrasTema(Tematicas tematica) {
			Random random = new Random();
			
			if (tematica==Tematicas.POKEMON) {
				i=random.nextInt(pokemons.length);
				palabra=pokemons[i];
				this.tema=tematica;
			}else if(tematica==Tematicas.ZELDA) {
				i=random.nextInt(zelda.length);
				palabra=zelda[i];
				this.tema=tematica;
			}
		}
		


		@Override
		public String toString() {
			return "Pokemon [pokemons=" + Arrays.toString(pokemons) + ", zelda=" + Arrays.toString(zelda) + "]";
		}
		
		public String getPalabra() {
			return palabra;
			
			
		}
		public void getTematicas() {
			System.out.println(this.tema);
		}
		
		//PRUEBAS
		
		public String getCategoria() {
			String categoria="";
			if (tema==Tematicas.POKEMON) {
				if (i>=0 && i<2) {
					categoria="Planta";
				}else if (i>=2 && i<4) {
					categoria= "Fuego";
				}else {
					categoria="Psiquico";
				}
			}else if(tema==Tematicas.ZELDA) {
				
			}
			return categoria;
		}
		
		
}
