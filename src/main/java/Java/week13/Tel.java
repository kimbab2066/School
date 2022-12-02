package Java.week13;

public class Tel {
	private int channel;
	private int volume;
	private boolean onOff;


	public void volumeUp() {
		this.volume++;
	}

	void print() {
		System.out.println("채널은 " + this.getChannel() + "이고 볼륨은 " //
				+ this.getVolume() + "입니다.");
	}

	//
	public int getChannel() {
		return this.channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return this.onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

}// class