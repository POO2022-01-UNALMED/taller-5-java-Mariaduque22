package gestion;
import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for(int cant = 0; cant < this.zona.size(); cant++) {
			cantidad += this.zona.get(cant).cantidadAnimales();
		}
		
		return cantidad;
	}

	
	public void agregarZonas(Zona zona) {
		this.zona.add(zona);			
	}   
	
	public Zoologico() {
		this(null, null);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zona;
	}
	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	
}
