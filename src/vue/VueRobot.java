package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

import main.Exceptions;
import main.Labyrinthe;
import main.MonTimer;
import modele.Modele;

public class VueRobot extends JPanel implements Observer{
	private Labyrinthe l;
	private int x,y,orientation;
	private ArrayList<String> listeActions;
	
	public VueRobot() {
		this.l=new Labyrinthe();
		this.l.choixLabyrinthe(0);
		this.orientation = 1;
		for(int i = 0 ; i < 10; i++) {
			for(int j = 0 ; j < this.l.getTab().length  ; j++) {
				try {
					if(this.l.getCaseEtat(i,j) == 2) {
						this.x = i;
						this.y = j;
					}
				} catch (Exceptions e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		this.setBackground(Color.white);
		this.listeActions = new ArrayList<String>();
	}

	public void update(Observable o, Object arg) {
		if(((Modele)o).getMarche() == true) {
			Timer t = new Timer();
			MonTimer mt = new MonTimer(this, o, this.listeActions, this.orientation, this.x, this.y, this.l);
			t.schedule(mt, 0, 1000);
		} else {
			this.l.choixLabyrinthe(((Modele)o).getNiveau());
			for(int i = 0 ; i < 10 ; i++) {
				for(int j = 0 ; j < this.l.getTab().length  ; j++) {
					try {
						if(this.l.getCaseEtat(i,j) == 2) {
							this.x = i;
							this.y = j;
						}
					} catch (Exceptions e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			this.repaint();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		this.setBackground(new Color(0,100,0));
		
		for (int x=0;x<10;x++) {
			for (int y=0;y<this.l.getTab().length ;y++) {
				try {
					if (this.l.getCaseEtat(x,y)==1) {
						g.setColor(new Color(197, 100, 0));
						g.fillRect(y*(w/20), x*(h/10), w/20, h/10);
						g.setColor(Color.WHITE);
						g.fillRect((y*(w/20))+(w/20)/4, x*(h/10), (w/20)/20, (h/10)/4);
						g.fillRect((y*(w/20))+3*((w/20)/4), x*(h/10), (w/20)/20, (h/10)/4);
						g.fillRect(y*(w/20), x*(h/10)+(h/10)/4, (w/20), (h/10)/20);
						g.fillRect(y*(w/20), x*(h/10)+(h/10)/4, (w/20), (h/10)/20);
						g.fillRect(y*(w/20), x*(h/10)+2*((h/10)/4), (w/20), (h/10)/20);
						g.fillRect(y*(w/20), x*(h/10)+3*((h/10)/4), (w/20), (h/10)/20);
						g.fillRect(y*(w/20), (x*(h/10)+(h/10)/20)-2, (w/20), (h/10)/20);
						g.fillRect((y*(w/20))+2*((w/20)/4), x*(h/10)+(h/10)/4, (w/20)/20, (h/10)/4);
						g.fillRect((y*(w/20))+1*((w/20)/20)-2, x*(h/10)+(h/10)/4, (w/20)/20, (h/10)/4);
						g.fillRect((y*(w/20))+(w/20)/4, x*(h/10)+2*((h/10)/4), (w/20)/20, (h/10)/4);
						g.fillRect((y*(w/20))+3*((w/20)/4), x*(h/10)+2*((h/10)/4), (w/20)/20, (h/10)/4);
						g.fillRect((y*(w/20))+2*((w/20)/4), x*(h/10)+3*((h/10)/4), (w/20)/20, (h/10)/4);
						g.fillRect((y*(w/20))+1*((w/20)/20)-2, x*(h/10)+3*((h/10)/4), (w/20)/20, (h/10)/4);
					}
				} catch (Exceptions e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					if (this.l.getCaseEtat(x,y)==2) {
						g.setColor(Color.yellow);
						g.fillRect(y*(w/20), x*(h/10), w/20+1, h/10);
						g.setColor(Color.BLACK);
						g.drawRect(y*(w/20), x*(h/10), w/20+1, h/10);
						g.setColor(new Color(148, 226, 249));
						g.fillRect((y*(w/20))+3*((w/20)/12), x*(h/10)+2*((h/10)/12), 2*((w/20)/12), 2*((h/10)/12));
						g.fillRect((y*(w/20))+7*((w/20)/12), x*(h/10)+2*((h/10)/12), 2*((w/20)/12), 2*((h/10)/12));
						g.fillRect((y*(w/20))+3*((w/20)/12)+1, x*(h/10)+8*((h/10)/12), 6*((w/20)/12), 2*((h/10)/12));
						g.fillRect((y*(w/20))+2*((w/20)/12)+1, x*(h/10)+7*((h/10)/12), 2*((w/20)/12), 2*((h/10)/12));
						g.fillRect((y*(w/20))+8*((w/20)/12)+1, x*(h/10)+7*((h/10)/12), 2*((w/20)/12), 2*((h/10)/12));
						g.setColor(Color.BLACK);
						g.drawRect((y*(w/20))+3*((w/20)/12), x*(h/10)+2*((h/10)/12), 2*((w/20)/12), 2*((h/10)/12));
						g.drawRect((y*(w/20))+7*((w/20)/12), x*(h/10)+2*((h/10)/12), 2*((w/20)/12), 2*((h/10)/12));
					}
				} catch (Exceptions e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if(this.l.getCaseEtat(x,y)==3) {
						g.setColor(Color.RED);
						g.fillRect(y*(w/20), x*(h/10), w/20+1, h/10);
					}
				} catch (Exceptions e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
