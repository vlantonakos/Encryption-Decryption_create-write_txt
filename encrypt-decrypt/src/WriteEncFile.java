import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEncFile extends WriteFile{

	public WriteEncFile(String pass, String secretKey, String cryptedString) {
		super(pass,secretKey,cryptedString);
		
		File f = new File("encryptedPass.txt");
		try {
			FileWriter writer = new FileWriter(f);			
			writer.write("Your password is: " + pass); 
			writer.write(System.lineSeparator());
			writer.write("Your secret Key is: " + secretKey);
			writer.write(System.lineSeparator());
			writer.write("Your encrypted password is: " + cryptedString);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
