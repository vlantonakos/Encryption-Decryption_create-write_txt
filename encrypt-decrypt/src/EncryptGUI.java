import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;

public class EncryptGUI extends JFrame{
	private JPanel panel;
	private JLabel labelkey;
	private JTextField textkey;
	private JLabel label;
	private JTextField text;
	private JButton btn;
	private JTextField encpass;
	
	
	public EncryptGUI() {
		
		panel = new JPanel();
		
		labelkey = new JLabel("Your secret key: ");
		textkey = new JTextField("insert secret key");
		label = new JLabel("Your password: ");
		text = new JTextField("insert password");
		btn = new JButton("ENCRYPT");
		encpass = new JTextField(20); 
		
		panel.add(labelkey);
		panel.add(textkey);
		panel.add(label);
		panel.add(text);
		panel.add(btn);
		panel.add(encpass);
		
		Color color=new Color(255,228,181);
		panel.setBackground(color);
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		btn.addActionListener(listener);
		
		this.setVisible(true);
		this.setTitle("ENCRYPTION");
		this.setSize(250, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			final String secretKey = textkey.getText();
				if(e.getSource().equals(btn)) {
					String pass = text.getText();
					String encryptedString = AES.encrypt(pass, secretKey);
					encpass.setText(encryptedString);
					
					WriteEncFile f = new WriteEncFile(pass,secretKey,encryptedString);
				} 
		}	
	}
}
