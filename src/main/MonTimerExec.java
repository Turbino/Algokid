package main;

import java.util.ArrayList;
import java.util.Observable;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import modele.Modele;

public class MonTimerExec extends TimerTask{

	private JTextArea ta;
	private Observable o;
	private int i;
	
	public MonTimerExec(JTextArea ta, Observable o) {
		this.ta = ta;
		this.o = o;
		this.i = 0;
	}
	
	public void run() {
		if(((Modele)o).getMarche() == true) {
			ta.append(i + 1 + " : " + ((Modele)o).getActionsChoisies().get(i) + "\n");
			i++;
		}
		
		if(((Modele)o).getErreur() == true) {
			ta.append("ERREUR! Votre robot a percuté un mur! \n");
		}
		
		if(this.i == ((Modele)o).getActionsChoisies().size()) {
			this.cancel();
		}
	}
}
