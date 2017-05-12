import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Difficulty extends ShowCaseGUI{
	public static void Hard(java.awt.Container picPanel, javax.swing.JFrame picFrame, String[][] array, javax.swing.JTextField textField){
		JTextField textField1;
		/*Generating random image code goes here
		 * 
		 */
		
		ImageIcon image = new ImageIcon(array[0][1]);
		picPanel.setBounds(35, 11, 360, 150);
		picFrame.getContentPane().add(picPanel);
		JLabel lblNewLabel_1 = new JLabel(image);
		picPanel.add(lblNewLabel_1);
		picPanel.setVisible(true);
		textField1 = new JTextField();
		textField1.setBounds(135, 198, 156, 20);
		picFrame.getContentPane().add(textField1);
		textField1.setColumns(10);
		Button btnEnter = new Button("Enter");
		btnEnter.setBounds(294, 197, 70, 23);
		picFrame.getContentPane().add(btnEnter);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(100, 198, 25, 20);
		picFrame.getContentPane().add(lblNewLabel);
		btnEnter.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
				int flag;
				int count=0;
				String guess = textField1.getText();
				if(guess.equalsIgnoreCase(array[0][0])) {
					System.out.print("noicew");
				lblNewLabel.setIcon(new ImageIcon("Icons/rsz_checkmark-xxl.png"));
				}
				else
				{
					lblNewLabel.setIcon(new ImageIcon("Icons/rsz_milker-x-icon.png"));
				}
				
				
			}
		});
	}
	
	
	
	public static void Medium(java.awt.Container picPanel, javax.swing.JFrame picFrame, String[][] array, javax.swing.JTextField textField){
		JTextField textField1;
		/*Generating random image code goes here
		 * 
		 */
		FlagGenerator flagGen = new FlagGenerator(2);
		int flag = flagGen.getFlag();
		ImageIcon image = new ImageIcon(array[flag][1]);
		picPanel.setBounds(35, 11, 360, 150);
		picFrame.getContentPane().add(picPanel);
		JLabel lblNewLabel_1 = new JLabel(image);
		picPanel.add(lblNewLabel_1);
		picPanel.setVisible(true);
		textField1 = new JTextField();
		textField1.setBounds(135, 198, 156, 20);
		picFrame.getContentPane().add(textField1);
		textField1.setColumns(10);
		Button btnEnter = new Button("Enter");
		btnEnter.setBounds(294, 197, 70, 23);
		picFrame.getContentPane().add(btnEnter);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(100, 198, 25, 20);
		picFrame.getContentPane().add(lblNewLabel);
		
		btnEnter.addActionListener(new ActionListener() {
		int count = 10;	
			public void actionPerformed(ActionEvent arg0) {
				
				Label label = new Label(count + " tries remain");
				
				
				String guess = textField1.getText();
				if(guess.equalsIgnoreCase(array[flag][0])) {
					int tries = count+1;
					//Label label = new Label("It only took you " + tries + " tries, now here's another");
					//label.setBounds(135, 224, 250, 22);
					//picFrame.getContentPane().add(label);
				lblNewLabel.setIcon(new ImageIcon("Icons/rsz_checkmark-xxl.png"));
				}
				else
				{
					count--;
					picFrame.getContentPane().remove(label);
					 label = new Label(count + " tries remain");
					lblNewLabel.setIcon(new ImageIcon("Icons/rsz_milker-x-icon.png"));
				}
				System.out.println(count);
				
				label.setBounds(135, 224, 156, 22);
				picFrame.getContentPane().add(label);
			}
		});
		
	}
	
	public static void Easy(java.awt.Container picPanel, javax.swing.JFrame picFrame, String[][] array, javax.swing.JTextField textField){
		JTextField textField1;
		/*Generating random image code goes here
		 * 
		 */
		FlagGenerator flagGen = new FlagGenerator(1);
		int flag = flagGen.getFlag();
		System.out.println(" " + flag);
		ImageIcon image = new ImageIcon(array[flag][1]);
		picPanel.setBounds(35, 11, 360, 150);
		picFrame.getContentPane().add(picPanel);
		JLabel lblNewLabel_1 = new JLabel(image);
		picPanel.add(lblNewLabel_1);
		picPanel.setVisible(true);
		textField1 = new JTextField();
		textField1.setBounds(135, 198, 156, 20);
		picFrame.getContentPane().add(textField1);
		textField1.setColumns(10);
		Button btnEnter = new Button("Enter");
		btnEnter.setBounds(294, 197, 70, 23);
		picFrame.getContentPane().add(btnEnter);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(100, 198, 25, 20);
		picFrame.getContentPane().add(lblNewLabel);
		
		btnEnter.addActionListener(new ActionListener() {
		int count = 0;
			public void actionPerformed(ActionEvent arg0) {
				 
			
				String guess = textField1.getText();
				if(guess.equalsIgnoreCase(array[flag][0])) {
					int tries = count+1;
					Label label = new Label("It only took you " + tries + " tries, now here's another");
					label.setBounds(135, 224, 250, 22);
					picFrame.getContentPane().add(label);
					
				lblNewLabel.setIcon(new ImageIcon("Icons/rsz_checkmark-xxl.png"));
				}
				else
				{
						
					lblNewLabel.setIcon(new ImageIcon("Icons/rsz_milker-x-icon.png"));
					count++;
				}
				
				
			}
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}