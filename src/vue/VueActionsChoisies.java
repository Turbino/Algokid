package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import main.MyImage;
import modele.Modele;
import modelisateurImg.FlecheGauche;
import modelisateurImg.FlecheHaut;

public class VueActionsChoisies extends JPanel implements Observer{

	private ArrayList<String> listeActions;
	private JScrollPane scrollPane;
	
	public VueActionsChoisies() {
		this.listeActions = new ArrayList<String>();
		this.setPreferredSize(new Dimension(3000, 140));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0 ; i < this.listeActions.size() ; i++) {
			if(this.listeActions.get(i) == "Avancer") {
				g.setColor(new Color(19, 110, 246));
				g.fillRect(i*getHeight(), 0, getHeight(), getHeight());
				g.setColor(Color.BLACK);
				g.setFont(new Font("Times New Romans",1,35));
				g.drawRect(i*getHeight(), 0, getHeight(), getHeight());
				g.drawString("Avancer",(i*getHeight()+getHeight()/20), (int) (9*getHeight()/16));
			}
			if(this.listeActions.get(i) == "Reculer") {
				g.setColor(new Color(19, 110, 246));
				g.fillRect(i*getHeight(), 0, getHeight(), getHeight());
				g.setColor(Color.BLACK);
				g.setFont(new Font("Times New Romans",1,35));
				g.drawRect(i*getHeight(), 0, getHeight(), getHeight());
				g.drawString("Reculer",(i*getHeight()+getHeight()/15), (int) (9*getHeight()/16));
			}
			if(this.listeActions.get(i) == "Tourner à droite") {
				g.setColor(new Color(19, 110, 246));
				g.fillRect(i*getHeight(), 0, getHeight(), getHeight());
				g.setColor(Color.BLACK);
				g.setFont(new Font("Times New Romans",1,35));
				g.drawRect(i*getHeight(), 0, getHeight(), getHeight());
				g.drawString("Droite",(i*getHeight()+getHeight()/6), (int) (9*getHeight()/16));
			}
			if(this.listeActions.get(i) == "Tourner à gauche") {
				g.setColor(new Color(19, 110, 246));
				g.fillRect(i*getHeight(), 0, getHeight(), getHeight());
				g.setColor(Color.BLACK);
				g.setFont(new Font("Times New Romans",1,35));
				g.drawRect(i*getHeight(), 0, getHeight(), getHeight());
				g.drawString("Gauche",(i*getHeight()+getHeight()/15), (int) (9*getHeight()/16));
			}
		}
	}
	
	public void update(Observable o, Object arg) {
		this.listeActions = ((Modele)o).getActionsChoisies();
		repaint();
	}
}
