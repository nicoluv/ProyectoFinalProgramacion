package logico;

import java.util.ArrayList;

public class Equipo {

	private String entrenador;
	private String nombre;
	private String estadio;
	private String racha;
	private static int juegosPerdidos;
	private static int juegosGanados;
	private static int cantJugadores;
	private ArrayList<Jugador> misJugadores;

	public Equipo(String entrenador, String nombre, String estadio, String racha, ArrayList<Jugador> misJugadores) {
		super();
		this.entrenador = entrenador;
		this.nombre = nombre;
		this.estadio = estadio;
		this.racha = racha;
		this.misJugadores = misJugadores;
	}
	

	public Equipo() {
		super();
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

	public static int getJuegosPerdidos() {
		return juegosPerdidos;
	}

	public static void setJuegosPerdidos(int juegosPerdidos) {
		Equipo.juegosPerdidos = juegosPerdidos;
	}

	public static int getJuegosGanados() {
		return juegosGanados;
	}

	public static void setJuegosGanados(int juegosGanados) {
		Equipo.juegosGanados = juegosGanados;
	}

	public static int getCantJugadores() {
		return cantJugadores;
	}

	public static void setCantJugadores(int cantJugadores) {
		Equipo.cantJugadores = cantJugadores;
	}

	public ArrayList<Jugador> getMisJugadores() {
		return misJugadores;
	}

	public void setMisJugadores(ArrayList<Jugador> misJugadores) {
		this.misJugadores = misJugadores;
	}

}
