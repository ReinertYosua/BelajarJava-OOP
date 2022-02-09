package objectTV;

public class mainTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(90);
		tv1.volumeUp();
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.setChannel(31);
		tv2.setVolume(101);//1
		tv2.volumeUp();//2
		
		System.out.println("tv1 channelnya = "+tv1.channel+" and Volume = "+tv1.volumeLevel);
		System.out.println("tv2 channelnya = "+tv2.channel+" and Volume = "+tv2.volumeLevel);
		
		
		
	}

}
