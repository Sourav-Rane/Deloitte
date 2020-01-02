package iodemos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("mohan.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("sharma.txt")));

		int i = 0;
		while ((i = br.read()) != -1) {
			bw.write((char) i);
		}

		br.close();
		bw.close();
	}
}
