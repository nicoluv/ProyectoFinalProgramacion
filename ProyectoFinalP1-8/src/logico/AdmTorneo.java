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

	public static void setAdministracion(AdmTorneo administracion) {
		AdmTorneo.administracion = administracion;
	}
	
	public void agregarEquipo(Equipo aux) {
		misEquipos.add(aux);
	}
	
	public void agregarPartido(Juego aux) {
		misJuegos.add(aux);
	}
	
	public Equipo encontrarEquipo(String nombre) {
		 
		Equipo encontrado = null;
		
		for (Equipo aux : misEquipos) {
			if(aux.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = aux;
			}
		}
		
		return encontrado;
	}
	
	public int indiceEquipo(String nombre) {
		
		int temp = -1;
		
		for (int i = 0; i < misEquipos.size(); i++) {
			if(misEquipos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				temp = i;
			}
		}
		
		return temp;
	}
	
	public int encontrarJugador(int i, String nombre) {
		
		int temp = -1;
		
		for (int j = 0; j < misEquipos.get(i).getMisJugadores().size(); j++) {
			if(misEquipos.get(i).getMisJugadores().get(j).getNombre().equalsIgnoreCase(nombre)) {
				temp = j;
			}
		}
		
		return temp;
	}
	
	public boolean encontrarNumJug(Equipo equipo, int num) {
		
		boolean encontrado = false;
		
		for (Jugador aux : equipo.getMisJugadores()) {
			if(aux.getNumero() == num) {
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	



}
