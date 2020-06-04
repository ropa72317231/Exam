
public class Exam06_5_Main {
	public static void main(String[] args) {
		Exam06_5_Human human = new Exam06_5_Human();
		human.setName("±è");
		human.setType('O');
		human.setAge(20);

		Exam06_5_BloodHouse bh = new Exam06_5_BloodHouse();
		String result = bh.action(human);
		
		System.out.println(result);
	}
}
