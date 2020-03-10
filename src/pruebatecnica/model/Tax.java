package pruebatecnica.model;

public enum Tax {
	
	BASIC(0.1),
	IMPORT(0.05);
	
	private final double percentage;
	
	private Tax(double percentage) {
		this.percentage = percentage;
	}
	
	public double getPercentage() {
		return percentage;
	}

}
