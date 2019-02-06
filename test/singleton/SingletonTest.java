package singleton;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingletonTest {

	@BeforeEach
	void setUp() throws Exception {
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}

	@Test
	void testGetInstancesCount() {
		int instances = Singleton.getInstancesCount();
		assertTrue(instances == 1);
	}

}
