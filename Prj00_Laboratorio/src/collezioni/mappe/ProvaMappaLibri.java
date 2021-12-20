package collezioni.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import model.Libro;

public class ProvaMappaLibri {

	public static void main(String[] args) {
		Map<Integer, Libro> libri = new HashMap<>();
		//
		libri.put(1, new Libro(1, "I malavoglia", 10, 20, 1));
		libri.put(2, new Libro(2, "Io robot", 15, 23, 1));
		libri.put(3, new Libro(3, "I promessi", 20, 25, 1));
		libri.put(4, new Libro(4, "I simpson", 25, 22, 1));
		libri.put(3, new Libro(3, "I promessi sposi", 20, 25, 1));
		
		libri.keySet();//set delle chiavi
		libri.values();//collection dei valori
		
		
		for (Libro l : libri.values()) {
			System.out.println(l);
		}
		
		for (Entry<Integer, Libro> libro : libri.entrySet()) {
			System.out.println(libro.getKey());
			System.out.println(libro.getValue());
		}
		
		
	}

}
