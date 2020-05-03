package ual.hmis.sesion06;

/**
 * @author Alberto Fuentes
 */

public class Ejercicio2 {
	
	/**
	 * Expresion regular para verificar la contraseña
	 */
	private String expresionRegular = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{3,}";

	/**
	 * Iniciar sesion
	 * @param username
	 * @param password
	 * @return true o false
	 */
	public boolean login (final String username,final String password){
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty()){
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30){
			return false;
		}
		//password debe tener al menos una letra mayuscula, una minuscula y un digito
		if(!password.matches(expresionRegular)){
			return false;
		}
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	/**
	 * Comprobar inicio de seion
	 * @param username
	 * @param password
	 * @return true o false
	 */
	public boolean compruebaLoginEnBD (final String username, final String password){
		return (username.equals("user") && password.equals("Pass1"));
	}
	
}
