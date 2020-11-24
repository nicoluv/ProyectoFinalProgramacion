package logico;

import java.util.ArrayList;

public class AdmTorneo {
	private ArrayList<Equipo> misEquipos;
	private ArrayList<Juego> misJuegos;
	private static AdmTorneo administracion = null;
	
	private AdmTorneo() {
		super();
	
		misEquipos = new ArrayList<>();
		misJuegos = new ArrayList<>();
	}
	
	public static AdmTorneo getInstancia() {
		if(administracion == null) {
			administracion = new AdmTorneo();
		}
		return administracion;
	}


	public ArrayList<Equipo> getMisEquipos() {
		return misEquipos;
	}

	public void setMisEquipos(ArrayList<Equipo> misEquipos) {
		this.misEquipos = misEquipos;
	}

	public ArrayList<Juego> getMisJuegos() {
		return misJuegos;
	}

	public void setMisJuegos(ArrayList<Juego> misJuegos) {
		this.misJuegos = misJuegos;
	}

	public static AdmTorneo getAdministracion() {
		return administracion;
	}

	public static void setAdministracion(AdmTorneo administracion) {
		AdmTorneo.administracion = administracion;
	}

}
