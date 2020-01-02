package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeque {

	public static void main(String[] args) {
		Deque<String> d = new LinkedList<String>();

		d.add("5");
		d.addFirst("4");
		d.addLast("1");
		d.push("7");

	}

}
