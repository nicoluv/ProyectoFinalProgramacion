package logico;

import java.util.ArrayList;
import java.util.Date;

public abstract class Jugador {

    protected String nombre;
    protected Date fechaNacimiento;
    protected String lanzamiento;
    protected String bateo;
    protected String paisOrigen;
    protected String posicion;
    protected String equipo;
    protected int numero;
    protected boolean estado = true;
    protected float estatura;
    protected float peso;
    protected int edad; 
    protected Lesion miLesion;
    protected ArrayList<Lesion> lesiones;
	
    
    
    
    public Jugador(String nombre, Date fechaNacimiento, String lanzamiento, String bateo, String paisOrigen,
			String posicion, String equipo, int numero, float estatura, float peso, int edad,
			 ArrayList<Lesion> lesiones) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.lanzamiento = lanzamiento;
		this.bateo = bateo;
		this.paisOrigen = paisOrigen;
		this.posicion = posicion;
		this.equipo = equipo;
		this.numero = numero;
		this.estatura = estatura;
		this.peso = peso;
		this.edad = edad;
		this.lesiones = new ArrayList<>();
	}
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getLanzamiento() {
		return lanzamiento;
	}
	public void setLanzamiento(String lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	public String getBateo() {
		return bateo;
	}
	public void setBateo(String bateo) {
		this.bateo = bateo;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
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
	public Lesion getMiLesion() {
		return miLesion;
	}
	public void setMiLesion(Lesion miLesion) {
		this.miLesion = miLesion;
	}
	public ArrayList<Lesion> getLesiones() {
		return lesiones;
	}
	public void setLesiones(ArrayList<Lesion> lesiones) {
		this.lesiones = lesiones;
	}
    
    
    
    
}