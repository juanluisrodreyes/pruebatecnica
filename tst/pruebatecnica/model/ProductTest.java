package pruebatecnica.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		Product product = new Product("bombones", 19.99, Tax.IMPORT, Tax.BASIC);
	}

	@Test
	void testGetTotalTax() {
		Product book = new Product("libro", 12.49);
		Product film = new Product("película en DVD", 14.99, Tax.BASIC);
		assertEquals(0, book.getTotalTax());
		assertEquals(150, film.getTotalTax());
	}
	
	@Test
	void testGetTotalTax2() {
		Product product = new Product("perfume", 18.99, Tax.BASIC);
		assertEquals(1899, product.getBasePrice());
		System.out.println("Base: " + product.getBasePrice());
		System.out.println("Tax: " + product.getTotalTax());
		System.out.println("Total: " + (product.getBasePrice() + product.getTotalTax()));
		assertEquals(190, product.getTotalTax());
	}

}
