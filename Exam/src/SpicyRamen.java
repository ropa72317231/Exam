

public class SpicyRamen extends Ramen { // ��� �ڵ�
	public SpicyRamen(String name) {
		super.name = name;
	}
	@Override
	public String getTaste() {
		System.out.print("�� ���=>"+ " ");
		return "�ſ� ����";
	}
}