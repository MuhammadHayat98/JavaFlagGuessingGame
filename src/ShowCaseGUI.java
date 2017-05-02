import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;

public class ShowCaseGUI {

	private JFrame frame;
	private JTextField txtPleaseSelectThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowCaseGUI window = new ShowCaseGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowCaseGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Easy");
		btnNewButton.setBounds(10, 155, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Medium");
		btnNewButton_1.setBounds(162, 155, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Hard");
		btnNewButton_2.setBounds(315, 155, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		txtPleaseSelectThe = new JTextField();
		txtPleaseSelectThe.setText("Please select the difficulty.");
		txtPleaseSelectThe.setBounds(134, 11, 151, 20);
		frame.getContentPane().add(txtPleaseSelectThe);
		txtPleaseSelectThe.setColumns(10);
	}
}
