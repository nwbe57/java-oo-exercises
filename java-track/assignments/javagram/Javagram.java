package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Scanner;


public class Javagram {
	
	private static Scanner s = new Scanner(System.in);
	private static int selection;
	
	public int filterMenu(){
		
		System.out.println("Welcome to the Filter Menu!");
		System.out.println("1. Blue Filter");
		System.out.println("2. Monochrome Filter");
		System.out.println("3. Brightness Filter");
		System.out.println("4. Invert Filter");
		System.out.println("5. Grayscale Filter");
		System.out.println("Please select an option: ");
		
			selection = s.nextInt();
		while(selection < 0 || selection > 5){
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;
		
	}
	
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int selection) {
		
		// TODO - create some more filters, and add logic to return the appropriate one
		
				
					if(selection == 1){
						return new BlueFilter();
					} 
					else if(selection == 2){
						return new MonochromeFilter();
					} 
					else if(selection == 3){
						return new BrightnessFilter();
					} 
					else if(selection == 4){
						return new InvertFilter();
					}
					else if(selection == 5){
						return new GrayscaleFilter();
					}
					else{
						throw new IllegalArgumentException();
					}
				
				
	}


	

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				//String[] relPathParts = relPath.split(File.separator);
				//imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				imagePath = (dir + "\\" + relPath);
						
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
			// TODO - prompt user for filter and validate input
	    Javagram x = new Javagram();
	    
			
		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		Filter filter = getFilter(x.filterMenu());	
		

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		File userJPG = new File(dir + "\\" + fileName);
		
		if(userJPG.exists()){
			System.out.println("File already exists....Overwrite file? (type Y or N)");
			String response = in.next();
			if(response.equalsIgnoreCase("y")){
				String fileToSave = dir + File.separator + fileName;
				processed.save(fileToSave);
				System.out.println("Original image replaced with new image.");
				in.close();
			}
			else if(response.equalsIgnoreCase("n")){
				System.out.println("Original image will not be overwritten.");
				in.close();
			}
			else{
				System.out.println("Must type Y or N.");
				response = in.next();
				
			}
		}
		
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
}