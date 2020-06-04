import java.util.Scanner;

public class 막대기자르기 {
// 1. 스캐너입력  2. 배열사용하기  3. 입력된 배열 중에서 최소 값 찾기
// 4. 입력된 숫자에 최소값으로 빼기  5. 카운트하기

	public static void main(String[] args) {
	
		// 풀이 - 1. 입력 받고 배열에 숫자들을 등록
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int[] sticks = new int[num];
	for(int i=0; i<num; i++) {
		sticks[i] = s.nextInt();
		}
		while(true) {
			
			// 4. 0보다 큰 배열의 요소 개수 확인
			int count = 0;
			for(int i=0; i<num; i++) {
				if(sticks[i] > 0) {
					count++;
				}
			}
			if(count==0) break;
			System.out.println("현재 막대기의 개수" + count);
			
		// 2. 가장 길이가 짧은(최소값) 요소 찾기
		int min = Integer.MAX_VALUE;
		for(int i=0; i<num; i++) {
			if(sticks[i] < min && sticks[i] >0 ) {
				min = sticks[i];
			}
		}
		// 3. 배열의 요소를 최소 값으로 감소
		for(int i=0; i<num; i++) {
			sticks[i] = sticks[i] - min;
		}
		} 	// while end
	}

}
