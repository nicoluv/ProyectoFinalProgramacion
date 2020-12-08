package logico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Administracion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Equipo> MisEquipos;
	private ArrayList<Partido> MisPartidos;
	private static Administracion MiAdmin = null;
	
	private Administracion() {
		super();
		MisPartidos = new ArrayList<>();
		MisEquipos = new ArrayList<>();
	}
	
	public static Administracion getInstancia() {
		if(MiAdmin == null) {
			MiAdmin = new Administracion();
		}
		return MiAdmin;
	}
	
	public static void setAdministracion(Administracion admi) {
		Administracion.MiAdmin = admi;
	}

	public ArrayList<Equipo> getMisEquipos() {
		return MisEquipos;
	}

	public void setMisEquipos(ArrayList<Equipo> misEquipos) {
		MisEquipos = misEquipos;
	}

	public ArrayList<Partido> getMisPartidos() {
		return MisPartidos;
	}

	public void setMisPartidos(ArrayList<Partido> misPartidos) {
		MisPartidos = misPartidos;
	}
	
	public void insertarEquipo(Equipo aux) {
		MisEquipos.add(aux);
	}
	
	public void insertarPartido(Partido aux) {
		MisPartidos.add(aux);
	}
	
	public Equipo buscarEquipo(String nom) {
		
		for (Equipo i : MisEquipos) {
			if(i.getNombre() == nom) {
				return i;
			}
		}
		
		return null;
	}
	
	public int findEquipo(String nom) {
		
		for (int i = 0; i < MisEquipos.size(); i++) {
			if(MisEquipos.get(i).getNombre() == nom) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int findJugador(int i, String nom) {
		
		for (int j = 0; j < MisEquipos.get(i).getJugadores().size(); j++) {
			if(MisEquipos.get(i).getJugadores().get(j).getNombre() == nom) {
				return j;
			}
		}
		
		return -1;
	}
	
	public boolean buscarNumJug(Equipo e, int num) {
		
		for (Jugador i : e.getJugadores()) {
			if(i.getNumero() == num) {
				return true;
			}
		}
		
		return false;
	}
	
	public void Guardar(Administracion admi) {
		File f = new File("Datos.dat");
		
		try {
			FileOutputStream datos = new FileOutputStream(f);
			ObjectOutputStream obj = new ObjectOutputStream(datos);
			obj.writeObject(admi);
			obj.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Administracion Cargar() {
		
		Administracion admi = null;
		
		try {
			FileInputStream f = new FileInputStream("Datos.dat");
			ObjectInputStream obj = new ObjectInputStream(f);
			admi = (Administracion) obj.readObject();
			obj.close();
		} catch (Exception e) {
		}
		
		return admi;
	}
	
	public int findPitcher(int e) {
		int cont = 0;
		for (Jugador i : Administracion.getInstancia().getMisEquipos().get(e).getJugadores()) {
			if(i instanceof Pitcher) {
				return cont;
			}
			cont++;
		}
		
		return -1;
	}
}
