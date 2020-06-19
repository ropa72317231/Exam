import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("c:/dev/test.bin");
			OutputStream out = new FileOutputStream("c:/dev/test_copy.bin");
			
			byte[] buffer = new byte[1024];
			while(true) {
//				int data = in.read();
				int data = in.read(buffer);
				
				if(data == -1) break;
//				out.write(data);
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
