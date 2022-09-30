
public class TC001 {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		
		String s3 = new String("abc");
		StringBuffer sb1 = new StringBuffer(s3);
		System.out.println(s3.equals(sb1));
		
		StringBuffer sb2 = new StringBuffer("abc");
	    StringBuffer sb3 = new StringBuffer("abc");
	    System.out.println(sb2.equals(sb3));
		
		String s4 = "abc";
		s4.intern();
		System.out.println(s1 == s4);
		
		String a = "one";
		String b = "one";
		System.out.println(a == b);
		
		System.out.println(Character.toString('a').toUpperCase());
		
	
	}

}