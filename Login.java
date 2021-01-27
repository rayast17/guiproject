package project;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLocationRelativeTo(null);
		frame.add(panel);

		panel.setLayout(null);

		JLabel label = new JLabel("User");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		JLabel password = new JLabel("Password");
		password.setBounds(10, 50, 80, 25);
		panel.add(password);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		loginButton.setBackground(Color.LIGHT_GRAY);
		panel.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = passwordText.getText();
				String username = userText.getText();

				if (password.contains("12345") && username.contains("raya")) {
					passwordText.setText(null);
					userText.setText(null);
					frame.setVisible(false);
					Diary diary = new Diary();

				} else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					passwordText.setText(null);
					userText.setText(null);
				}
			}

		});

		frame.setVisible(true);
	}
}
