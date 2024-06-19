package fileHandlingWithByteData;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException
	{
		
		FileOutputStream out = null;

		String text1 = " Welcome to Java File Handling Concept.";
		String text2 = "Welcome to Java Programming.";
		
		byte values[] = text1.getBytes();

		try
		{

			out = new FileOutputStream("C:\\Namdev\\Java Development\\FileHandling\\Java20.txt", true);
			
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
