package logico;

public class Estadistica {

	private int juegosJugados;
	private int turnos;
	private int carreras;
	private int dobles;
	private int triples;
	private int jonron;
	private int ponches;
	private int promedioBate;
	
	public Estadistica(int juegosJugados, int turnos, int carreras, int dobles, int triples, int jonron, int ponches,
			int promedioBate) {
		super();
		this.juegosJugados = juegosJugados;
		this.turnos = turnos;
		this.carreras = carreras;
		this.dobles = dobles;
		this.triples = triples;
		this.jonron = jonron;
		this.ponches = ponches;
		this.promedioBate = promedioBate;
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
	public int getCarreras() {
		return carreras;
	}
	public void setCarreras(int carreras) {
		this.carreras = carreras;
	}
	public int getDobles() {
		return dobles;
	}
	public void setDobles(int dobles) {
		this.dobles = dobles;
	}
	public int getTriples() {
		return triples;
	}
	public void setTriples(int triples) {
		this.triples = triples;
	}
	public int getJonron() {
		return jonron;
	}
	public void setJonron(int jonron) {
		this.jonron = jonron;
	}
	public int getPonches() {
		return ponches;
	}
	public void setPonches(int ponches) {
		this.ponches = ponches;
	}
	public int getPromedioBate() {
		return promedioBate;
	}
	public void setPromedioBate(int promedioBate) {
		this.promedioBate = promedioBate;
	}
	
	
}
