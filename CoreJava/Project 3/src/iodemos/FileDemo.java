package iodemos;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Admin\\Documents\\GitHub\\Deloitte\\File\\NewYear\\newyr.txt");
		File h = new File("C:\\\\Users\\\\Admin\\\\Documents\\\\GitHub\\\\Deloitte\\\\File\\\\NewYear");

		if (file.exists())
			System.out.println("File is there ... go and see ");
		else {
			h.mkdir(); // to create a folder
			file.createNewFile(); // to create a file
			System.out.println("New File created !");
		}

	}
}
