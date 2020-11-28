package logico;

import java.util.ArrayList;
import java.util.Date;

public class Lanzador extends Jugador {

	private EstLanzador miEstadistica;

	
	
	public Lanzador(String nombre, Date fechaNacimiento, String lanzamiento, String bateo, String paisOrigen,
			String posicion, String equipo, int numero, float estatura, float peso, int edad,
			ArrayList<Lesion> lesiones) {
		super(nombre, fechaNacimiento, lanzamiento, bateo, paisOrigen, posicion, equipo, numero, estatura, peso, edad,
				lesiones);
	}

	public EstLanzador getMiEstadistica() {
		return miEstadistica;
	}

	public void setMiEstadistica(EstLanzador miEstadistica) {
		this.miEstadistica = miEstadistica;
	}

	public void agregarLesion(Lesion aux) {
		lesiones.add(aux);
	}
	
}
