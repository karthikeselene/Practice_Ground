package stringground;

public class CommonClass {
	
	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		obj.method();
		obj.name = "Test String";		
		System.out.println(obj.name);
		
		ChildClass obj1 = (ChildClass) obj;
		obj1.method();
		
	}

}