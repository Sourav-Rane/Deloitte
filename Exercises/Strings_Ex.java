package Exercises;

public class Strings_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(String s: args)
//			System.out.println(s);

			String s = "The quick brown fox jumps over the lazy dog";
			
			System.out.println(s.charAt(12));
		    String a[] = s.split(" ");
		    
		    for(String s1: a)
		    	if(s1.equals("is")) {
		    		System.out.println("word 'IS' exists");
		    		break;
		    	}
		    
		   s =  s.concat("and killed it");
		    
		    if(s=="The quick brown Fox jumps over the lazy Dog")
		    	System.out.println("yes");
		    else
		    	System.out.println("no");
		    
		    if(s=="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")
		    	System.out.println("yes");
		    else
		    	System.out.println("no");
		    
		    
		    System.out.println("length of the string is "+s.length());
		    
		    
		    if(s.equals("The quick brown Fox jumps over the lazy Dog"))
		    	System.out.println("yes");
		    else
		    	System.out.println("no");	
		    
		    
		    System.out.println(s.replaceAll("The","A"));
		    
		    
		    System.out.println(s.substring(0,25));
		    System.out.println(s.substring(25,s.length()));
		    
		    
		    
		    for(String s1: s.split(" "))
		    	if(s1.equals("fox") || s1.equals("dog")) {
		    		System.out.println(s1);
		    	}
		    
		    
		    System.out.println(s.toLowerCase());
		    System.out.println(s.toUpperCase());
		    
		    System.out.println(s.indexOf("a"));
		    System.out.println(s.lastIndexOf("e"));
		    
	}
    
}
