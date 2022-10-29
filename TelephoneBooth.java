package telephone;

public class TelephoneBooth extends Telephone {
	
	private String booth_id;
	
	public TelephoneBooth(String number, String booth_id) {
		super(number);
		this.booth_id = booth_id;
	}
	

	public String getBooth_id() {
		return booth_id;
	}


	public void setBooth_id(String booth_id) {
		this.booth_id = booth_id;
	}


	@Override
	public void call() {
		System.out.printf("Calling %s through booth %s%n", number, booth_id);

	}

	@Override
	public void end() {
		System.out.printf("End call %s through booth %s%n", number, booth_id);

	}

}
