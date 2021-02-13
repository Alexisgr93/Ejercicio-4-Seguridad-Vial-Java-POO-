import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesSeguridadVial {
	
	Conductor julia = new Conductor();
	Auto fitito = new Auto();
	Moto motito = new Moto();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		
		julia.setVehiculo(fitito);
		julia.setRegistro(true);
		
		fitito.setRuedaDeAuxilio(false);
		fitito.setPlusVelocidad(10);
		
		
		
		assertFalse(julia.EsSeguro());
	}
	
	@Test
	void test2() {
		
		
		julia.setRegistro(true);
		
		fitito.setRuedaDeAuxilio(true);
		fitito.setPlusVelocidad(10);
		
		julia.setVehiculo(fitito);
		
		
		assertTrue(julia.EsSeguro());
	}
	
	
	@Test
	void test3() {
		
		
		julia.setRegistro(false);
		
		fitito.setRuedaDeAuxilio(true);
		fitito.setPlusVelocidad(10);
		
		julia.setVehiculo(fitito);
		
		assertFalse(julia.EsSeguro());
	}
	
	
	@Test
	void test4() {
		
		
		julia.setRegistro(true);
		
		julia.setVehiculo(motito);
		motito.setEspejoRetrovisores(true);
		motito.setVelocidad(170);
		
		
		assertFalse(julia.EsSeguro());
	}

}
