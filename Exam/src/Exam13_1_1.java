import java.util.ArrayList;

public class Exam13_1_1 {
	public static void main(String[] args) {
		String[] company = { "Naver", "Kakao", "Google", "Amazon", "MS", "Facebook" };
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			int idx = (int) (Math.random() * company.length);
			list.add(company[idx]); // ���� ������ ��ü�� List�� �߰�
		}
		System.out.printf("�߰��� ȸ�� ���� : %s\n", list.size());
		System.out.println(list.toString());
		
		for (int i = list.size()-1; i >=0; i--) {
			String value = list.get(i);
			if(value.equals("Amazon") || value.equals("Facebook")) {
				list.remove(i);
			}
		}
		System.out.printf("���� �� ȸ�� ���� : %s\n", list.size());
		System.out.println(list.toString());
	}
}