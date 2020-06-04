
public class Exam06_1_2_Main {
	// shift + alt + R
	public static void main(String[] args) {
		Exam06Book book1 = new Exam06Book();
		book1.publisher = "창비";
		book1.author = "황석영";
		book1.title = "철도원 삼대";
		
		Exam06Book book2 = new Exam06Book();
		book2.publisher = "더좋은책";
		book2.author = "와다 히데키";
		book2.title = "감정바보";
		
		Exam06Book book3 = new Exam06Book();
		book3.publisher = "한빛비즈";
		book3.author = "이한나";
		book3.title = "할짝 심리학";
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
	}
}