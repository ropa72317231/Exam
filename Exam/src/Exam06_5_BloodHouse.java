
public class Exam06_5_BloodHouse {
	public boolean isPossible(Exam06_5_Human human) {
		int age = 0; // ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå
		boolean isPossible = false; // ÇåÇ÷ °¡´É ¿©ºÎ
		age = human.getAge();
		if(age >=16 && age <=69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Exam06_5_Human human) {
		boolean res = isPossible(human);
		String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
		if(res) {
			result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù.";
		}	else {
			result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù.";
		}
		return result;
	}
}