package logico;

import java.util.ArrayList;
import java.util.Date;

public class Pitcher extends Jugador {
	
	private static final long serialVersionUID = 1L;
	private EstadPitcher estad;

	public Pitcher(String nombre, Date fechaNacimiento, int peso, int altura, String lanzamiento, String bateo, String paisOrigen,
			String posicion, String equipo, ArrayList<Lesion> lesiones, int numero, int edad) {
		
		super(nombre, fechaNacimiento, peso, altura, lanzamiento, bateo, paisOrigen, posicion, equipo, lesiones, numero, edad);
		
	}

	public EstadPitcher getEstad() {
		return estad;
	}

	public void setEstad(EstadPitcher estad) {
		this.estad = estad;
	}

	public void InsertarLesion(Lesion aux) {
		HistorialLesiones.add(aux);
	}
	
}