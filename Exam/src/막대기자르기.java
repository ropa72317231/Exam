import java.util.Scanner;

public class ������ڸ��� {
// 1. ��ĳ���Է�  2. �迭����ϱ�  3. �Էµ� �迭 �߿��� �ּ� �� ã��
// 4. �Էµ� ���ڿ� �ּҰ����� ����  5. ī��Ʈ�ϱ�

	public static void main(String[] args) {
	
		// Ǯ�� - 1. �Է� �ް� �迭�� ���ڵ��� ���
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int[] sticks = new int[num];
	for(int i=0; i<num; i++) {
		sticks[i] = s.nextInt();
		}
		while(true) {
			
			// 4. 0���� ū �迭�� ��� ���� Ȯ��
			int count = 0;
			for(int i=0; i<num; i++) {
				if(sticks[i] > 0) {
					count++;
				}
			}
			if(count==0) break;
			System.out.println("���� ������� ����" + count);
			
		// 2. ���� ���̰� ª��(�ּҰ�) ��� ã��
		int min = Integer.MAX_VALUE;
		for(int i=0; i<num; i++) {
			if(sticks[i] < min && sticks[i] >0 ) {
				min = sticks[i];
			}
		}
		// 3. �迭�� ��Ҹ� �ּ� ������ ����
		for(int i=0; i<num; i++) {
			sticks[i] = sticks[i] - min;
		}
		} 	// while end
	}

}
