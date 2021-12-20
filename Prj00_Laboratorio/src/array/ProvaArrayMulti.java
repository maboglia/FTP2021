package array;

public class ProvaArrayMulti {

	public static void main(String[] args) {
		
		//int[][] voti = new int[3][3];
		int[][] voti = {
				{25, 26, 28},
				{25, 25, 24},
				{21, 22, 23},
		};
		
		for (int i = 0; i < voti.length; i++) {
			for (int j = 0; j < voti[i].length; j++) {
				System.out.print(voti[i][j] + "\t");
			}
			
			System.out.println();
		}
		
	}
	
}
