package Java_Assignment81;
/*
 * This class will help to master the  concepts of file handling
 * Problem Statement : Write a program for file copy.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Java_Assignment8_1 {

	public static void main(String[] args) 
	{
		// Initializing the source file object
		 File source = new File("//C:/Users/dipti/temp/source.txt");
		 
		// Initializing the destination file object
	     File dest = new File("//C:/Users/dipti/temp/dest.txt");

	     //copy file conventional way using Stream
	     
	     try // try block of Exception handling 
	      {
			copyFileUsingStream(source, dest);
		  } 
	     catch (IOException e) // catch block of Exception handling
		  {			
			e.printStackTrace(); // Throwable function
		  }
	     
	     System.out.println("\nFile copied \nFrom \n" + source.getPath()+ " \nTo \n" + dest.getPath()+"\n");
	     
	}
	//Method for coping the file in conventional way
	private static void copyFileUsingStream(File source, File dest) throws IOException 
	{
	    InputStream is = null;
	    OutputStream os = null;
	    try // try block of Exception handling 
	    {
	        is = new FileInputStream(source); //Initializing the InputStream object 
	        os = new FileOutputStream(dest); //Initializing the OutputStream object
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) // looping till information available to read in source file
	        {
	            os.write(buffer, 0, length); // Writing the buffer contains in file
	        }
	    } 
	    finally // finally block of Exception handling 
	    {
	        is.close();
	        os.close();
	    }
	}

}
