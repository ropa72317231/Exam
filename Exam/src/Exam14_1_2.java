import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam14_1_2 {
	public static void main(String[] args) {
		try {
			InputStream out = new FileInputStream("num_data.txt");
			for(;;) {
				int data = out.read();
				if(data == -1) break;
				System.out.print(data + " ");
			}
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
