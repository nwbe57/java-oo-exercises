package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BrightnessFilter implements Filter{
	
	
	private int r;   
	private int g;
	private int b;

	public Picture process(Picture original) {
		
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	    	  if(c.getRed() < 155){
	    		  r = c.getRed() + 100;
	    	  } else {
	    		  r = 255;
	    	  }
	    	  
	    	  if(c.getBlue() < 155){
	    		  b = c.getBlue() + 100;
	    	  } else {
	    		  b = 255;
	    	  }
	    	 
	    	  if(c.getGreen() < 155){
	    		  g = c.getGreen() + 100;
	    	  } else {
	    		  g = 255;
	    	  }
	          
	          processed.set(i, j, new Color(r, g, b));
	      }  
	      
	    }
		
		return processed;
	}

}
