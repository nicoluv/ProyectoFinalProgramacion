package logico;

import java.io.Serializable;
import java.util.Date;

public class Lesion implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String TipoLesion;
	private Date FechaLesion;
	private int DiasRec;
	private String AtendNombre;
	private String Descripcion;
	
	public Lesion(String tipoLesion, Date fechaLesion, int diasRec, String nombre, String descripcion) {
		super();
		TipoLesion = tipoLesion;
		FechaLesion = fechaLesion;
		DiasRec = diasRec;
		AtendNombre = nombre;
		Descripcion = descripcion;
	}

	public String getTipoLesion() {
		return TipoLesion;
	}

	public void setTipoLesion(String tipoLesion) {
		TipoLesion = tipoLesion;
	}

	public Date getFechaLesion() {
		return FechaLesion;
	}

	public void setFechaLesion(Date fechaLesion) {
		FechaLesion = fechaLesion;
	}

	public int getDiasRec() {
		return DiasRec;
	}

	public void setDiasRec(int diasRec) {
		DiasRec = diasRec;
	}

	public String getAtendNombre() {
		return AtendNombre;
	}

	public void setAtendNombre(String atendNombre) {
		AtendNombre = atendNombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
