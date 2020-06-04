
public class Exam06_3_3 {
	int getLastYear(int month) {
		int result = 0;
		if(month==1 || month==3 || month==5 || month==7 ||  
				month==8 || month==10 || month==12) {
			result = 31;
		}	else if(month==4 || month==6 || month==9 || month==11) {
			result = 30;
		}	else {
			result = 28;
		}
		return result;
	}
		
	public static void main(String[] args) {
		Exam06_3_3 e = new Exam06_3_3();
		int result = e.getLastYear(9);
		System.out.println(result);
	}
}

