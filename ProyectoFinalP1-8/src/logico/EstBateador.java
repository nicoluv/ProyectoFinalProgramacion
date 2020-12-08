package logico;

import java.io.Serializable;

public class EstBateador  implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int juegosJugados;
	 private int turnos;
	 private int hitsConectados;
	 private int doblesConectados;
	 private int triplesConectados;
	 private int homeRun;
	 private int basesAlcanzadas;
	 private int carrerasRemontadas;
	 private int carreras;
	 private int basePorBola;
	 private int ponches;
	 private int basesRobadas;
	 private int outRobo;
	 private int doblePlay;
	 private float AVG;
	 
	 

	
	public EstBateador(int juegosJugados, int turnos, int hitsConectados, int doblesConectados, int triplesConectados,
			int homeRun, int basesAlcanzadas, int carrerasRemontadas, int carreras, int basePorBola, int ponches,
			int basesRobadas, int outRobo, int doblePlay, float aVG) {
		super();
		this.juegosJugados = juegosJugados;
		this.turnos = turnos;
		this.hitsConectados = hitsConectados;
		this.doblesConectados = doblesConectados;
		this.triplesConectados = triplesConectados;
		this.homeRun = homeRun;
		this.basesAlcanzadas = basesAlcanzadas;
		this.carrerasRemontadas = carrerasRemontadas;
		this.carreras = carreras;
		this.basePorBola = basePorBola;
		this.ponches = ponches;
		this.basesRobadas = basesRobadas;
		this.outRobo = outRobo;
		this.doblePlay = doblePlay;
		AVG = aVG;
	}
	
	public int getCarreras() {
		return carreras;
	}
	public void setCarreras(int carreras) {
		this.carreras = carreras;
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
	public float getAVG() {
		return AVG;
	}
	public void setAVG(float aVG) {
		AVG = aVG;
	}
	
	 
	 

}
