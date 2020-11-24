package logico;

public class EstBateador extends Bateador {
	
	 private int juegosJugados;
	 private int turnos;
	 private int hitsConectados;
	 private int doblesConectados;
	 private int triplesConectados;
	 private int homeRun;
	 private int basesAlcanzadas;
	 private int carrerasRemontadas;
	 private int basePorBola;
	 private int ponches;
	 private int basesRobadas;
	 private int outRobo;
	 private int doblePlay;
	
	  
	 
	 public EstBateador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT,
			EstBateador miEstadistica, int juegosJugados, int turnos, int hitsConectados, int doblesConectados,
			int triplesConectados, int homeRun, int basesAlcanzadas, int carrerasRemontadas, int basePorBola,
			int ponches, int basesRobadas, int outRobo, int doblePlay) {
		super(nombre, posicion, numero, estatura, peso, edad, bT, miEstadistica);
		this.juegosJugados = 0;
		this.turnos = 0;
		this.hitsConectados = 0;
		this.doblesConectados = 0;
		this.triplesConectados = 0;
		this.homeRun = 0;
		this.basesAlcanzadas = 0;
		this.carrerasRemontadas = 0;
		this.basePorBola = 0;
		this.ponches = 0;
		this.basesRobadas = 0;
		this.outRobo = 0;
		this.doblePlay = 0;
	}
	public int getJuegosJugados() {
		return juegosJugados;
	}
	public void setJuegosJugados(int juegosJugados) {
		this.juegosJugados = juegosJugados;
	}
	public int getTurnos() {
		return turnos;
	}
	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}
	public int getHitsConectados() {
		return hitsConectados;
	}
	public void setHitsConectados(int hitsConectados) {
		this.hitsConectados = hitsConectados;
	}
	public int getDoblesConectados() {
		return doblesConectados;
	}
	public void setDoblesConectados(int doblesConectados) {
		this.doblesConectados = doblesConectados;
	}
	public int getTriplesConectados() {
		return triplesConectados;
	}
	public void setTriplesConectados(int triplesConectados) {
		this.triplesConectados = triplesConectados;
	}
	public int getHomeRun() {
		return homeRun;
	}
	public void setHomeRun(int homeRun) {
		this.homeRun = homeRun;
	}
	public int getBasesAlcanzadas() {
		return basesAlcanzadas;
	}
	public void setBasesAlcanzadas(int basesAlcanzadas) {
		this.basesAlcanzadas = basesAlcanzadas;
	}
	public int getCarrerasRemontadas() {
		return carrerasRemontadas;
	}
	public void setCarrerasRemontadas(int carrerasRemontadas) {
		this.carrerasRemontadas = carrerasRemontadas;
	}
	public int getBasePorBola() {
		return basePorBola;
	}
	public void setBasePorBola(int basePorBola) {
		this.basePorBola = basePorBola;
	}
	public int getPonches() {
		return ponches;
	}
	public void setPonches(int ponches) {
		this.ponches = ponches;
	}
	public int getBasesRobadas() {
		return basesRobadas;
	}
	public void setBasesRobadas(int basesRobadas) {
		this.basesRobadas = basesRobadas;
	}
	public int getOutRobo() {
		return outRobo;
	}
	public void setOutRobo(int outRobo) {
		this.outRobo = outRobo;
	}
	public int getDoblePlay() {
		return doblePlay;
	}
	public void setDoblePlay(int doblePlay) {
		this.doblePlay = doblePlay;
	}

	public float controlarDesempeno() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
