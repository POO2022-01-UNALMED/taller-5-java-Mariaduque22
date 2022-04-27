package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList <Mamifero> listado = new ArrayList <Mamifero>();
	public static int caballos;
	public static int leones;
	private Boolean pelaje;
	private int patas;
	
	public Mamifero() {
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos += 1;
		Mamifero animal = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		return animal;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero animal = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones += 1;
		return animal;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public static int getCaballos() {
		return caballos;
	}

	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}

	public static int getLeones() {
		return leones;
	}

	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}

	public Boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(Boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
