package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import modele.Modele;

public class VueFenetre extends JFrame implements Observer{
	
	private JPanel panEntier, panHaut, panRobot;
	private VueRobot vr;
	private VueAccueil hautAccueil;
	private JPanel basAccueil;
	private JButton bJouer;
	private Modele modele;
	
	public VueFenetre(Modele m) {
		
		this.setSize(new Dimension(998,999));
		
		this.modele = m;
		
		VueBoutons vb = new VueBoutons(m);
		
		VueActionsChoisies vac = new VueActionsChoisies();
		
		int horizontalPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		
		JScrollPane scrollPane = new JScrollPane(vac);
		
		scrollPane.setHorizontalScrollBarPolicy(horizontalPolicy);
		 
		VueActionsPossibles vap = new VueActionsPossibles();
		
		VueFleches vf = new VueFleches(m);
		
		VueExec ve = new VueExec();
		 
		this.vr = new VueRobot();
		 
		m.addObserver(vac);
		m.addObserver(vap);
		m.addObserver(ve);
		m.addObserver(this.vr);
		 
		this.setName("Projet Tutoré");
		 
		this.panEntier = new JPanel();
		 
		this.panHaut = new JPanel();
		
		this.panRobot = new JPanel();
		 
		this.panHaut.setLayout(new GridLayout(1,2));
		 
		JPanel panHGauche = new JPanel();
		
		panHGauche.setLayout(new GridLayout(3,1));
		 
		panHGauche.add(scrollPane);
		panHGauche.add(vb);
		panHGauche.add(vf);
		 
		this.panHaut.add(panHGauche);
		this.panHaut.add(ve);
		
		this.panRobot.add(vr);
		
		this.panEntier.setLayout(new BorderLayout());
		this.hautAccueil = new VueAccueil(m);
		
		this.basAccueil = new JPanel();
		this.basAccueil.setBackground(new Color(147,228,68));
		this.panEntier.add(hautAccueil);
		
		this.setContentPane(this.panEntier);
		
	}

	public void update(Observable o, Object arg) {
		this.panEntier.remove(this.hautAccueil);
		this.panEntier.remove(this.basAccueil);
		this.panEntier.setLayout(new GridLayout(2,1));
		this.panEntier.add(this.panHaut);
		this.panEntier.add(this.vr);
		this.revalidate();
		this.modele.deleteObserver(this);
		this.resize(new Dimension(999,999));
	}
}

