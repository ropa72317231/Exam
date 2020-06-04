
public class Exam07_2_LG_RemoteControl extends Exam07_2_RemoteControl /* 상속 */ {

	@Override
	public void channelUp() {
		System.out.println("LG => Channel Up");
	}

	@Override
	public void channelDown() {
		System.out.println("LG => Channel Down");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG => Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG => Volume Down");
	}
	
 /* 메소드 오버라이드 */
}