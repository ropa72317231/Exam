
public class Exam05_9_1 {
	public static void main(String[] args) {
		String nowDate = "20150926";
		nowDate = nowDate.substring(0, 4) + "-" +
				  nowDate.substring(4, 6)+ "-" +
				  nowDate.substring(6);
		System.out.println(nowDate); // => [출력결과] 2015-09-26
		
		String inputDate = "2015-09-26";
		inputDate = inputDate.substring(0, 4) + "년" +
					inputDate.substring(5, 7)+ "월" +
					inputDate.substring(8) + "일";
		System.out.println(inputDate);
		
	}
}