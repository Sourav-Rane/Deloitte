package oops;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "The quick brown fox jumps over the lazy dog";
		StringTokenizer tk = new StringTokenizer(text);
		
		System.out.println(tk.countTokens()); // counts number of words
		
		while(tk.hasMoreTokens()) {
			System.out.println(tk.nextElement() 
					);
		}
	}

}
