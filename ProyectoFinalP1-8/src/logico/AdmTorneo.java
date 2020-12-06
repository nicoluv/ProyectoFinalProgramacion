package logico;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.*;

public class AdmTorneo implements Serializable{
	
	private ArrayList<Equipo> misEquipos;
	private ArrayList<Juego> misJuegos;
	private static AdmTorneo administracion = null;
	private static final long serialVersionUID = 1L;
	
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
	
	public void GuardarInfo(AdmTorneo admi) {
		
		File f = new File("Info.dat");
		
		try {
			FileOutputStream inf = new FileOutputStream(f);
			ObjectOutputStream obj = new ObjectOutputStream(inf);
			obj.writeObject(admi);
			obj.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public AdmTorneo CargarInfo() {
		
		AdmTorneo aux = null;
		
		try {
			FileInputStream f = new FileInputStream("Info.dat");
			ObjectInputStream obj = new ObjectInputStream(f);
			aux = (AdmTorneo) obj.readObject();
			obj.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return aux;
	}
	

	
	



}
