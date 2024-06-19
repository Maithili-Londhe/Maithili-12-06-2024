package fileHandlingWithCharacterData;

import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException
	{
		
		FileWriter out = null;

		String text1 = "Welcome to Java File Handling Concept.";
		
		char values[] = text1.toCharArray();
	
		try
		{

			out = new FileWriter("C:\\Namdev\\Java Development\\FileHandling\\Java120.txt");
			
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
