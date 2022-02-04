package presentation;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainInterface {

	public MainInterface() {
		JFrame frame = new JFrame("DnDatabase");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);

		JPanel loginPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 0;
		loginPanel.add(new JLabel("Login Username: "), c);
		c.gridx = 1;
		JTextField username = new JTextField(10);
		loginPanel.add(username, c);
		c.gridx = 0;
		c.gridy = 1;
		loginPanel.add(new JLabel("Login Password: "), c);
		c.gridx = 1;
//		JTextField password = new JTextField(10);
		JPasswordField password = new JPasswordField(10);
		loginPanel.add(password, c);
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(10, 20, 10, 20);
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		loginPanel.add(loginButton, c);

		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 2;
		c.gridy = 0;
		loginPanel.add(new JLabel("Register Username: "), c);
		c.gridx = 3;
		JTextField Rusername = new JTextField(10);
		loginPanel.add(Rusername, c);
		c.gridx = 2;
		c.gridy = 1;
		loginPanel.add(new JLabel("Register Password: "), c);
		c.gridx = 3;
		
		JPasswordField Rpassword = new JPasswordField(10);
		loginPanel.add(Rpassword, c);
		c.gridx = 2;
		c.gridy = 2;
		loginPanel.add(new JLabel("Register Name: "), c);
		c.gridx = 3;
		JTextField Rname = new JTextField(10);
		loginPanel.add(Rname, c);
		c.gridx = 3;
		c.gridy = 3;
		c.insets = new Insets(10, 35, 10, 20);
		JButton registerButton = new JButton("Register");

		frame.add(loginPanel);
		frame.setVisible(true);
	}
}
