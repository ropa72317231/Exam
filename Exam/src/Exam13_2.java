import java.util.Set;
import java.util.TreeSet;

public class Exam13_2 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(2);
		set.add(5);
		set.add(11);
		set.add(13);
		set.add(25);
		set.add(28);
		
		int count = 0;			
		while(true) {
			Set<Integer> myNumber = new TreeSet<Integer>();
			
			
			while(true) {
				int num = (int)(Math.random()*28+1);	//28까지의 숫자 랜덤 나열
				myNumber.add(num);			// 값 입력
				if(myNumber.size() == 6) {
					break;
				}
			}
			count++;
			
			if(set.containsAll(myNumber)) break;
		}
		
		System.out.println(set);
		System.out.println("시도횟수 : " + count);
	}
}
