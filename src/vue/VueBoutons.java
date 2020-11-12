package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JPanel;

import modele.Modele;

public class VueBoutons extends JPanel{
	
	private Modele modele;
	
	public VueBoutons(Modele m){
		this.modele = m;
		VueRecommencer vr = new VueRecommencer(m);
		VueSupprimer vs = new VueSupprimer(m);
		VueValider vv = new VueValider(m);
		this.setLayout(new GridLayout(1,3));
		this.add(vr);
		this.add(vs);
		this.add(vv);
	}
}