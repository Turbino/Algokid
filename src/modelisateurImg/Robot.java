package modelisateurImg;

import main.MyImage;

public class Robot{
	
    private String nomIm;
    
    public Robot() {
        nomIm = "src/img/robot.png";
    }
    
    public MyImage getLogo(boolean b){
        MyImage img = new MyImage(nomIm);
        img.setScroll(b);
        return img;
    }
    
}