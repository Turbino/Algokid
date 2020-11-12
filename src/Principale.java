

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import modele.Modele;
import vue.VueActionsChoisies;
import vue.VueActionsPossibles;
import vue.VueExec;
import vue.VueFenetre;
import vue.VueRobot;

public class Principale {

	public static void main(String[] args) {
		
		Modele m = new Modele();
		
		VueFenetre vf = new VueFenetre(m);
		
		m.addObserver(vf);
		
		vf.setFocusable(true);
		vf.setVisible(true);
		vf.requestFocusInWindow();
		
	}
}
