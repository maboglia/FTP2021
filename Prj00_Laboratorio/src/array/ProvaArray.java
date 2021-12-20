package array;

public class ProvaArray {

	public static void main(String[] args) {
		
		int[] voti = new int[5];
		
		voti[0] = 25;
		voti[1] = 24;
		voti[2] = 28;
		voti[3] = 18;
		voti[4] = 29;
		
		double media = 0;
		
		for (int i = 0; i < voti.length; i++) {
			media = media + voti[i];
		}
		
		System.out.println(media / voti.length);

	}

}
