package collezioni.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMappe {

	public static void main(String[] args) {
		
		Map<String, String> regioni = new HashMap<>();
		//			   set        list
		regioni.put("piemonte", "torino");
		regioni.put("lombardia", "milano");
		regioni.put("lazio", "roma");
		regioni.put("liguria", "genova");
		
		Set<String> nomiRegione = regioni.keySet();
		
		for (String regione : nomiRegione) {
			System.out.println(regione);
			System.out.println(regioni.get(regione));
		}
		
	}
	
	
}
