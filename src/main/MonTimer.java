package main;

import java.util.Observable;
import java.util.TimerTask;
import java.util.ArrayList;

import javax.swing.JPanel;

import modele.Modele;


public class MonTimer extends TimerTask{

	private JPanel p;
	private Observable o;
	private ArrayList<String> listeActions;
	private int orientation,x,y,i;
	private Labyrinthe l;
	
	public MonTimer(JPanel p, Observable o, ArrayList<String> listeActions, int orientation, int x, int y, Labyrinthe l) {
		this.p = p;
		this.o = o;
		this.listeActions = listeActions;
		this.orientation = orientation;
		this.x = x;
		this.y = y;
		this.i = 0;
		this.l = l;
		this.listeActions = ((Modele)o).getActionsChoisies();
	}
	
	public void run() {
		if(((Modele)o).getMarche() == true){
			if(this.listeActions.get(this.i) == "Avancer") {
				try {
					if(this.orientation == 1 && this.l.getCaseEtat(x,y+1) == 0) {
						this.l.setTab(x, y, 0);
						this.y++;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 2 && this.l.getCaseEtat(x+1,y) == 0) {
						this.l.setTab(x, y, 0);
						this.x++;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 3 && this.l.getCaseEtat(x,y-1) == 0) {
						this.l.setTab(x, y, 0);
						this.y--;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 4 && this.l.getCaseEtat(x-1,y) == 0) {
						this.l.setTab(x, y, 0);
						this.x--;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 1 && this.l.getCaseEtat(x,y+1) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else if(this.orientation == 2 && this.l.getCaseEtat(x+1,y) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else if(this.orientation == 3 && this.l.getCaseEtat(x,y-1) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else if(this.orientation == 4 && this.l.getCaseEtat(x-1,y) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else {
						((Modele)o).recensementErreur();
					}
					Sauvegarde.sauvegarder("a");
				} catch (Exceptions e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if(this.listeActions.get(i) == "Reculer") {
				try {
					if(this.orientation == 1 && this.l.getCaseEtat(x,y-1) == 0) {
						this.l.setTab(x, y, 0);
						this.y--;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 2 && this.l.getCaseEtat(x-1,y) == 0) {
						this.l.setTab(x, y, 0);
						this.x--;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 3 && this.l.getCaseEtat(x,y+1) == 0) {
						this.l.setTab(x, y, 0);
						this.y++;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 4 && this.l.getCaseEtat(x+1,y) == 0) {
						this.l.setTab(x, y, 0);
						this.x++;
						this.l.setTab(x, y, 2);
					} else if(this.orientation == 1 && this.l.getCaseEtat(x,y-1) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else if(this.orientation == 2 && this.l.getCaseEtat(x-1,y) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else if(this.orientation == 3 && this.l.getCaseEtat(x,y+1) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else if(this.orientation == 4 && this.l.getCaseEtat(x+1,y) == 3) {
						((Modele)o).monterNiveau();
						this.l.choixLabyrinthe(((Modele)o).getNiveau());
						((Modele)o).setMarche(false);
						this.cancel();
					} else {
						((Modele)o).recensementErreur();
					}
					Sauvegarde.sauvegarder("r");
				} catch (Exceptions e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if(this.listeActions.get(i) == "Tourner à droite") {
				if(this.orientation == 4) {
					this.orientation = 0;
				}
				this.orientation++;
				Sauvegarde.sauvegarder("d");
			}

			if(this.listeActions.get(i) == "Tourner à gauche") {
				if(this.orientation == 1) {
					this.orientation = 5;
				}
				this.orientation--;
				Sauvegarde.sauvegarder("g");
			}
			System.out.println(this.x + "    " + this.y);
			this.p.repaint();
			i++;
		}
		if(this.i == this.listeActions.size()) {
			((Modele)o).setMarche(false);
			this.cancel();
		}
	}

}
