package model;

public class Tienda {
	 private String nombre;
	    private int precio;
	    private Tipo tipo;
	    private boolean tener;



	    public Tienda(String nombre, Tipo tipo, int precio, boolean tener) {
	    	this.nombre=nombre;
	    	this.precio=precio;
	    	this.tipo=tipo;
	    	this.tener=tener;
	    }



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public int getPrecio() {
			return precio;
		}



		public void setPrecio(int precio) {
			this.precio = precio;
		}



		public Tipo getTipo() {
			return tipo;
		}



		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}



		public boolean isTener() {
			return tener;
		}



		public void setTener(boolean tener) {
			this.tener = tener;
		}



		@Override
		public String toString() {
			return "Tienda [nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", tener=" + tener + "]";
		}
		
		
	    
}
