package fileHandlingWithCharacterData;

import java.io.FileReader;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) throws IOException
	{
		
		FileReader input = null;	

		try
		{

			input = new FileReader("C:\\Namdev\\Java Development\\FileHandling\\Java120.txt");
			
			int index = 0;
			
			while((index = input.read()) != -1)
			{
				System.out.print((char)index);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			input.close();
		}
		
	}

}
