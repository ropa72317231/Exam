
public class Exam06_3_4 {
	void dilemma(boolean a, boolean b) {
		if(a && b) {
			System.out.println("a,b �Ѵ� 5�� ����");
		} else if(a && !b) {
			System.out.println("a 10�� ����, b ����");
		} else if(!a && b) {
			System.out.println("a 10�� ����, b ����");
		}	else {
			System.out.println("a,b �Ѵ� 1�� ����");
		}
	}
	public static void main(String[] args) {
		Exam06_3_4 e = new Exam06_3_4();
		boolean a = false;
		boolean b = true;
		e.dilemma(a, b);
	}
}

