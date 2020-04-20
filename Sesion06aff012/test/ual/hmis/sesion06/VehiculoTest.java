package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VehiculoTest {
	
	@ParameterizedTest (name = "{index} => Vehiculo con ({0}) pasajeros, {1} ruedas  y una tara de {2}")
	@CsvSource({"2, 4, 1000",
				"1, 4, 1400",
				"1, 2, 100",
				"3, 4, 1400"})
	
	void testVehiculo(int numPasajeros, int numRuedas, int tara) {
		Vehiculo vehiculo = new Vehiculo(numPasajeros, numRuedas,tara);
		assertEquals(numPasajeros, vehiculo.getNumPasajeros());
		assertEquals(tara, vehiculo.getTara());
		assertEquals(numRuedas, vehiculo.getNumRuedas());
	}

}
