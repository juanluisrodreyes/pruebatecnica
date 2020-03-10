package pruebatecnica.model;

import java.util.LinkedList;
import java.util.List;

public class ProductList {
	
	private List<Product> products;
	
	public ProductList() {
		products = new LinkedList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public int totalTaxes() {
		int totalTaxes = 0;
		for (Product product: products) {
			totalTaxes += product.getTotalTax();
		}
		return totalTaxes;
	}
	
	public String printTicket() {
		StringBuffer ticket = new StringBuffer();
		int listPrice = 0;
		for (Product product : products) {
			int productPrice = product.getBasePrice() + product.getTotalTax();
			listPrice += productPrice;
			ticket.append(String.format("1 %s: %d.%d\n", product.getName(), productPrice/100, productPrice%100));
		}
		ticket.append(String.format("Impuestos: %d.%d\n", this.totalTaxes()/100, this.totalTaxes()%100));
		ticket.append(String.format("Total: %d.%d", listPrice/100, listPrice%100));
		return ticket.toString();
	}

}
