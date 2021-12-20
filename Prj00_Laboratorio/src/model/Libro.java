package model;

public class Libro {

	private int id;
	private String titolo;
	private double prezzo;
	private int pagine;
	private int editore_id;
	
	public Libro() {}

	public Libro(int id, String titolo, double prezzo, int pagine, int editore_id) {
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
		this.editore_id = editore_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getEditore_id() {
		return editore_id;
	}

	public void setEditore_id(int editore_id) {
		this.editore_id = editore_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", pagine=");
		builder.append(pagine);
		builder.append(", editore_id=");
		builder.append(editore_id);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
