package modele;

import java.util.Observable;
import java.util.ArrayList;

public class Modele extends Observable{

	private boolean accueil, marche, erreur;
	private int niveau;
	private ArrayList<String> actionsChoisies, actionsPossibles, actionsChoisiesTemp;
	
	
	public Modele() {
		this.niveau = 0;
		this.accueil = true;
		this.marche = false;
		this.erreur = false;
		this.actionsPossibles = new ArrayList<String>();
		this.actionsPossibles.add("Avancer");
		this.actionsPossibles.add("Reculer");
		this.actionsPossibles.add("Tourner à droite");
		this.actionsPossibles.add("Tourner à gauche");
		this.actionsChoisies = new ArrayList<String>();
	}
	
	public void jouer() {
		this.accueil = false;
		this.setChanged();
		this.notifyObservers();
	}
	
	public void appliquerActions() {
		if((this.marche == false)&&(this.actionsChoisies.size()>0)) {
			this.marche = true;
			this.setChanged();
			this.notifyObservers();
		}
	}
	
	public void supprimerAction() {
		if((this.marche == false)&&(this.actionsChoisies.size()>0)) {
			this.actionsChoisies.remove(this.actionsChoisies.size()-1);
			this.setChanged();
			this.notifyObservers();
		}
	}
	
	public ArrayList<String> getActionsChoisies() {
		return actionsChoisies;
	}

	public ArrayList<String> getActionsPossibles() {
		return actionsPossibles;
	}

	public void choisirAction(String action) {
		this.actionsChoisies.add(action);
		this.setChanged();
		this.notifyObservers();
	}
	
	public void recommencer() {
        this.actionsChoisiesTemp=this.actionsChoisies;
        this.actionsChoisies = new ArrayList<String>();
        this.marche = false;
        this.erreur = false;
        this.setChanged();
        this.notifyObservers();
        this.actionsChoisies=this.actionsChoisiesTemp;
        this.setChanged();
        this.notifyObservers();
    }
	
	public void recensementErreur() {
		this.erreur = true;
	}
	
	public void monterNiveau() {
		this.niveau++;
	}

	public boolean getAccueil() {
		return this.accueil;
	}
	
	public boolean getMarche() {
		return this.marche;
	}
	
	public boolean getErreur() {
		return this.erreur;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public void setMarche(boolean b) {
		this.marche = b;
	}
}
