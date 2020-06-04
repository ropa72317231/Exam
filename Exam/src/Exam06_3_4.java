
public class Exam06_3_4 {
	void dilemma(boolean a, boolean b) {
		if(a && b) {
			System.out.println("a,b 둘다 5년 복역");
		} else if(a && !b) {
			System.out.println("a 10년 복역, b 석방");
		} else if(!a && b) {
			System.out.println("a 10년 복역, b 석방");
		}	else {
			System.out.println("a,b 둘다 1년 복역");
		}
	}
	public static void main(String[] args) {
		Exam06_3_4 e = new Exam06_3_4();
		boolean a = false;
		boolean b = true;
		e.dilemma(a, b);
	}
}

