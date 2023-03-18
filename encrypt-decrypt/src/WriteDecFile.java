import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDecFile extends WriteFile{
	
	public WriteDecFile(String pass, String secretKey, String cryptedString) {
		super(pass,secretKey,cryptedString);
		
		
		File f = new File("decryptedPass.txt");
		try {
			FileWriter writer = new FileWriter(f);			
			writer.write("Your encrypted password is: " + pass); 
			writer.write(System.lineSeparator());
			writer.write("Your secret Key is: " + secretKey);
			writer.write(System.lineSeparator());
			writer.write("Your decrypted password is: " + cryptedString);
			writer.close();
		} catch (IOException h) {
			h.printStackTrace();
		} 
	}
}