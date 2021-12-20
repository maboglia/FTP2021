package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {


		String s1 = "hello ";
		String s2 = "hello ";
		
		System.out.println(s1 == s2);
		
		s1 += "world!";
		System.out.println(s1);
		String s3 = "hello world!";
		System.out.println(s3);
		System.out.println(s1 == s3);
		
		String s4 = new String("hello world!");
		
		
		
		

	}

}
