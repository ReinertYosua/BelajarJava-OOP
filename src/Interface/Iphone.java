package Interface;

public class Iphone implements Phone {
	private int volume ; 
	private boolean isPowerOn;
	
	

	public Iphone() {
		super();
		this.volume = 50;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Welcome to Iphone");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		isPowerOn = false;
		System.out.println("Iphone dimatikan");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(isPowerOn) {
			if(this.volume == max_volume) {
				System.out.println("Volume Maksimum");
			}else {
				this.volume += 10;
				System.out.println("Volume Sekarang "+ this.getVolume());
			}
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(isPowerOn) {
			if(this.volume == min_volume) {
				System.out.println("Volume sudah habis");
			}else {
				this.volume -= 10;
				System.out.println("Volume Sekarang "+ this.getVolume());
			}
		}
		
	}
	
	public int getVolume() {
		return this.volume;
	}

	
}
