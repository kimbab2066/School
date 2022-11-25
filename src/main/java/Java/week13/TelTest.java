package Java.week13;

public class TelTest {
	public static void main(String[] args) {
		Tel tv = new Tel();
//		tv.channel = 7;
//		tv.volume = 9;
//		tv.onOff = true;
//		System.out.println("텔레비전의 채널은 " + tv.channel + "이고//
//		볼륨은 " + tv.volume + "입니다.");
		tv.setChannel(7);
		tv.setVolume(9);
		tv.setOnOff(true);
		tv.volumeUp();
		System.out.println("현재 채널 : " + tv.getChannel());
		tv.setChannel(5);
		//
		Tel yourTv = new Tel();
		yourTv.setChannel(10);
		yourTv.setVolume(20);
		yourTv.setOnOff(false);
		yourTv.volumeUp();
		// output
		tv.print();
		yourTv.print();
	}// main
}// class