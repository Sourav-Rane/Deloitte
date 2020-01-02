package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) throws IOException {

		String fs = File.separator;
		File file = new File("C:" + fs + "Users" + fs + "Admin" + fs + "Documents" + fs + "GitHub" + fs + "Deloitte"
				+ fs + "File" + fs + "Batch" + fs + "Some.txt");

		FileReader reader = new FileReader(file);
		int i = 0;

		while ((i = reader.read()) != -1) {
			System.out.println((char) i);
		}

		reader.close();

	}

}
