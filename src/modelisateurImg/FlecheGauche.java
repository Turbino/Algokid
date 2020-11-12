package modelisateurImg;

import main.MyImage;

public class FlecheGauche{
	
    private String nomIm;
    
    public FlecheGauche() {
        nomIm = "src/img/flechegauche.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
}