package modelisateurImg;

import main.MyImage;

public class Mur{
	
    private String nomIm;
    
    public Mur() {
        nomIm = "src/img/mur.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}