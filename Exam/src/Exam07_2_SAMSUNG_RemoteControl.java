
public class Exam07_2_SAMSUNG_RemoteControl extends Exam07_2_RemoteControl /* 상속 */ {
	@Override
	public void channelUp() {
		System.out.println("SAMSUNG => Channel Up");
	}

	@Override
	public void channelDown() {
		System.out.println("SAMSUNG => Channel Down");
	}

	@Override
	public void volumeUp() {
		System.out.println("SAMSUNG => Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SAMSUNG => Volume Down");
	}
 /* 메소드 오버라이드 */
}