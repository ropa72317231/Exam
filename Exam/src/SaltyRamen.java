

public class SaltyRamen extends Ramen  { // 상속 코드
	public SaltyRamen(String name) {
		super.name = name;
	}
	@Override
	public String getTaste() {
		System.out.print("소금 라면=>"+" ");
		return "짠 라면맛";
	}
}