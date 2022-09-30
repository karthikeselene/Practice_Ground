import java.util.ArrayList;

public class TC004 {

	public static void main(String[] args) {
		ArrayList lists = new ArrayList<String>();
		lists.add("a");
		lists.add(1); 
		lists.add(new Object());
        System.out.println(lists);		
	}

}
