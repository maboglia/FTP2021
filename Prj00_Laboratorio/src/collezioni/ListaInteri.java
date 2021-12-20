package collezioni;

import java.util.ArrayList;
import java.util.List;

public class ListaInteri {

	public static void main(String[] args) {
		List<Integer> voti = new ArrayList<Integer>();
		
		voti.add(25);
		voti.add(26);
		voti.add(27);
		voti.add(28);
		voti.add(29);
		voti.add(23);
		voti.add(24);
		voti.add(25);
		voti.add(27);
		voti.add(27);
		
		int totale = 0;
		double media = 0;
		
		for (int i : voti) {
			totale += i;
		}
		media =  (double) totale / voti.size();
		System.out.println("la media è: " + media);
		
	}
	
	
}
