package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@CsvSource({
		"'',Pass1,false",
		"user,'',false",
		"nombredeusuariossuperlagruisimomayorde30caraceteres,pass,false",
		"user,unsuperpasswordlarguisimoconmasde30caracteresgigantedelto,false",
		"user,pass,false", 
		"user,Pass1,true",		
		"user,Pass2,false",
		"userMal,Pass1,false",
		"userMal,Pass2,false",
	})
	
	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale: {2}")
	void testLogin_parametrized(String username, String password, String result) {
		Ejercicio2 e2 = new Ejercicio2();
		assertEquals(Boolean.parseBoolean(result), e2.login(username, password));
	}
	
}



