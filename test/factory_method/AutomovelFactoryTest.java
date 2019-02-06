package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutomovelFactoryTest {

	Automovel carro;
	Automovel moto;
	
	@BeforeEach
	void setUp() throws Exception {
		AutomovelFactory factory = new AutomovelFactory();
		moto = factory.criarVeiculo(2);
		carro = factory.criarVeiculo(4);
	}

	@Test
	void test() {
		assertTrue(moto.getTipo().equals("Motocicleta"));
		assertTrue(carro.getTipo().equals("Carro"));
		assertTrue(moto instanceof Moto);
		assertTrue(carro instanceof Carro);
	}

}
