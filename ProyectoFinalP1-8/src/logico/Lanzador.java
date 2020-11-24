package logico;

public class Lanzador extends Jugador {

	private EstLanzador miEstadistica;

	
	
	public Lanzador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT,
			EstLanzador miEstadistica) {
		super(nombre, posicion, numero, estatura, peso, edad, bT);
		this.miEstadistica = miEstadistica;
	}

	public EstLanzador getMiEstadistica() {
		return miEstadistica;
	}

	public void setMiEstadistica(EstLanzador miEstadistica) {
		this.miEstadistica = miEstadistica;
	}

	@Override
	public float controlarDesempeno() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
