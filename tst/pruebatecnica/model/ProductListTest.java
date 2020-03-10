package pruebatecnica.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductListTest {

	@Test
	void testList1() {
		ProductList list1 = new ProductList();
		list1.addProduct(new Product("libro", 12.49));
		list1.addProduct(new Product("pelicula en DVD", 14.99, Tax.BASIC));
		list1.addProduct(new Product("barrita de chocolate", 0.85));
		
		assertEquals("1 libro: 12.49\n"
				+ "1 pelicula en DVD: 16.49\n"
				+ "1 barrita de chocolate: 0.85\n"
				+ "Impuestos: 1.50\n"
				+ "Total: 29.83", list1.printTicket());
	}
	
	@Test
	void testList2() {
		ProductList list2 = new ProductList();
		list2.addProduct(new Product("caja de bombones de importacion", 10.00, Tax.IMPORT));
		list2.addProduct(new Product("frasco de perfume de importacion", 47.50, Tax.BASIC, Tax.IMPORT));
		
		assertEquals("1 caja de bombones de importacion: 10.50\n"
				+ "1 frasco de perfume de importacion: 54.65\n"
				+ "Impuestos: 7.65\n"
				+ "Total: 65.15", list2.printTicket());
	}
	
	@Test
	void testList3() {
		ProductList list3 = new ProductList();
		list3.addProduct(new Product("frasco de perfume de importacion", 27.99, Tax.IMPORT, Tax.BASIC));
		list3.addProduct(new Product("frasco de perfume", 18.99, Tax.BASIC));
		list3.addProduct(new Product("caja de pastillas para el estomago", 9.75));
		list3.addProduct(new Product("caja de bombones importados", 11.25, Tax.IMPORT));
		assertEquals("1 frasco de perfume de importacion: 32.19\n"
				+ "1 frasco de perfume: 20.89\n"
				+ "1 caja de pastillas para el estomago: 9.75\n"
				+ "1 caja de bombones importados: 11.85\n"
				+ "Impuestos: 6.70\n"
				+ "Total: 74.68", list3.printTicket());
	}

}
