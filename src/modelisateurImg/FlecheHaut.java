package modelisateurImg;

import main.MyImage;

public class FlecheHaut{
	
    private String nomIm;
    
    public FlecheHaut() {
        nomIm = "src/img/flechehaut.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}