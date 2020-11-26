package logico;

public class EstLanzador {
	
	private int juegosLanzados;
	private int aperturas;
	private int juegosCompletos;
	private int juegosGanados;
	private int juegosPerdidos;
	private int blanqueo;
	private int juegosSalvaods;
	private int iningLanzados;
	private int hitsPermitidos;
	private int carrerasPermitidas;
	private int carrerasLimpias;
	private int ponches;
	private int basePorBola;
	private int deBall;
	
	
	public EstLanzador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT,
			EstLanzador miEstadistica, int juegosLanzados, int aperturas, int juegosCompletos, int juegosGanados,
			int juegosPerdidos, int blanqueo, int juegosSalvaods, int iningLanzados, int hitsPermitidos,
			int carrerasPermitidas, int carrerasLimpias, int ponches, int basePorBola, int deBall) {
		super();
		this.juegosLanzados = 0;
		this.aperturas = 0;
		this.juegosCompletos = 0;
		this.juegosGanados = 0;
		this.juegosPerdidos = 0;
		this.blanqueo = 0;
		this.juegosSalvaods = 0;
		this.iningLanzados = 0;
		this.hitsPermitidos = 0;
		this.carrerasPermitidas = 0;
		this.carrerasLimpias = 0;
		this.ponches = 0;
		this.basePorBola = 0;
		this.deBall = 0;
	}
	
	public int getJuegosLanzados() {
		return juegosLanzados;
	}
	public void setJuegosLanzados(int juegosLanzados) {
		this.juegosLanzados = juegosLanzados;
	}
	public int getAperturas() {
		return aperturas;
	}
	public void setAperturas(int aperturas) {
		this.aperturas = aperturas;
	}
	public int getJuegosCompletos() {
		return juegosCompletos;
	}
	public void setJuegosCompletos(int juegosCompletos) {
		this.juegosCompletos = juegosCompletos;
	}
	public int getJuegosGanados() {
		return juegosGanados;
	}
	public void setJuegosGanados(int juegosGanados) {
		this.juegosGanados = juegosGanados;
	}
	public int getJuegosPerdidos() {
		return juegosPerdidos;
	}
	public void setJuegosPerdidos(int juegosPerdidos) {
		this.juegosPerdidos = juegosPerdidos;
	}
	public int getBlanqueo() {
		return blanqueo;
	}
	public void setBlanqueo(int blanqueo) {
		this.blanqueo = blanqueo;
	}
	public int getJuegosSalvaods() {
		return juegosSalvaods;
	}
	public void setJuegosSalvaods(int juegosSalvaods) {
		this.juegosSalvaods = juegosSalvaods;
	}
	public int getIningLanzados() {
		return iningLanzados;
	}
	public void setIningLanzados(int iningLanzados) {
		this.iningLanzados = iningLanzados;
	}
	public int getHitsPermitidos() {
		return hitsPermitidos;
	}
	public void setHitsPermitidos(int hitsPermitidos) {
		this.hitsPermitidos = hitsPermitidos;
	}
	public int getCarrerasPermitidas() {
		return carrerasPermitidas;
	}
	public void setCarrerasPermitidas(int carrerasPermitidas) {
		this.carrerasPermitidas = carrerasPermitidas;
	}
	public int getCarrerasLimpias() {
		return carrerasLimpias;
	}
	public void setCarrerasLimpias(int carrerasLimpias) {
		this.carrerasLimpias = carrerasLimpias;
	}
	public int getPonches() {
		return ponches;
	}
	public void setPonches(int ponches) {
		this.ponches = ponches;
	}
	public int getBasePorBola() {
		return basePorBola;
	}
	public void setBasePorBola(int basePorBola) {
		this.basePorBola = basePorBola;
	}
	public int getDeBall() {
		return deBall;
	}
	public void setDeBall(int deBall) {
		this.deBall = deBall;
	}
	
	public float controlarDesempeno() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
