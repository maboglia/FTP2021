package metodi;

class Player {
	
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void canestro() {
		this.score += 2;
	}
	
	public void bomba() {
		this.score +=3;
	}
	
	public String stampa() {
		return "Il giocatore " + this.name + " ha fatto "+ this.score + " punti";
	}
}

public class ProvaMetodi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1 = new Player("Magic Johnson");
		p1.canestro();
		p1.canestro();
		p1.canestro();
		p1.canestro();
		p1.bomba();
		System.out.println(p1.stampa());
		
		Player p2 = new Player("LeBron James");
		p2.bomba();
		p2.bomba();
		p2.bomba();
		p2.bomba();
		System.out.println(p2.stampa());
		
		if (p1.score > p2.score) {
			System.out.println("Vince " + p1.name);
		} else if (p1.score == p2.score) {
			System.out.println("pareggio");
		} else {
			System.out.println("Vince " + p2.name);
		}
		
		
	}

	//procedura non ha valore di ritorno e non ha valore di ingresso
	int counter = 0;
	void test1() {
		counter++;
		System.out.println("il cielo è blu");
	
	}
	
	
	//funzione: ha sempre input e output e non modifica le var in input
	
	int somma(int a, int b) {
		return a + b;
	}
	
}
