package logico;

import java.util.Date;

public class Lesion {
	
	private Date fechaLesion;
	private String tipo;
	private String descripcion;
	private Date retornoEsperado;
	
	public Lesion(Date fechaLesion, String tipo, String descripcion, Date retornoEsperado) {
		super();
		//this.fechaLesion = new Date();
		this.fechaLesion = fechaLesion;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.retornoEsperado = retornoEsperado;
	}
	
	public Date getFechaLesion() {
		return fechaLesion;
	}
	public void setFechaLesion(Date fechaLesion) {
		this.fechaLesion = fechaLesion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getRetornoEsperado() {
		return retornoEsperado;
	}
	public void setRetornoEsperado(Date retornoEsperado) {
		this.retornoEsperado = retornoEsperado;
	}
}
