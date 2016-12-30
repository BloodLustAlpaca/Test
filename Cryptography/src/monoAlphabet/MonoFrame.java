package monoAlphabet;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MonoFrame  extends JFrame{
	JFrame frame = new JFrame();
	JPanel northPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel westPanel = new JPanel();
	JButton encryptButton = new JButton("Encrypt");
	JButton decryptButton = new JButton("Decrypt");
	JTextField plainBox = new JTextField(20);
	JTextField encryptBox = new JTextField(20);
	JTextField keyBox = new JTextField(20);
	JLabel keyLabel = new JLabel("KeyWord");
	JLabel label2 = new JLabel();
	
	public MonoFrame() {
	
		frame.setLayout(new BorderLayout());
		
		westPanel.setLayout(new BorderLayout());
		westPanel.add(encryptButton, BorderLayout.NORTH);
		westPanel.add(decryptButton, BorderLayout.SOUTH);
		westPanel.add(keyLabel, BorderLayout.CENTER);
		
		eastPanel.setLayout(new BorderLayout());
		eastPanel.add(plainBox, BorderLayout.NORTH);
		eastPanel.add(encryptBox, BorderLayout.SOUTH);
		eastPanel.add(keyBox, BorderLayout.CENTER);
		
		frame.add(westPanel, BorderLayout.WEST);
		frame.add(eastPanel, BorderLayout.EAST);
		frame.setSize(600, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
