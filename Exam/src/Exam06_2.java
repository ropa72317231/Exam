
public class Exam06_2 {
	int Plus(int n1, int n2)  {
		return n1+n2;
	}
	int Minus(int n1, int n2) {
		return n1-n2;
	}
	
	public static void main(String[] args) {
		Exam06_2 e = new Exam06_2();
		int result1 = 0;
		result1 = e.Plus(5, 3);
		System.out.println(result1);

		int result2 = 0;
		result2 = e.Minus(5, 3);
		System.out.println(result2);
	}
}