package modelisateurImg;

import main.MyImage;

public class Valider{
	
    private String nomIm;
    
    public Valider() {
        nomIm = "src/img/valider.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}