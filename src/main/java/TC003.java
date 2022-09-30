
public class TC003 {

	static { 
		 code(2); 
	}
	 
	static void code(int val)
	{
		 System.out.print(val + " ");
	}
	 
	TC003() 
	{
		 code(5); 
	}
	 
	static 
	{
		 code(4);
	}
	 
	{	 
	  code(6);
	}
	static {
	  code(10);
	  new TC003();
	}
	{
		 code(8); 
	}
	 
	public static void main(String[] args) {
	}

}