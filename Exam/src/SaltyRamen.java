

public class SaltyRamen extends Ramen  { // ��� �ڵ�
	public SaltyRamen(String name) {
		super.name = name;
	}
	@Override
	public String getTaste() {
		System.out.print("�ұ� ���=>"+" ");
		return "§ ����";
	}
}