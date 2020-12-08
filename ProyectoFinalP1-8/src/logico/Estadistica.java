package logico;

import java.io.Serializable;

public class Estadistica  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int AB,D,H,HR,Dobles,Triples,BB,Ponches,Errores,JuegosJug;
	private float AVG;
	
	public Estadistica(int aB, int d, int h,  int hr, int dobles, int triples, int bB, int ponches, int errores, int juegosJug, float aVG) {
		super();
		AB = aB;
		D = d;
		H = h;
		HR = hr;
		Dobles = dobles;
		Triples = triples;
		BB = bB;
		Ponches = ponches;
		Errores = errores;
		JuegosJug = juegosJug;
		AVG = aVG;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getDobles() {
		return Dobles;
	}

	public void setDobles(int dobles) {
		Dobles = dobles;
	}

	public int getTriples() {
		return Triples;
	}

	public void setTriples(int triples) {
		Triples = triples;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public int getPonches() {
		return Ponches;
	}

	public void setPonches(int ponches) {
		Ponches = ponches;
	}

	public int getErrores() {
		return Errores;
	}

	public void setErrores(int errores) {
		Errores = errores;
	}

	public int getJuegosJug() {
		return JuegosJug;
	}

	public void setJuegosJug(int juegosJug) {
		JuegosJug = juegosJug;
	}

	public float getAVG() {
		return AVG;
	}

	public void setAVG(float aVG) {
		AVG = aVG;
	}
	
	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public void AVG(int H, int AB) {
		float aux = 0;
		aux = (float) H /AB;
		setAVG(aux);
	}
	
	
}
