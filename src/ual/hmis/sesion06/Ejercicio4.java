package ual.hmis.sesion06;

public class Ejercicio4 {

	public String caracteresComunes(String P1, String P2) {
	
		String result = "";
		for(char c: P1.toCharArray())
			result += (P2.indexOf(c) >= 0)? c : "";
		
		return result;
	}
	
}
