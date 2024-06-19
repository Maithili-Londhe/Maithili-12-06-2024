package fileHandlingWithCharacterData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) throws IOException
	{
		
		FileReader input = null;//read
		BufferedReader bin = null;
		
		FileWriter out = null;//write + creates new file(if not exists)
		BufferedWriter bout = null;

		try
		{

			input = new FileReader("C:\\Namdev\\Java Development\\FileHandling\\Java124.txt");
			bin = new BufferedReader(input);
			
			out = new FileWriter("C:\\Namdev\\Java Development\\FileHandling\\Java125.txt");
			bout = new BufferedWriter(out);
			
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
