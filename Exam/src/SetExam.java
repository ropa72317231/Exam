import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		Set<Integer> s = new TreeSet<Integer>(list);
		System.out.println(s);
		
		List<Integer> list2 = new ArrayList<Integer>(s);
		System.out.println(list2);
		
		
		
		//Set<Integer> set = new HashSet<>(); // 순서 정렬 안됨
		Set<Integer> set = new TreeSet<>();	//treeset 오름차순
		set.add(31);
		set.add(31);
		set.add(7);
		set.add(5);
		set.add(31);
		set.add(10);
		System.out.println(set);
		
	}

	
}
