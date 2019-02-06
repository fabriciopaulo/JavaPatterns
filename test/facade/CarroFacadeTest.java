package facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroFacadeTest {

	Carro carro;
	
	@BeforeEach
	void setUp() throws Exception {
		Motor motor = new Motor();
		Cambio cambio = new Cambio();
		InjecaoEletronica ie = new InjecaoEletronica();
		Freio freio = new Freio();
		carro = new Carro(cambio,freio,ie,motor);
	}

	@Test
	void testLigarCarro() {
		assertTrue(CarroFacade.ligarCarro(carro));
	}

}
