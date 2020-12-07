package logico;

import java.util.ArrayList;
import java.util.Date;

public abstract class Jugador {

    protected String nombre;
    protected String posicion;
    protected int numero;
    protected float estatura;
    protected float peso;
    protected Date nacimiento; 
    protected String bt;
    protected boolean disponible  = true;
    protected String paisOrigen;
    protected ArrayList<Lesion> lesiones;
    protected String equipo;
    
	public Jugador(String nombre, String posicion, int numero, float estatura, float peso, Date nacimiento, String bt,
			boolean disponible, String paisOrigen, String equipo) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numero = numero;
		this.estatura = estatura;
		this.peso = peso;
		this.nacimiento = nacimiento;
		this.bt = bt;
		this.disponible = disponible;
		this.paisOrigen = paisOrigen;
		this.lesiones = new ArrayList<Lesion>();
		this.equipo= equipo;
	}

// 

	public boolean isDisponible() {
		return disponible;
	}



	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	public String getPaisOrigen() {
		return paisOrigen;
	}



	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



	public String getEquipo() {
		return equipo;
	}



	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public float getEstatura() {
		return estatura;
	}



	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}


	public String getBt() {
		return bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
	}

	public ArrayList<Lesion> getLesiones() {
		return lesiones;
	}


	public void setLesiones(ArrayList<Lesion> lesiones) {
		this.lesiones = lesiones;
	}


	public abstract float controlarDesempeno();
    
}