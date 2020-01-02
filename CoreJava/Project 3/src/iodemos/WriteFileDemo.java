package iodemos;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("record.txt");

		fw.write("My name is Sourav");
		fw.close();

		System.out.println("done");
	}
}
