package logico;

import java.io.Serializable;
import java.util.Date;

public class Lesion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaLesion;
	private String tipo;
	private String localizacion;
	private String descripcion;
	private int diasDescanso;

	
	

	
	public Lesion(Date fechaLesion, String tipo, String localizacion, String descripcion, int diasDescanso) {
		super();
		this.fechaLesion = fechaLesion;
		this.tipo = tipo;
		this.localizacion = localizacion;
		this.descripcion = descripcion;
		this.diasDescanso = diasDescanso;
	}

	

	public int getDiasDescanso() {
		return diasDescanso;
	}



	public void setDiasDescanso(int diasDescanso) {
		this.diasDescanso = diasDescanso;
	}



	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
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
	
}
