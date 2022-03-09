package Interface;

public interface Phone {
	int max_volume = 100;
	int min_volume = 0;
	
	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
}
