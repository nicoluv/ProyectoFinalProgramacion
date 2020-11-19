package logico;

import java.util.ArrayList;

public abstract class Jugador {

    protected String nombre;
    protected String posicion;
    protected  int numero;
    protected  float estatura;
    protected float peso;
    protected int edad; 
    protected String BT;
    protected ArrayList<Lesion> lesiones;
    
	public Jugador(String nombre, String posicion, int numero, float estatura, float peso, int edad, String bT) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numero = numero;
		this.estatura = estatura;
		this.peso = peso;
		this.edad = edad;
		BT = bT;
		this.lesiones = new ArrayList<Lesion>();
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



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getBT() {
		return BT;
	}



	public void setBT(String bT) {
		BT = bT;
	}



	public ArrayList<Lesion> getLesiones() {
		return lesiones;
	}



	public void setLesiones(ArrayList<Lesion> lesiones) {
		this.lesiones = lesiones;
	}



	public abstract float controlarDesempeno();
    
}
