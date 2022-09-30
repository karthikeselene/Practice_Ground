import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TC006 {
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(null);
		set.add(2);
		set.add(null);
		System.out.println(set);
		
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("King");
		set1.add("Apple");
		set1.add("Book");
		System.out.println(set1);
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("King");
		tree.add("Apple");
		tree.add("Book");
		System.out.println(tree);
		
	}

}
