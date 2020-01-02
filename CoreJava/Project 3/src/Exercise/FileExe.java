package Exercise;

import java.io.File;
import java.io.IOException;

public class FileExe {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\Documents\\GitHub\\Deloitte\\File\\Batch\\BatchMates.txt");
		File folder = new File("C:\\Users\\Admin\\Documents\\GitHub\\Deloitte\\File\\Batch");

		if (f.exists())
			System.out.println("File is there ... go and see ");
		else {
			folder.mkdir(); // to create a folder
			f.createNewFile(); // to create a file
			System.out.println("New File created !");
		}
		File path = new File("C:\\\\Users\\\\Admin\\\\Documents\\\\GitHub\\\\Deloitte\\\\File");
		File arr[] = path.listFiles();

		for (File a : arr)
			if (a.isDirectory())
				System.out.println(a + " is Directory");
			else
				System.out.println(a + " is a File");

	}
}
