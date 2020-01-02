package iodemos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialiszation_Customer {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization_Customer customer = new Serialization_Customer();
		ObjectInputStream stream = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(new File("delu.txt"))));

		customer = (Serialization_Customer) stream.readObject();

		System.out.println(customer);
	}
}
