package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public String totalPorTipo() {
		return "a";
	}
	public String toString() {
		return "a";
	}
	public String movimiento() {
		return "a";
	}
	
	public Animal() {
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona) {
		super();
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
}
