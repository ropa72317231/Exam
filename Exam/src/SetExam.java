import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<>(); // ���� ���� �ȵ�
		Set<Integer> set = new TreeSet<>();	//treeset ��������
		set.add(31);
		set.add(31);
		set.add(7);
		set.add(5);
		set.add(31);
		set.add(10);
		System.out.println(set);
		
	}

	
}
