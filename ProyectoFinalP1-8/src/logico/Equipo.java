 package logico;

import java.util.ArrayList;

public class Equipo {

	private String entrenador;
	private String nombre;
	private String estadio;
	private String racha;
	private int campeonatos;
	private int seriesCaribe;
	private int juegosPerdidos;
	private int juegosGanados;
	private int juegosJugados;
	private int cantJugadores;
	private ArrayList<Jugador> misJugadores = new ArrayList<>();



	

	public Equipo(String entrenador, String nombre, String estadio, String racha, int campeonatos, int seriesCaribe,
			int juegosPerdidos, int juegosGanados) {
		super();
		this.entrenador = entrenador;
		this.nombre = nombre;
		this.estadio = estadio;
		this.racha = racha;
		this.campeonatos = campeonatos;
		this.seriesCaribe = seriesCaribe;
		this.juegosPerdidos = juegosPerdidos;
		this.juegosGanados = juegosGanados;
	}


	public int getCampeonatos() {
		return campeonatos;
	}


	public void setCampeonatos(int campeonatos) {
		this.campeonatos = campeonatos;
	}


	public int getSeriesCaribe() {
		return seriesCaribe;
	}


	public void setSeriesCaribe(int seriesCaribe) {
		this.seriesCaribe = seriesCaribe;
	}


	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getRacha() {
		return racha;
	}

	public void setRacha(String racha) {
		this.racha = racha;
	}


	public int getJuegosPerdidos() {
		return juegosPerdidos;
	}


	public void setJuegosPerdidos(int juegosPerdidos) {
		this.juegosPerdidos = juegosPerdidos;
	}


	public int getJuegosGanados() {
		return juegosGanados;
	}


	public void setJuegosGanados(int juegosGanados) {
		this.juegosGanados = juegosGanados;
	}

	

	public int getJuegosJugados() {
		return juegosJugados;
	}


	public void setJuegosJugados(int juegosJugados) {
		this.juegosJugados = juegosJugados;
	}


	public int getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	public ArrayList<Jugador> getMisJugadores() {
		return misJugadores;
	}

	public void setMisJugadores(ArrayList<Jugador> misJugadores) {
		this.misJugadores = misJugadores;
	}
	
	public void agregarJugador(Jugador aux) {

		misJugadores.add(aux);
		cantJugadores++;
	}
	
	public void agregarJuegPerdido() {
		juegosPerdidos++;
		juegosJugados++;
	}
	
	public void agregarJuegGanado() {
		juegosGanados++;
		juegosJugados++;
	}	
	
	
	
	
	
	
	

}