
public class Exam05_9_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		
		// 1. split
		String[] arr = file.split("/");
		System.out.println(arr.length);
		for(String string: arr) {
			if(string.equals("") != true) {
				System.out.println("/"+string);
			}
		}
		
		// 2. substring (+ indexOF)
		int idx = 0;	// ������ġ
		int e_idx = 0; 	// ������ ��ġ
		while(true) {
			e_idx = file.indexOf("/", idx);
			if(e_idx == -1) {
				System.out.println(file.substring(idx));
				break;	//������ ã�� ���ϴ� ���
			}
			System.out.println(file.substring(idx, e_idx));
			idx = e_idx;
			idx++;
		}

	}
}