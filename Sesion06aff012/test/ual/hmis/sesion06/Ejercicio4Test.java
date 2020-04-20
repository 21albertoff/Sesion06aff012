package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {

	@ParameterizedTest  (name = "{index} => Con las cadenas ({0}) y ({1}) coinciden estos caracteres: {2}")
	@CsvSource({"paco, paquita, 'pa'",
				"cadena1, 'cadena1' , 'cadena1'",
				"paco, paquita, pa",})
	void testCaracteresComunes_parametrized(String P1, String P2, String result) {
		Ejercicio4 e4 = new Ejercicio4();
		assertEquals(result, e4.caracteresComunes(P1,P2));
	}

}
