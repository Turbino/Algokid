package main;

public class Case {
	private int x;
	private int y;
	private int etat;
	
	public Case(int x, int y, int etat) {
		this.x = x;
		this.y = y;
		this.etat =etat;
	}
	public Case(int x, int y) {
		this.x = x;
		this.y =y;
		this.etat =1;
	}

	public void setEtat(int e) {
		this.etat = e;
	}
	public int getEtat(){
		return this.etat;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
}
