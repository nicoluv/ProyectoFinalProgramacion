package logico;

import java.util.ArrayList;
import java.util.Date;

public class Lanzador extends Jugador {

	private EstLanzador miEstadistica;

	

	public Lanzador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT,
			boolean disponible, String paisOrigen, ArrayList<Lesion> lesiones, String equipo) {
		super(nombre, posicion, numero, estatura, peso, edad, bT, disponible, paisOrigen, lesiones, equipo);
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

	@Override
	public float controlarDesempeno() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
