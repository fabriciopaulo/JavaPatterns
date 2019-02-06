package abstract_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OracleFactoryTest {

	IConector conectorGratuito;
	IConector conectorPago;
	
	@BeforeEach
	void setUp() throws Exception {
		OracleFactory factory = new OracleFactory();
		conectorGratuito = factory.criarConectorBancoGratuito();
		conectorPago = factory.criarConectorBancoPago();
	}

	@Test
	void test() {
		assertTrue(conectorGratuito instanceof MysqlConector);
		assertTrue(conectorPago instanceof OracleConector);
	}

}
