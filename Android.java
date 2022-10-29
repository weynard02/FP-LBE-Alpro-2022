package handphone;

import telephone.Handphone;

public class Android extends Handphone {
	
	private String brand, series;
	
	public Android(String number, String name, String brand) {
		super(number, name);
		this.brand = brand;
		this.series = null;
	}


	public Android(String number, String name, String brand, String series) {
		this(number, name, brand);
		this.series = series;
	}
	
	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getSeries() {
		return series;
	}


	public void setSeries(String series) {
		this.series = series;
	}


	@Override
	public void call() {
		System.out.printf("Calling %s (%s) from %s ", number, name, brand);
		if (series != null) System.out.print(series);
		System.out.println();
	}


	@Override
	public void end() {
		System.out.printf("End call %s (%s) from %s ", number, name, brand);
		if (series != null) System.out.print(series);
		System.out.println();
	}

	
	
}
