import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	public static void main(String[] args) {
//		demo1();	
		readingLine();
	}
private static void readingLine() {
	try {
		Reader reader = new FileReader("./input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		while(line !=null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}	
	}

private static void demo1() {
	try {
		Reader reader = new FileReader("./input.txt");
		int character = reader.read();
		while(character !=-1) {
			System.out.println((char)character);
			character = reader.read();
		}
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}	
}
}