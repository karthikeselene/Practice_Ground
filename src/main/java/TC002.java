import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TC002 {

	public static void main(String[] args) throws IOException {		
		try {
			int i = 1/0;
			System.out.println(i);
		} catch (Exception e) {
			File file = new File("./error.txt");
			FileWriter fr = new FileWriter(file);
			fr.write(e.toString());
			fr.close();
		}
	}

}