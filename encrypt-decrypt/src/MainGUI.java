import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class MainGUI extends JFrame{
	private JPanel panel;
	private JButton encBtn;
	private JButton decBtn;
	private JLabel label;
	
	public MainGUI() {
		
		panel = new JPanel();
		
		label = new JLabel("Do you want to encrypt or decrypt your password?");
		encBtn = new JButton("ENCRYTP");
		decBtn = new JButton("DECRYPT");
		
		panel.add(label);
		panel.add(encBtn);
		panel.add(decBtn);
		
		Color color=new Color(255,222,173);
		panel.setBackground(color);
		this.setContentPane(panel);
		
		
		ButtonListener listener = new ButtonListener();
		encBtn.addActionListener(listener);
		decBtn.addActionListener(listener);
		
		
		this.setVisible(true);
		this.setTitle("ENC/DEC WITH AES");
		this.setSize(350, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(decBtn)) {
					dispose();
					DecryptGUI myDeGui = new DecryptGUI();
				} else {
					dispose();
					EncryptGUI myEnGui = new EncryptGUI();
				}
		}	
	}


}
