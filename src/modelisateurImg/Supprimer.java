package modelisateurImg;

import main.MyImage;

public class Supprimer{
	
    private String nomIm;
    
    public Supprimer() {
        nomIm = "src/img/supprimer.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
}