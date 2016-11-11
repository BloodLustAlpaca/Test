package buyShortAmount;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame{
		
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		private JPanel panel = new JPanel();
		private JLabel riskLabel= new JLabel("risk: ");
		private JLabel capitalLabel = new JLabel("capital: ");
		private JLabel stockLabel = new JLabel("stock: ");
		private JLabel stopLabel = new JLabel("stop: ");
		private JLabel positionSize = new JLabel("size: ");
		public static JTextField riskBox = new JTextField(10);
		public static JTextField capitalBox = new JTextField(10);
		public static JTextField stockBox = new JTextField(10);
		public static JTextField stopBox = new JTextField(10);
		
		public static JLabel messege = new JLabel() ;
		private JButton calculate= new JButton("calculate");
		
		
		
		//Constructor
		public Frame(){
			
			//set title
			calculate.addActionListener(new ActionListener()
			{
			  public void actionPerformed(ActionEvent e)
			  {
				  PositionSize position = new PositionSize();
				  position.getPositionSize();
			  }
			});

			setTitle("Position Sizer");
			
			//Set size
			setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
			
			//set what happens on close
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.anchor = GridBagConstraints.EAST;
			gbc.ipady = 5;
			gbc.weighty = 5;
			//add components
			gbc.gridx = 0;
			gbc.gridy = 0;
			panel.add(riskLabel, gbc);
			gbc.gridx = 1;
			gbc.gridy = 0;
			panel.add(riskBox, gbc);
			gbc.gridx = 0;
			gbc.gridy = 1;
			panel.add(capitalLabel, gbc);
			gbc.gridx = 1;
			gbc.gridy = 1;
			panel.add(capitalBox, gbc);
			gbc.gridx = 0;
			gbc.gridy = 2;
			panel.add(stockLabel, gbc);
			gbc.gridx = 1;
			gbc.gridy = 2;
			panel.add(stockBox, gbc);
			gbc.gridx = 0;
			gbc.gridy = 3;
			panel.add(stopLabel, gbc);
			gbc.gridx = 1;
			gbc.gridy = 3;
			panel.add(stopBox, gbc);
			gbc.gridx = 1;
			gbc.gridy = 4;
			
			
			gbc.anchor = GridBagConstraints.CENTER;
			panel.add(calculate, gbc);
			gbc.gridx = 1;
			gbc.gridy = 5;
			
			panel.add(messege, gbc);
			
			//add panel
			add(panel);
			
			//Display window
			
			setLocationRelativeTo(null);
			setVisible(true);
			
			
		}
		public static void main(String[] args){
			Frame frame = new Frame();
			
		}
	
}
