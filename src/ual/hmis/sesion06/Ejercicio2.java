package ual.hmis.sesion06;

public class Ejercicio2 {
	
	private String expresionRegular = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{3,}";

	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty()) return false;
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30) return false;
		//password debe tener al menos una letra mayuscula, una minuscula y un digito
		if(!password.matches(expresionRegular)) return false;
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	public boolean compruebaLoginEnBD (String username, String password){
		return (username.equals("user") && password.equals("Pass1"));
	}
	
}
