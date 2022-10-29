package handphone;

import telephone.Handphone;

public class iPhone extends Handphone {
	
	private String series;
	
	public iPhone(String number, String name, String series) {
		super(number, name);
		this.series = series;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	@Override
	public void call() {
		System.out.printf("Calling %s (%s) from %s%n", number, name, series);
	}


	@Override
	public void end() {
		System.out.printf("End call %s (%s) from %s%n", number, name, series);
	}

}
