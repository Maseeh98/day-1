import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;


public class ReadFileData {
	
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("./Input");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			int character = reader.read();
			while(character != -1) {
				System.out.println(line);
				line = bufferedReader.readLine();
				
				//character = reader.read();}
			//read.read();
			}
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}