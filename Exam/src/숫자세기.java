
import java.util.Scanner;

// 숫자로 하는 경우 더하기 했던 방식 , 문자열로 하는 경우 indexOf
public class 숫자세기 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 =>");
		int num = s.nextInt();
		System.out.print("찾을 숫자 입력 =>");
		int findNum = s.nextInt();
		
		String result = "";
		for(int i=1; i<=num; i++) {
			result += i;
		}
		int idx = 0;
		int count = 0;
		while(true) {			//String.valueOf(findNum)
			idx = result.indexOf("" + findNum, idx);
			if(idx== -1) break;
			count++;
			idx++;
		}
		System.out.println(findNum + "의 개수 =>" + count);
	}
}
	
	
	
//	int num = 0;
//			
//	public static void main(String[] args) {
//		숫자세기 n = new 숫자세기();
//		n.num = 20;
//		for(int i = 1; i<n.num+1; i++) {
//			
//			
//			System.out.print(i);
//			}
//		}
//	}
//	
//
