package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyOperation {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file to read");
		String fname = sc.next();

		File f = new File(fname);

		if (f.exists()) {
			System.out.println(fname + " exists");
			FileReader reader = new FileReader(f);

			System.out.println("Enter file to copy ");
			String cfname = sc.next();
			FileWriter fw = new FileWriter(cfname);

			int i = 0;
			while ((i = reader.read()) != -1) {
				fw.write((char) i);
			}

			System.out.println("contents copied to " + cfname + " from " + fname);

			fw.close();
			reader.close();

		} else
			System.out.println(fname + " does not exist");

	}
}
