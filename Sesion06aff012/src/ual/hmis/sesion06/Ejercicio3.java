package ual.hmis.sesion06;

public class Ejercicio3 {

	public String convertirAsteriscos(int numAsteriscos) {
		//Si el valor de entrada es negativo
		if(numAsteriscos < 0) return "número erróneo";
		
		//Si el valor de entrada es mayor de 12 -> 12 astericos
		int cantidad = (numAsteriscos > 12)? 12 : (numAsteriscos < 5)? 5 : numAsteriscos;
		
		//Mostrar resultado
		String result = "";
		for(int i=0;i<cantidad;i++) result += '*';
		
		return result;
	}
	
}
