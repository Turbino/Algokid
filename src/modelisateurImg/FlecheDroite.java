package modelisateurImg;

import main.MyImage;

public class FlecheDroite{
	
    private String nomIm;
    
    public FlecheDroite() {
        nomIm = "src/img/flechedroite.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}