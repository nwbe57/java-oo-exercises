package studio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class QuestionWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionWindow window = new QuestionWindow();
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
	public QuestionWindow() {
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
		
		JList list = new JList();
		list.setBounds(160, 25, 246, 118);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(list);
		
		JButton btnNext = new JButton("Next Question");
		btnNext.setBounds(33, 48, 117, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(33, 94, 117, 23);
		frame.getContentPane().add(btnSubmit);
		
		JTextField txtAnswer = new JTextField();
		txtAnswer.setBounds(160, 175, 177, 20);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setBounds(100, 178, 46, 14);
		frame.getContentPane().add(lblAnswer);
	}
}
