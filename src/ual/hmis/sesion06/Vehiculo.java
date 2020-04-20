package ual.hmis.sesion06;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private int tara;
	
	public Vehiculo(int numPasajeros, int numRuedas, int tara) {
		super();
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
		this.tara = tara;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public int getTara() {
		return tara;
	}
	
}
