package fileHandlingWithByteData;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException
	{
		
		FileOutputStream out = null;

		String text = "Welcome to Java File Handling Concept.";
		
		byte values[] = text.getBytes();

		try
		{

			out = new FileOutputStream("C:\\Namdev\\Java Development\\FileHandling\\Java20.txt");
			
			if(out != null) 
			{
				out.write(values);				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			out.close();
		}
		
	}

}
