import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel2 extends JPanel{

	private static final long serialVersionUID = 1L;
	
	BufferedImage myPicture=null;

	public ImagePanel2(){
		
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
    	g.setColor(Color.yellow);

    	WholeQuery wq=new WholeQuery();
    	
    	int[] x=null;  
    	int[] y=null;  
    	
		for(int p=0;p<=35;p++){
			x=wq.xValues(p);
			y=wq.yValues(p);
			g.drawPolygon(x, y, x.length);
			
		}
        }
}

