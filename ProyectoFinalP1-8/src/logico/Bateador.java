package logico;

import java.util.ArrayList;
import java.util.Date;


public class Bateador extends Jugador{
	
	private Estadistica miEstadistica;



	public Bateador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT,
			boolean disponible, String paisOrigen, ArrayList<Lesion> lesiones, String equipo) {
		super(nombre, posicion, numero, estatura, peso, edad, bT, disponible, paisOrigen, lesiones, equipo);
	}

	public Estadistica getMiEstadistica() {
		return miEstadistica;
	}

	public void setMiEstadistica(Estadistica miEstadistica) {
		this.miEstadistica = miEstadistica;
	}

	public void agregarLesion(Lesion aux) {
		lesiones.add(aux);
	}

	@Override
	public float controlarDesempeno() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
