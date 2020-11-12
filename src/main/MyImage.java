package main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MyImage extends JPanel {
	
    Image image;
    Dimension size = new Dimension();
    private boolean[] imagesMises;
    private boolean peindre;
    private boolean scroll;

    public MyImage(String path) {
        try{
            this.image = ImageIO.read(new File(path));
            this.image = this.image.getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        }
        catch(Exception e)
        {
            System.out.println("Error creating image with path "+path);
            System.out.println(e);
        }           
        this.scroll = false;
    }
    
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
    
    public void setScroll(boolean b) {
    	this.scroll = b;
    }
}
