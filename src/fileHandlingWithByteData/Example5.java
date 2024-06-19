package fileHandlingWithByteData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream input = null;//read
		BufferedInputStream bin = null;
		
		FileOutputStream out = null;//write + creates new file(if not exists)
		BufferedOutputStream bout = null;

		try
		{

			input = new FileInputStream("C:\\Namdev\\Java Development\\FileHandling\\Java21.txt");
			bin = new BufferedInputStream(input);
			
			out = new FileOutputStream("C:\\Namdev\\Java Development\\FileHandling\\Java22.txt");
			bout = new BufferedOutputStream(out);
			
			int index = 0;
			
			while((index = bin.read()) != -1)
			{
				bout.write(index);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{			
			bin.close();
			input.close();
			
			
			bout.close();
			out.close();
		}
		
	}

}
