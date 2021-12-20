package array;

public class ProvaArray2 {

	public static void main(String[] args) {
		
		int[] voti = {25, 24, 28, 18, 29};
		
		double media = 0;
		
		for (int i = 0; i < voti.length; i++) {
			media += voti[i];
		}
		
		for (int i : voti) {
			System.out.println(i);
		}
		
		System.out.println(media / voti.length);

	}

}
