
import java.util.Scanner;

// ���ڷ� �ϴ� ��� ���ϱ� �ߴ� ��� , ���ڿ��� �ϴ� ��� indexOf
public class ���ڼ��� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� =>");
		int num = s.nextInt();
		System.out.print("ã�� ���� �Է� =>");
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
		System.out.println(findNum + "�� ���� =>" + count);
	}
}
	
	
	
//	int num = 0;
//			
//	public static void main(String[] args) {
//		���ڼ��� n = new ���ڼ���();
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
