
public class Exam05_8 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		String[] arr = str.split(" ");
		
		String temp2 = " ";
		for(int i = arr.length-1; i>=0; i--) {
			temp2+= arr[i] + " " ;
			System.out.println(temp2);
		}
		
		String temp = " ";
		
		for(String string : arr) {
			temp += string + " " ;
			System.out.println(temp);
		}
		
		
		
		// �ڵ� �ۼ�
	}
}
