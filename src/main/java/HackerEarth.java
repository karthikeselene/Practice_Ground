public class HackerEarth {

	static { 
		code(2); 
	}

	static void code(int val) {
		System.out.print(val + " ");
	}

	HackerEarth() {
		code(5); 
	}

	static {
		code(4);
	}

	{	 
		code(6);
	}
	static {
		new HackerEarth();
	}
	{
		code(8); 
	}

	public static void main(String[] args) {
	}	

}