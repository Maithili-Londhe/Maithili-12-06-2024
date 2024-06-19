package fileHandlingWithByteData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream input = null;//read
		FileOutputStream out = null;//write + creates new file(if not exists)
		

		try
		{

			input = new FileInputStream("C:\\Namdev\\Java Development\\FileHandling\\Java20.txt");
			out = new FileOutputStream("C:\\Namdev\\Java Development\\FileHandling\\Java21.txt");
			
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
