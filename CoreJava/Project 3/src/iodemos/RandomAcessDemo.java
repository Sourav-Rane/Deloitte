package iodemos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("friday.txt", "rw");
		file.writeUTF("Today is friday");
		System.out.println(file.getFilePointer());
		int x = (int) file.length();

		file.writeUTF("sourav");

		file.seek(x);

		String str = file.readLine();

		file.close();
		System.out.println("File content is : ");
		System.out.println(str);

	}
}
