package pruebatecnica.model;

import java.util.Set;

public class Product {

	private String name;
	private int basePrice; // in cents
	private Set<Tax> taxes;

	public Product(String name, String basePrice, Tax... taxes) {
		this.name = name;
		String[] baseSplit = basePrice.split("\\.");
		this.basePrice = Integer.valueOf((baseSplit[0] + baseSplit[1])); // Conversion from String to integer
		this.taxes = Set.of(taxes);
	}

	public int getTotalTax() {
		double totalTax = 0;
		for (Tax tax : taxes) {
			int partialTax = (int) (this.getBasePrice() * tax.getPercentage());
			// Round up to next 5 cents
			if (partialTax % 5 != 0) {
				partialTax += 5 - partialTax % 5;
			}
			totalTax += partialTax;
		}
		return Double.valueOf(totalTax).intValue();
	}

	public String getName() {
		return this.name;
	}
	
	public int getBasePrice() {
		return this.basePrice;
	}

}
