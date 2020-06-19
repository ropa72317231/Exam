import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class Exam13_3_2 {
	public static void main(String[] args) {
		String text = getData(); // ���� ������ �ڵ�
		String[] words = text.split(" ");
		System.out.println(text);
		
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<words.length; i++) {
			boolean isCon = map.containsKey(words[i]);
			if(isCon == true) {
				int count = map.get(words[i]);
				count += 1;
				map.put(words[i], count);
			} else {
				map.put(words[i], 1);
			}
		}
		
		System.out.println(map);
	}

	public static String getData() {
		StringBuffer result = new StringBuffer();
		try {
			URL url = new URL("https://ggoreb.com/text/python.txt");
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String separator = "";
			while (true) {
				String data = reader.readLine();
				if (data == null) {
					break;
				}
				result.append(separator + data);
				separator = "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}