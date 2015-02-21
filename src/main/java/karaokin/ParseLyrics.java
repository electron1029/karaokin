package karaokin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParseLyrics 
{
	public String readFile()
	{
		String everything = "";

		try(BufferedReader br = new BufferedReader(
				new FileReader("./resources/static/lyrics/DreamALittleDreamOfMe.txt"))) 
				{
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) 
			{
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
				} catch (FileNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		return everything;
	}
}
