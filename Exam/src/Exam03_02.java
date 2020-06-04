
public class Exam03_02 {
	public static void main(String[] args) {

		int num = 456;
		
		System.out.println(num - (num%100));
		
		System.out.println(num / 100 *100);

	// 내가 한 것
		int result = (num > 400) ? 400 : num;
	
		System.out.println(result);
	
	}
}
