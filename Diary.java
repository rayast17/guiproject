package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary extends JFrame {
	private static final AbstractButton HappyButton = null;
	private static final AbstractButton OkButton = null;
	private static final AbstractButton SadButton = null;

	public Diary() {

		super("Diary");
		setSize(800, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// main containers and Layouts
		JPanel mainPanel = new JPanel();
		setLocationRelativeTo(null);
		add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

		JPanel leftPanel = new JPanel();
		mainPanel.add(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

		JPanel rightPanel = new JPanel();
		mainPanel.add(rightPanel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.setBackground(Color.LIGHT_GRAY);

		// left side
		JLabel gratituteJournalLabel = new JLabel("Everyday journal");
		leftPanel.add(gratituteJournalLabel);

		JTextArea journalArea = new JTextArea();
		journalArea.setBounds(10, 2, 16, 3);
		journalArea.setEditable(false);
		journalArea.setText("Today I am feeling:");
		leftPanel.add(journalArea);

		JCheckBox checkBox1 = new JCheckBox("Happy");
		JCheckBox checkBox2 = new JCheckBox("Ok");
		JCheckBox checkBox3 = new JCheckBox("Sad");
		leftPanel.add(checkBox1);
		leftPanel.add(checkBox2);
		leftPanel.add(checkBox3);

		JButton CloseButton = new JButton("Close");
		CloseButton.setBounds(10, 80, 80, 25);
		CloseButton.setBackground(Color.LIGHT_GRAY);
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		leftPanel.add(CloseButton);

		// right side
		SimpleDateFormat ft = new SimpleDateFormat("dd. M yyyy");
		JLabel currentDateLabel = new JLabel(ft.format(new Date()));
		rightPanel.add(currentDateLabel);

		JLabel section1 = new JLabel("How was my day?");
		rightPanel.add(section1);
		JTextField gratitudeText_1 = new JTextField();
		rightPanel.add(gratitudeText_1);
		JLabel section2 = new JLabel("Thing I have to get done");
		rightPanel.add(section2);
		JTextField gratitudeText_2 = new JTextField();
		rightPanel.add(gratitudeText_2);
		JLabel section3 = new JLabel("What's on my mind");
		rightPanel.add(section3);
		JTextField gratitudeText_3 = new JTextField();
		rightPanel.add(gratitudeText_3);

		pack();
		// Setting the frame visibility to true
		setVisible(true);

	}
}
