
public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 6;
		
		if((score%2 ==0 || score%3==0)) {
			System.out.println("쿵짝");
		} 	else if(score%3 == 0  ) {
			System.out.println('쿵');
		}	else if(score%2 == 0) {
				System.out.println('짝');
		}	else {
			System.out.println(score);
			}	
	}
		
}


//score가 2의 배수인 경우 “짝”, 3의 배수인 경우 “쿵”, 2의 배수이면서 3의 배수인 경우 “쿵짝”, 그 외의 경우는 score가 출력되도록 코드 작성