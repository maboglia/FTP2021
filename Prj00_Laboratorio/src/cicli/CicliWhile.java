package cicli;

public class CicliWhile {

	public static void main(String[] args) {

		boolean gira = true;
		
		while (gira) {
			System.out.println("gira");
			
			if (Math.random() > 0.95) {
				gira = false;
			}
		}
		

	}

}
