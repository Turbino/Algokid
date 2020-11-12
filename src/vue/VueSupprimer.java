package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import main.MyImage;
import modele.Modele;
import modelisateurImg.Supprimer;

public class VueSupprimer extends JPanel implements MouseListener{

	private Modele modele;
	
	public VueSupprimer(Modele m) {
		this.modele = m;
		Supprimer s = new Supprimer();
		MyImage i = s.getLogo(false);
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
		this.modele.supprimerAction();
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
}
