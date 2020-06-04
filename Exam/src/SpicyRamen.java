

public class SpicyRamen extends Ramen { // 상속 코드
	public SpicyRamen(String name) {
		super.name = name;
	}
	@Override
	public String getTaste() {
		System.out.print("불 라면=>"+ " ");
		return "매운 라면맛";
	}
}