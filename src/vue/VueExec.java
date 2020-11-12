package vue;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

import javax.swing.JTextArea;

import main.MonTimer;
import main.MonTimerExec;
import modele.Modele;

public class VueExec extends JTextArea implements Observer{

	public VueExec() {
		this.append("Console : \n");
	}

	public void update(Observable o, Object arg) {
		if(((Modele)o).getMarche() == true) {
			Timer t = new Timer();
			MonTimerExec mte = new MonTimerExec(this, o);
			t.schedule(mte, 0, 1000);
		}  else {
			this.setText("");
			this.append("Console : \n");
		}
	}
}
