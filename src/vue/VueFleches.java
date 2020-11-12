package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JPanel;

import modele.Modele;

public class VueFleches extends JPanel{
	
	private Modele modele;
	
	public VueFleches(Modele m){
		this.modele = m;
		VueFlecheHaut vfh = new VueFlecheHaut(m);
		VueFlecheBas vfb = new VueFlecheBas(m);
		VueFlecheGauche vfg = new VueFlecheGauche(m);
		VueFlecheDroite vfd = new VueFlecheDroite(m);
		this.setLayout(new GridLayout(1,4));
		this.add(vfh);
		this.add(vfb);
		this.add(vfg);
		this.add(vfd);
	}
}
