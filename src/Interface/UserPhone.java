package Interface;

public class UserPhone {
	private Phone ph;

	public UserPhone(Phone ph) {
		super();
		this.ph = ph;
	}
	
	void nyalakanHP() {
		this.ph.powerOn();
	}
	
	void matikanHP() {
		this.ph.powerOff();
	}
	
	void perkerasSuara() {
		this.ph.volumeUp();
	}
	
	void perkecilSuara() {
		this.ph.volumeDown();
	}
}
