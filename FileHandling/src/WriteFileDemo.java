import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class WriteFileDemo {
	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		Writer out = null;
		try {
			out = new FileWriter("output.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(out);
			bufferedWriter.write("Writing into a file");
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		BufferedWriter bufferedWriter = new BufferedWriter(out);
	}
}
