
public class Exam06_3_2 {
	int getBetweenSum(int a, int b) {
		if(a>b)	{
			int temp = a; //temp: 변수를 서로 교환
			a = b;
			b = temp;
		}
		int sum = 0;
		for(int i = a; i <=b; i++) {
			sum += i; // sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Exam06_3_2 e = new Exam06_3_2();
		int sum = e.getBetweenSum(8, 8);
		System.out.println(sum);
		
	}
}