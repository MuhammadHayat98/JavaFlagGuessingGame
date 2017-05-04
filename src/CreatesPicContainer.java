

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CreatesPicContainer extends ShowCaseGUI {
	public void Pics(java.awt.Container picPanel, javax.swing.JFrame picFrame, String[][] array) {
		ImageIcon image = new ImageIcon(array[0][1]);
		picPanel.setBounds(35, 11, 360, 150);
		frame.getContentPane().add(picPanel);
		JLabel lblNewLabel_1 = new JLabel(image);
		picPanel.add(lblNewLabel_1);
		picPanel.setVisible(true);
		picPanel.revalidate();
		picPanel.update(null);

		
		
		
	}
	
	

}
