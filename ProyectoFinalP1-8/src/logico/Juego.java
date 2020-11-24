package logico;

import java.util.Date;

public class Juego {
	private Equipo casa;
	private Equipo visitante;
	private int puntosCasa;
	private int puntosVisitante;
	private String estadio;
	private Date fechaDelPartido;
	private Boolean jugado;

	public Juego(Equipo casa, Equipo visitante, int puntosCasa, int puntosVisitante, String estadio,
			Date fechaDelPartido, Boolean jugado) {
		super();
		this.casa = casa;
		this.visitante = visitante;
		this.puntosCasa = puntosCasa;
		this.puntosVisitante = puntosVisitante;
		this.estadio = estadio;
		this.fechaDelPartido = fechaDelPartido;
		this.jugado = jugado;
	}

	public Equipo getCasa() {
		return casa;
	}

	public void setCasa(Equipo casa) {
		this.casa = casa;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public int getPuntosCasa() {
		return puntosCasa;
	}

	public void setPuntosCasa(int puntosCasa) {
		this.puntosCasa = puntosCasa;
	}

	public int getPuntosVisitante() {
		return puntosVisitante;
	}

	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public Date getFechaDelPartido() {
		return fechaDelPartido;
	}

	public void setFechaDelPartido(Date fechaDelPartido) {
		this.fechaDelPartido = fechaDelPartido;
	}

	public Boolean getJugado() {
		return jugado;
	}

	public void setJugado(Boolean jugado) {
		this.jugado = jugado;
	}

}
