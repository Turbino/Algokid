package main;

public class Labyrinthe {
	
	private Case[][] tab;


	public Labyrinthe() {
		this.tab = new Case[20][20];
		for(int x=0;x<20;x++) {
			for(int y=0; y<10;y++) {
				this.tab[y][x]=new Case(x,y);
			}
		}

	}
	public void choixLabyrinthe(int choix){
		switch(choix) {
		case 0:
			for(int x =3;x<6;x++) {
			 for(int y =0;y<tab.length;y++) {
				 this.tab[x][y].setEtat(0);

			 }
			}
			this.tab[4][0].setEtat(2);
			this.tab[4][3].setEtat(3);
			break;
		case 1:
			for(int x =3;x<6;x++) {
				 for(int y =0;y<tab.length;y++) {
					 this.tab[x][y].setEtat(0);

				 }
				}
				
				    for (int x = 0; x < 10; ++x) {
				        for (int y = 0; y < this.tab[x].length; ++y) {
				            System.out.print(this.tab[x][y].getEtat());
				        }
				        System.out.println();
				    }
				    this.tab[4][0].setEtat(2);
					this.tab[3][3].setEtat(3);
				    break;
		case 2:
			for(int x =3;x<6;x++) {
				 for(int y =0;y<tab.length;y++) {
					 this.tab[x][y].setEtat(0);

				 }
				}
				
				    for (int x = 0; x < 10; ++x) {
				        for (int y = 0; y < this.tab[x].length; ++y) {
				            System.out.print(this.tab[x][y].getEtat());
				        }
				        System.out.println();
				    }
				    this.tab[4][0].setEtat(2);
					this.tab[4][10].setEtat(3);
				    break;
		case 3:
			for(int x =3;x<6;x++) {
				 for(int y =0;y<tab.length;y++) {
					 this.tab[x][y].setEtat(0);

				 }
				}
				
				    for (int x = 0; x < 10; ++x) {
				        for (int y = 0; y < this.tab[x].length; ++y) {
				            System.out.print(this.tab[x][y].getEtat());
				        }
				        System.out.println();
				    }
				    this.tab[4][0].setEtat(2);
					this.tab[5][15].setEtat(3);
				    break;
			
		default:
			break;
			
		}
	}
	public Case[][] getTab() {
		return this.tab;
	}
	public Case getCase(int x, int y) {
		return this.tab[x][y];
	}
	
	public int getCaseEtat(int x, int y) throws Exceptions {
		if(this.dansletab(x,y)) {
		return this.tab[x][y].getEtat();
		} else {
			return 50;
		}
	}
	public void setCaseEtat(int x, int y, int etat) {
		this.tab[x][y].setEtat(etat);
	}
	
	public void setTab(int x, int y, int v) {
		this.tab[x][y].setEtat(v);
	}
	
	public boolean dansletab(int x,int y) {
		boolean res = true;
		if ((x<0)||(y<0)||(x>this.tab.length)||(y>this.tab.length)) {
			return false;
		} else {
			return res;
		}
	}
	
	public boolean estunmur(int x, int y) {
		if(this.tab[x][y].getEtat()==1) {
			return true;
		} else {
			return false;
		}
	}

}

