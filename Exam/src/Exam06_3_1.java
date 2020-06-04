
public class Exam06_3_1 {
	int checkGrade(int weight) {
		int result = 0;		//등급 데이터
		if(weight < 4) {
			result = 4;		
		}	else if(weight < 7) {
			result = 3;
		}	else if(weight < 10) {
			result = 2;
		}	else {
			result = 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Exam06_3_1 e = new Exam06_3_1();
		int result = e.checkGrade(8);
		System.out.println(result);
	}
}
	
	
	
//	int weight;
//	int grade;
//	
//	public int decideGrade() {
//		if(weight < 4) {
//			System.out.println(4);
//		}	else if(weight < 7) {
//			System.out.println(3);
//		}	else if(weight < 10) {
//			System.out.println(2);
//		}	else {
//			System.out.println(4);
//	} 
//		return grade;
//				
//	public static void main(String[] args) {
//		CheckGrade cg = new CheckGrade();
//		cg.weight = 14;
//				System.out.println(cg);
//		
//	}
	
