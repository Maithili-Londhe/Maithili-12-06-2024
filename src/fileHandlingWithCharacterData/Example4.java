package fileHandlingWithCharacterData;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException
	{
		
		FileReader input = null;//read
		FileWriter out = null;//write + creates new file(if not exists)
		

		try
		{

			input = new FileReader("C:\\Namdev\\Java Development\\FileHandling\\Java120.txt");
			out = new FileWriter("C:\\Namdev\\Java Development\\FileHandling\\Java124.txt");
			
			int index = 0;
			
			while((index = input.read()) != -1)
			{
				out.write(index);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			input.close();
			out.close();
		}
		
	}

}
