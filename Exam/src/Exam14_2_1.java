import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam14_2_1 {
	public static void main(String[] args) {
		String text = "Eighty percent of success is showing up.\n"+"������ 8���� �ϴ� �⼮�ϴ� ���̴� ."; 
		 
		try {
			Writer w = new FileWriter("string_data.txt");
			
			w.write(text);
			
			w.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
