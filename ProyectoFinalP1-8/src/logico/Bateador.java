package logico;


public class Bateador extends Jugador{
	
	private EstBateador miEstadistica;

	
	public Bateador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT,
			EstBateador miEstadistica) {
		super(nombre, posicion, numero, estatura, peso, edad, bT);
		this.miEstadistica = miEstadistica;
	}

	public EstBateador getMiEstadistica() {
		return miEstadistica;
	}

	public void setMiEstadistica(EstBateador miEstadistica) {
		this.miEstadistica = miEstadistica;
	}

	@Override
	public float controlarDesempeno() {
		// TODO Auto-generated method stub
		return 0;
	}


}
