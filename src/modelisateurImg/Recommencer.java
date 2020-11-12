package modelisateurImg;

import main.MyImage;

public class Recommencer{
	
    private String nomIm;
    
    public Recommencer() {
        nomIm = "src/img/recommencer.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}