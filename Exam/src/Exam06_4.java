
public class Exam06_4 {
	public static void main(String[] args) {
		Exam06_4_Class.method1();
	}
}

class Exam06_4_Class {
	public void method2() {
		this.a++;
		System.out.println(a);
	}

	public static void method1() {
		System.out.println("method1 ���� ����");
		Exam06_4_Class e = new Exam06_4_Class();
		for (int i = 0; i < 5; i++) {
			e.method2();
		}
		System.out.println("method1 ���� ����");
	}


	int a;
}

// int a = 0;
//	
//	public static void main(String[] args) {
//		Exam06_4 e = new Exam06_4();
//		System.out.println("method1 ���� ����");
//		e.a++;
//		}
//
//	public static void method1() {
//		for (int i = 0; i < 5; i++) {
//			/* method2 ȣ�� */
//		}
//		System.out.println("method1 ���� ����");
//	}
//
//	public void method2() {
//		/* �������� a�� ���� 1�� ���� */
//		/* �������� a�� �� ��� */