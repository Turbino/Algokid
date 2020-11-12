package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import modele.Modele;

public class VueAccueil extends JPanel implements MouseListener{

	private Modele modele;
	
	public VueAccueil(Modele m) {
		this.modele = m;
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int w = this.getWidth();
		int h = this.getHeight();
		
		Color noir = new Color(0,0,0);
		Color marron = new Color(119,102,74);
		Color beige = new Color(218,193,155);
		Color jaunefade = new Color(241,234,156);
		Color jaune = new Color(255,255,0);
		Color vertbuisson = new Color(103,174,143);
		Color vertfonce = new Color(56,93,76);
		
		g.setColor(new Color(147,228,68));
		g.fillRect(0, 2*(h/3), w, h/3);
		g.setColor(new Color(161,241,245));
		g.fillRect(0, 0, w, 2*(h/3));
		g.setColor(new Color(250,255,24));
		g.fillOval(0-(w/15), 0-(h/15), w/5, h/5);
		g.setColor(new Color(255,255,255));
		g.fillOval(2*(w/3), h/6, w/15, h/15);
		g.fillOval(2*(w/3) + w/31, h/6 + h/60, w/15, h/15);
		g.fillOval(2*(w/3) + w/31, h/6 - h/60, w/15, h/15);
		g.fillOval(2*(w/3) + 2*(w/31), h/6 + h/60 + h/60, w/15, h/15);
		g.fillOval(2*(w/3) + 2*(w/31), h/6 - h/60 - h/60, w/15, h/15);
		g.fillOval(2*(w/3) + 2*(w/31), h/6, w/15, h/15);
		g.fillOval(2*(w/3) + 3*(w/31), h/6 + h/60, w/15, h/15);
		g.fillOval(2*(w/3) + 3*(w/31), h/6 - h/60, w/15, h/15);
		g.fillOval(2*(w/3) + 4*(w/31), h/6, w/15, h/15);
		
		g.setColor(new Color(0,0,0));
		g.drawArc(2*(w/3), h/6, w/15, h/15, 90, 180);
		g.drawArc(2*(w/3) + w/31, h/6 + h/60, w/15, h/15, -150, 65);
		g.drawArc(2*(w/3) + w/31, h/6 - h/60, w/15, h/15, 85, 65);
		g.drawArc(2*(w/3) + 2*(w/31), h/6 + h/60 + h/60, w/15, h/15, -150, 120);
		g.drawArc(2*(w/3) + 2*(w/31), h/6 - h/60 - h/60, w/15, h/15, 30, 120);
		g.drawArc(2*(w/3) + 3*(w/31), h/6 + h/60, w/15, h/15, -92, 65);
		g.drawArc(2*(w/3) + 3*(w/31), h/6 - h/60, w/15, h/15, 30, 65);
		g.drawArc(2*(w/3) + 4*(w/31), h/6, w/15, h/15, -88, 184);
		
		
		g.setColor(noir);
		g.fillRect(20*(w/80), 35*(h/80), 18*(w/80), h/80);
		g.fillRect(38*(w/80), 36*(h/80), w/80, 13*(h/80));
		g.fillRect(19*(w/80), 36*(h/80), w/80, 5*(h/80));
		g.fillRect(18*(w/80), 41*(h/80), w/80, 3*(h/80));
		g.fillRect(19*(w/80), 44*(h/80), w/80, 5*(h/80));
		g.fillRect(20*(w/80), 49*(h/80), 4*(w/80), h/80);
		g.fillRect(34*(w/80), 49*(h/80), 4*(w/80), h/80);
		g.fillRect(24*(w/80), 50*(h/80), w/80, 5*(h/80));
		g.fillRect(25*(w/80), 55*(h/80), w/80, 2*(h/80));
		g.fillRect(33*(w/80), 50*(h/80), w/80, 5*(h/80));
		g.fillRect(32*(w/80), 55*(h/80), w/80, 2*(h/80));
		g.fillRect(26*(w/80), 57*(h/80), w/80, h/80);
		g.fillRect(31*(w/80), 57*(h/80), w/80, h/80);
		g.fillRect(27*(w/80), 56*(h/80), w/80, h/80);
		g.fillRect(30*(w/80), 56*(h/80), w/80, h/80);
		g.fillRect(27*(w/80), 55*(h/80), 4*(w/80), h/80);
		
		g.setColor(marron);
		g.fillRect(19*(w/80), 41*(h/80), 2*(w/80), 3*(h/80));
		g.fillRect(24*(w/80), 49*(h/80), 10*(w/80), h/80);
		g.fillRect(25*(w/80), 50*(h/80), w/80, 5*(h/80));
		g.fillRect(27*(w/80), 51*(h/80), w/80, 3*(h/80));
		
		g.setColor(beige);
		g.fillRect(20*(w/80), 36*(h/80), 4*(w/80), 5*(h/80));
		g.fillRect(22*(w/80), 41*(h/80), 2*(w/80), 3*(h/80));
		g.fillRect(20*(w/80), 44*(h/80), 4*(w/80), 5*(h/80));
		g.fillRect(26*(w/80), 50*(h/80), w/80, 6*(h/80));
		g.fillRect(27*(w/80), 50*(h/80), 6*(w/80), h/80);
		g.fillRect(27*(w/80), 54*(h/80), 6*(w/80), h/80);
		g.fillRect(32*(w/80), 51*(h/80), w/80, 3*(h/80));
		g.fillRect(31*(w/80), 55*(h/80), w/80, h/80);
		g.fillRect(23*(w/80), 36*(h/80), w/80, 12*(h/80));
		
		g.setColor(jaunefade);
		g.fillRect(21*(w/80), 41*(h/80), w/80, 3*(h/80));
		g.fillRect(24*(w/80), 36*(h/80), 14*(w/80), h/80);
		g.fillRect(24*(w/80), 37*(h/80), w/80, 12*(h/80));
		g.fillRect(37*(w/80), 37*(h/80), w/80, 12*(h/80));
		g.fillRect(25*(w/80), 48*(h/80), 12*(w/80), h/80);
		g.fillRect(28*(w/80), 51*(h/80), 4*(w/80), 3*(h/80));
		g.fillRect(26*(w/80), 56*(h/80), w/80, h/80);
		g.fillRect(31*(w/80), 56*(h/80), w/80, h/80);
		
		g.setColor(vertfonce);
		g.fillRect(25*(w/80), 37*(h/80), 12*(w/80), 11*(h/80));
		
		g.setColor(vertbuisson);
		g.fillRect(25*(w/80), 38*(h/80), 11*(w/80), 10*(h/80));
		
		g.setColor(jaune);
		g.fillRect(26*(w/80), 42*(h/80), w/80, h/80);
		g.fillRect(35*(w/80), 42*(h/80), w/80, h/80);
		g.fillRect(28*(w/80), 43*(h/80), w/80, h/80);
		g.fillRect(33*(w/80), 43*(h/80), w/80, h/80);
		g.fillRect(28*(w/80), 44*(h/80), 6*(w/80), h/80);
		
		g.setColor(new Color(220,220,220));
		System.out.println(w/4);
		g.fillRect(w/4, 19*(h/24), 2*(w/4), h/6);
		g.setColor(Color.BLACK);
		g.drawRect(w/4, 19*(h/24), 2*(w/4), h/6);
		g.setFont(new Font("impact", Font.BOLD, 100));
		g.drawString("JOUER", 13*(w/36), 22*(h/24));
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		System.out.println(getWidth());
		if(e.getX() > getWidth()/4 && e.getX() < 3*(getWidth()/4) && e.getY() > 19*(getHeight()/24) && e.getY() < 23*(getHeight()/24)) {
			this.modele.jouer();
		}
	}

	public void mouseReleased(MouseEvent e) {
		
	}
}
