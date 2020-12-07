package logico;

import java.util.ArrayList;
import java.util.Date;


public class Bateador extends Jugador{
	
	private EstBateador miEstadistica;
	
	public Bateador(String nombre, String posicion, int numero, float estatura, float peso, Date nacimiento, String bt,
			boolean disponible, String paisOrigen, String equipo, EstBateador miEstadistica) {
		super(nombre, posicion, numero, estatura, peso, nacimiento, bt, disponible, paisOrigen, equipo);
		this.miEstadistica = miEstadistica;
	}
	

	public EstBateador getMiEstadistica() {
		return miEstadistica;
	}


	public void setMiEstadistica(EstBateador miEstadistica) {
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
