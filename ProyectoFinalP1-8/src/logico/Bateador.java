package logico;

import java.util.ArrayList;
import java.util.Date;


public class Bateador extends Jugador{
	
	private Estadistica miEstadistica;


	public Bateador(String nombre, Date fechaNacimiento, String lanzamiento, String bateo, String paisOrigen,
			String posicion, String equipo, int numero, float estatura, float peso, int edad,
			ArrayList<Lesion> lesiones) {
		super(nombre, fechaNacimiento, lanzamiento, bateo, paisOrigen, posicion, equipo, numero, estatura, peso, edad,
				lesiones);
	}

	public Estadistica getMiEstadistica() {
		return miEstadistica;
	}

	public void setMiEstadistica(Estadistica miEstadistica) {
		this.miEstadistica = miEstadistica;
	}

	public void InsertarLesion(Lesion aux) {
		lesiones.add(aux);
	}
	
}
