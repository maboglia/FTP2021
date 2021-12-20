package collezioni;

import java.util.ArrayList;

public class ProvaListe {

	public static void main(String[] args) {

		ArrayList<String> note = new ArrayList<String>();
		
		note.add("pisolo");
		note.add("eolo");
		note.add("gongolo");
		note.add("mammolo");
		
		System.out.println(note.size());
		System.out.println(note.get(3));

		for (String string : note) {
			System.out.println(string);
		}
		System.out.println("-------------------------------");
		note.remove(2);
		
		for (int i = 0; i < note.size(); i++) {
			System.out.println(note.get(i));
		}
		

	}

}
