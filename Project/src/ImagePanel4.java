
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel4 extends JPanel{

	private static final long serialVersionUID = 1L;
	
	BufferedImage myPicture=null;

	public ImagePanel4(){
		
	/* Adding Image */	
	try {
	myPicture = ImageIO.read(new File("/dbhome/product/11.2.0/dbhome_1/son/hw2_data/map.JPG"));
	}
	catch (IOException ex) {
        ex.getMessage();
       
    }
	}
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    	g.drawImage(myPicture,0,0,820,580,this);
    	g.setColor(Color.blue);

    	WholeQuery2 wq=new WholeQuery2();
    	
    	int[] p=wq.Values(); 
    	
		for(int q=0;q<160;){
			int x=p[q];
			int y=p[q+1];
	        g.setColor(Color.green);
	        g.drawRect(x, y, 5, 5);
	        q=q+2;
			
		}
        }
}


