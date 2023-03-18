import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class WriteFile {
	private String pass;
	private String secretKey;
	private String cryptedString;
	
	public WriteFile(String pass, String secretKey, String cryptedString) {
		this.pass = pass;
		this.secretKey = secretKey;
		this.cryptedString = cryptedString;
		
	}
}
