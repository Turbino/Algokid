package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import main.MyImage;
import modele.Modele;
import modelisateurImg.FlecheGauche;

public class VueFlecheGauche extends JPanel implements MouseListener{

	private Modele modele;
	
	public VueFlecheGauche(Modele m) {
		this.modele = m;
		FlecheGauche fg = new FlecheGauche();
		MyImage i = fg.getLogo(false);
		this.setLayout(new GridLayout(1,1));
		this.add(i);
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		this.modele.choisirAction(this.modele.getActionsPossibles().get(3));
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
}
