package model;

public class CsvPokemons {
	private String nombre;
	private String tipo1;
	private String tipo2;
	private String color;
	
	public CsvPokemons() {
		
	}
	public CsvPokemons(String nombre, String tipo1, String tipo2, String color) {
		this.nombre=nombre;
		this.tipo1=tipo1;
		this.tipo2=tipo2;
		this.color=color;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo1() {
		return tipo1;
	}
	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "CsvPokemons [nombre=" + nombre + ", tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", color=" + color + "]";
	}
	
	
	
}
