package logico;

import java.io.Serializable;

public class EstadPitcher implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int JuegosIni;
	private int HitsPitch;
	private int CarrPitch, CarrLimpias;
	private int JonronPitch;
	private int BBPitch;
	private int Ponches;
	private int Vict, Der;
	private float PromCL;
	private int EntradasJugadas;
	
	public EstadPitcher(int juegosIni, int hitsPitch, int carrPitch, int carrLimpias, int jonronPitch, int bBPitch,
			int ponches, int vict, int der, float promCL, int EntradasJugadas) {
		super();
		JuegosIni = juegosIni;
		HitsPitch = hitsPitch;
		CarrPitch = carrPitch;
		CarrLimpias = carrLimpias;
		JonronPitch = jonronPitch;
		BBPitch = bBPitch;
		Ponches = ponches;
		Vict = vict;
		Der = der;
		PromCL = promCL;
	}

	public int getJuegosIni() {
		return JuegosIni;
	}

	public void setJuegosIni(int juegosIni) {
		JuegosIni = juegosIni;
	}

	public int getHitsPitch() {
		return HitsPitch;
	}

	public void setHitsPitch(int hitsPitch) {
		HitsPitch = hitsPitch;
	}

	public int getCarrPitch() {
		return CarrPitch;
	}

	public void setCarrPitch(int carrPitch) {
		CarrPitch = carrPitch;
	}

	public int getCarrLimpias() {
		return CarrLimpias;
	}

	public void setCarrLimpias(int carrLimpias) {
		CarrLimpias = carrLimpias;
	}

	public int getJonronPitch() {
		return JonronPitch;
	}

	public void setJonronPitch(int jonronPitch) {
		JonronPitch = jonronPitch;
	}

	public int getBBPitch() {
		return BBPitch;
	}

	public void setBBPitch(int bBPitch) {
		BBPitch = bBPitch;
	}

	public int getPonches() {
		return Ponches;
	}

	public void setPonches(int ponches) {
		Ponches = ponches;
	}

	public int getVict() {
		return Vict;
	}

	public void setVict(int vict) {
		Vict = vict;
	}

	public int getDer() {
		return Der;
	}

	public void setDer(int der) {
		Der = der;
	}

	public float getPromCL() {
		return PromCL;
	}

	public void setPromCL(float promCL) {
		PromCL = promCL;
	}
	
	public int getEntradasJugadas() {
		return EntradasJugadas;
	}

	public void setEntradasJugadas(int entradasJugadas) {
		EntradasJugadas = entradasJugadas;
	}

	public void PromCL() {
		float aux = 0;
		aux = (float) (CarrLimpias * 9) / EntradasJugadas;
		setPromCL(aux);
	}
}