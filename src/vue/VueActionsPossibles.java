package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueActionsPossibles extends JPanel implements Observer{
	
	public VueActionsPossibles() {
		this.setBackground(Color.black);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	public void update(Observable o, Object arg) {
		
	}
}
