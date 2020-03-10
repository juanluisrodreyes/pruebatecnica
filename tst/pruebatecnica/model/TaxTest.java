package pruebatecnica.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxTest {

	@Test
	void testGetPercentage() {
		assertEquals(0.1, Tax.BASIC.getPercentage());
		assertEquals(0.05, Tax.IMPORT.getPercentage());
	}

}
