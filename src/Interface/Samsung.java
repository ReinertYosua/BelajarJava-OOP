package Interface;

public class Samsung implements Phone {
	private int volume ; 
	private boolean isPowerOn;
	
	
	
	public Samsung() {
		super();
		this.volume = 80;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Welcome to Samsung");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		isPowerOn = false;
		System.out.println("Samsung dimatikan");
		
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
