
public class TC008 {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		while(i < 9) {
			for (int j = 0; j < 3; j++) {
				if(i == 6) {
					System.out.println("Clicked in the 6th element");
					count++;
				}
				System.out.println(j);				
				i++;
			}
			System.out.println(count);
			if(count != 0) {
				break;
			}
		}
	}

}
