package polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LgTV---- 전원을 켠다.");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV---- 전원을 끈다.");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
