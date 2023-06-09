package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker=speaker;
	}
	
	public void setPrice (int price) {
		System.out.println("===> serPrice() 호출");
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	
	
	
	public void powerOff() {
		System.out.println("SamsungTV---- 전원을 끈다.");
		
	}
	public void volumeUp() {
		speaker.volumeUp();
	}	
	
	public void volumeDown() {
		speaker.volumeDown();

}
}
