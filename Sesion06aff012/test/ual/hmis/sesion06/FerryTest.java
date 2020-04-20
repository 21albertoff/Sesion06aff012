package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FerryTest {
	
	@Test
	void embarcarVehiculo() {
		Ferry ferry = new Ferry(100, 2, 25000);
		
		assertFalse(ferry.embarcarVehiculo(new Vehiculo(2, 18, 30000)));
		assertTrue(ferry.embarcarVehiculo(new Vehiculo(4, 4, 1000)));
		assertTrue(ferry.embarcarVehiculo(new Vehiculo(5, 4, 3000)));
		assertFalse(ferry.embarcarVehiculo(new Vehiculo(2, 2, 130)));
	}

	
	@Test
	void totalVehiculosFerry() {
		Ferry ferry = new Ferry(100, 2, 500);
		
		assertEquals(0, ferry.totalVehiculos());
		
		ferry.embarcarVehiculo(new Vehiculo(1, 4, 1 ));
		ferry.embarcarVehiculo(new Vehiculo(1, 4, 1));
		
		assertEquals(2, ferry.totalVehiculos());
	}
	
	@Test
	void vacioFerry() {
		Ferry ferry = new Ferry(100, 2, 500);
		
		assertTrue(ferry.vacio());
		
		ferry.embarcarVehiculo(new Vehiculo(1, 4, 1 ));
		
		assertFalse(ferry.vacio());
	}
	
	
	@CsvSource({
		"100, 2, 200 , true",
		"300, 2, 200 , false",
		"300, 2, 200 , false",
		"300, 2, 200 , false",
	})
	
	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale: {2}")
	void testsuperadoPesoMaximo_parametrized(int tara, int maxNumVehiculos,  int pesoMaxVehiculo , String result) {
		Ferry ferry = new Ferry(100, maxNumVehiculos,pesoMaxVehiculo);
		ferry.embarcarVehiculo(new Vehiculo(4, 4, 0));
		assertEquals(Boolean.parseBoolean(result), ferry.embarcarVehiculo(new Vehiculo(4, 4, tara)));
	}
		
	@Test
	void superadoMaximoVehiculoFerry() {
		Ferry ferry = new Ferry(100, 2, 500);
				
		assertFalse(ferry.superadoMaximoVehiculos());

		ferry.embarcarVehiculo(new Vehiculo(1, 4, 200));
		ferry.embarcarVehiculo(new Vehiculo(1, 4, 200));
		
		assertTrue(ferry.superadoMaximoVehiculos());
	}
	
}
