import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam14_1_1 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 6, 7, 9, 11, 15, 26 };

		try {
			OutputStream out = new FileOutputStream("num_data.txt");
			for (int i : nums) {
				out.write(i);
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}