package logico;

import java.io.Serializable;
import java.util.Date;

public class Partido implements Serializable{

	private static final long serialVersionUID = 1L;
	private Equipo Visitante;
	private Equipo Local;
	private String Estadio;
	private int CarrVis, CarrLoc;
	private int ErrorVis, ErrorLoc;
	private int HitsVis, HitsLoc;
	private String Hora;
	private Date Fecha;
	private boolean Estado = true;
	private String Ganador;
	
	public Partido(Equipo visitante, Equipo local, String estadio, int carrVis, int carrLoc, int errorVis, int errorLoc,
			int hitsVis, int hitsLoc, String hora, Date fecha) {
		super();
		Visitante = visitante;
		Local = local;
		Estadio = estadio;
		CarrVis = carrVis;
		CarrLoc = carrLoc;
		ErrorVis = errorVis;
		ErrorLoc = errorLoc;
		HitsVis = hitsVis;
		HitsLoc = hitsLoc;
		Hora = hora;
		Fecha = fecha;
	}

	public Equipo getVisitante() {
		return Visitante;
	}

	public void setVisitante(Equipo visitante) {
		Visitante = visitante;
	}

	public Equipo getLocal() {
		return Local;
	}

	public void setLocal(Equipo local) {
		Local = local;
	}

	public String getEstadio() {
		return Estadio;
	}

	public void setEstadio(String estadio) {
		Estadio = estadio;
	}

	public int getCarrVis() {
		return CarrVis;
	}

	public void setCarrVis(int carrVis) {
		CarrVis = carrVis;
	}

	public int getCarrLoc() {
		return CarrLoc;
	}

	public void setCarrLoc(int carrLoc) {
		CarrLoc = carrLoc;
	}

	public int getErrorVis() {
		return ErrorVis;
	}

	public void setErrorVis(int errorVis) {
		ErrorVis = errorVis;
	}

	public int getErrorLoc() {
		return ErrorLoc;
	}

	public void setErrorLoc(int errorLoc) {
		ErrorLoc = errorLoc;
	}

	public int getHitsVis() {
		return HitsVis;
	}

	public void setHitsVis(int hitsVis) {
		HitsVis = hitsVis;
	}

	public int getHitsLoc() {
		return HitsLoc;
	}

	public void setHitsLoc(int hitsLoc) {
		HitsLoc = hitsLoc;
	}
	
	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}

	public String getGanador() {
		return Ganador;
	}

	public void setGanador(String ganador) {
		Ganador = ganador;
	}


	
}
