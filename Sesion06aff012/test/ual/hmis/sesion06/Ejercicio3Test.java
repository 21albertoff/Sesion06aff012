package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@ParameterizedTest  (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource(	{"-1, número erróneo", 
				 " 4, *****", 
				 " 7, *******", 
				 " 13, ************"})
	void testCantidadAsteriscos_parametrized(int input, String result) {
		Ejercicio3 e3 = new Ejercicio3();
		assertEquals(result, e3.convertirAsteriscos(input));
	}

}
