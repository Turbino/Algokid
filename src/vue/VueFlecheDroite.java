package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.MyImage;
import modele.Modele;
import modelisateurImg.FlecheDroite;

public class VueFlecheDroite extends JPanel implements MouseListener{

	private Modele modele;
	
	public VueFlecheDroite(Modele m){
		this.modele = m;
		FlecheDroite fd = new FlecheDroite();
		MyImage i = fd.getLogo(false);
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
		this.modele.choisirAction(this.modele.getActionsPossibles().get(2));
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
}
