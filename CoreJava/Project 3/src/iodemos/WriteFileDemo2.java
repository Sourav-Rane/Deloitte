package iodemos;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fw = new FileOutputStream("record.txt");

		fw.write((char) 100);
		fw.close();

		System.out.println("done");
	}
}
