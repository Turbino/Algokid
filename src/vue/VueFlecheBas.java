package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import main.MyImage;
import modele.Modele;
import modelisateurImg.FlecheBas;

public class VueFlecheBas extends JPanel implements MouseListener{

	private Modele modele;
	
	public VueFlecheBas(Modele m) {
		this.modele = m;
		FlecheBas fb = new FlecheBas();
		MyImage i = fb.getLogo(false);
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
		this.modele.choisirAction(this.modele.getActionsPossibles().get(1));
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
}
