package modelisateurImg;

import main.MyImage;

public class FlecheBas{
	
    private String nomIm;
    
    public FlecheBas() {
        nomIm = "src/img/flechebas.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}