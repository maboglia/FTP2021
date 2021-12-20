package cicli;

public class CicloFor {

	public static void main(String[] args) {
		
		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 1; i <= RIGHE; i++) {
			for (int j = 1; j <= COLONNE; j++) {
				
				System.out.print(i * j +"\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < RIGHE; i++) {
			if (i == 5)
				return;
			System.out.println(i);
			
		}
		
		
	}
	
	
	
}
