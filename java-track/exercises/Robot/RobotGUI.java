package Robot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;

public class RobotGUI {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RobotGUI window = new RobotGUI();
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
	public RobotGUI() {
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
		
		txtDisplay = new JTextField();
		txtDisplay.setBackground(Color.WHITE);
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(33, 21, 362, 161);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JLabel lblInput = new JLabel("Selection:");
		lblInput.setBounds(33, 209, 60, 14);
		frame.getContentPane().add(lblInput);
		
		txtInput = new JTextField();
		txtInput.setBounds(85, 206, 208, 20);
		frame.getContentPane().add(txtInput);
		txtInput.setColumns(10);
	}
}
