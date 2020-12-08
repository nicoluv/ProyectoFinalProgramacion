
package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String Nombre;
	private String Provincia;
	private String Estadio;
	private String Manager;
	private int Campeonatos;
	private int JugGanados;
	private int JugPerdidos;
	private int JugJugados;
	private ArrayList<Bateador> jugadores = new ArrayList<>();
	private int CantLesiones = 0;
	
	public Equipo(String nombre, String provincia, String estadio, int campeonatos, int jugGanados, int jugPerdidos, int Jugjugados, String manager) {
		super();
		Nombre = nombre;
		Provincia = provincia;
		Estadio = estadio;
		Campeonatos = campeonatos;
		JugGanados = jugGanados;
		JugPerdidos = jugPerdidos;
		JugJugados = Jugjugados;
		Manager = manager;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getEstadio() {
		return Estadio;
	}
	public void setEstadio(String estadio) {
		Estadio = estadio;
	}
	public int getCampeonatos() {
		return Campeonatos;
	}
	public void setCampeonatos(int campeonatos) {
		Campeonatos = campeonatos;
	}
	public int getJugGanados() {
		return JugGanados;
	}
	public void setJugGanados(int jugGanados) {
		JugGanados = jugGanados;
	}
	public int getJugPerdidos() {
		return JugPerdidos;
	}
	public void setJugPerdidos(int jugPerdidos) {
		JugPerdidos = jugPerdidos;
	}
	public ArrayList<Bateador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Bateador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void InsertarJugador(Bateador aux) {
		jugadores.add(aux);
	}


	public int getJugJugados() {
		return JugJugados;
	}


	public void setJugJugados(int jugJugados) {
		JugJugados = jugJugados;
	}
	
	public void Victoria() {
		JugJugados++;
		JugGanados++;
	}
	
	public void Derrota() {
		JugJugados++;
		JugPerdidos++;
	}


	public String getManager() {
		return Manager;
	}


	public void setManager(String manager) {
		Manager = manager;
	}


	public int getCantLesiones() {
		return CantLesiones;
	}


	public void setCantLesiones(int cantLesiones) {
		CantLesiones = cantLesiones;
	}
}