package modelisateurImg;

import main.MyImage;

public class Sol{
	
    private String nomIm;
    
    public Sol() {
        nomIm = "src/img/sol.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}