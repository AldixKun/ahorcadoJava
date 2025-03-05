package model;

import java.util.Arrays;
import java.util.Random;

public class PalabrasTema {
	private  String [] pokemons={
			"bulbasaur","squirtle","charmander","rowlet","mimikyu","psyduck"
		};
		private  String [] zelda= {
				"link","zelda","ganondorf"
		};
		private String palabra;
		private Tematicas tema;
		
		public PalabrasTema() {
			
		}
		
		public PalabrasTema(Tematicas tematica) {
			Random random = new Random();
			int i=0;
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
		
		
//		public  String[] getPokemons() {
//			return pokemons;
//		}
	//
//		public  String[] getZelda() {
//			return zelda;
//		}
//		public  String getindexPokemon(int i) {
//			
//			return pokemons[i];
//		}
//		public  String getindexZelda(int i) {
//			
//			return zelda[i];
//		}


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
}
