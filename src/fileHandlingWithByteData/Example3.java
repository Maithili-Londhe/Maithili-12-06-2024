package fileHandlingWithByteData;

import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream input = null;

		

		try
		{

			input = new FileInputStream("C:\\Namdev\\Java Development\\FileHandling\\Java20.txt");
			
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
