

public class Exam07_1_Main {
	public static void main(String[] args) {
		Ramen ramen1 = new SpicyRamen("�� ���");
		String taste1 = ramen1.getTaste();
		System.out.println(taste1);
		Ramen ramen2 = new SaltyRamen("�ұ� ���");
		String taste2 = ramen2.getTaste();
		System.out.println(taste2);
	}
}