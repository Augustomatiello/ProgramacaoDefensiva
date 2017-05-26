package exe7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFileExample {
	static final int CHARACTERS_READ_BY_INTERATION = 100;
	
	private static final String FILENAME = "E:\\test\\filename.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr, CHARACTERS_READ_BY_INTERATION);

			char [] cbuf = new char [CHARACTERS_READ_BY_INTERATION];

			while (br.read(cbuf, 0, CHARACTERS_READ_BY_INTERATION)!=-1) {
				String sCurrentLine = String.valueOf(cbuf);
				System.out.print(sCurrentLine);
								
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}