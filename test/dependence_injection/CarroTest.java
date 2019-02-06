package dependence_injection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroTest {

	Carro carro;
	
	@BeforeEach
	void setUp() throws Exception {
		carro = new Carro(new Motor());
	}

	@Test
	void testLigarCarro() {
		assertTrue(carro.ligarCarro());
	}

}
