package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {
	
	private int numMaxPasajeros;
	private int maxNumVehiculos;
	private int pesoMaxVehiculos;
	private int totalPasajeros;
	private int pesoTotalVehiculos;
	
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Ferry(int numMaxPasajeros, int maxNumVehiculos,  int pesoMaxVehiculo) {
		super();
		this.numMaxPasajeros = numMaxPasajeros;
		this.maxNumVehiculos = maxNumVehiculos;
		this.pesoMaxVehiculos = pesoMaxVehiculo;
		this.totalPasajeros = 0;
		this.pesoTotalVehiculos = 0;
	}

	public boolean embarcarVehiculo(Vehiculo v){
		if(superadoMaximoVehiculos()) return false;
		if(pesoTotalVehiculos + v.getTara() > pesoMaxVehiculos) return false;
			
		pesoTotalVehiculos += v.getTara();
		return vehiculos.add(v);
	}
	
	public int totalVehiculos() {
		return vehiculos.size();
	}
	
	public boolean vacio() {
		return vehiculos.isEmpty();
	}
	
	public boolean superadoMaximoVehiculos(){
		return maxNumVehiculos <= vehiculos.size();
	}
	
}

