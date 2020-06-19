import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam14_3 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("c:/Windows/System32/drivers/etc/hosts");
			OutputStream out = new FileOutputStream("c:/dev/hosts");
			
			byte[] buffer = new byte[1024];
			while(true) {
				int data = in.read(buffer);
				if(data == -1) break;
				out.write(buffer);
			}
			
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}