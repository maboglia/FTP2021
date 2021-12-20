package array;

public class ProvaArrayStringhe {

	public static void main(String[] args) {
		
		String[] nani = {
				"eolo",
				"mammolo",
				"pisolo",
				"dotto",
				"gongolo",
				"brontolo",
				"cucciolo",
		};
		int i = 0;
		for (String nano : nani) {
			i++;
			if (nano.length() > 5) {
				System.out.println(nano + ": " + nano.length());
				System.out.println("pippo");
			}
		}
			
		
		
		
		
	}
	
	
}
