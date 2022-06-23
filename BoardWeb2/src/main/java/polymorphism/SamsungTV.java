package polymorphism;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	public SamsungTV() {
		System.out.println("ss instance");
	}
	public void powerOn() {
		System.out.println("ss power on");
	}
	public void powerOff() {
		System.out.println("ss power off");
	}
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
		System.out.println("ss vol up");
	}
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
		System.out.println("ss vol down");
	}
	
}
