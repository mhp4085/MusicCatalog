/**
 * @author Crescendo Revolution Team
 * 
 * boompad.accountCreation class includes the information about the GUI for creating an account
 */

package boompad;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AccountCreation {
	// ============================================================ Properties
	private final int WIDTH = 800;
	private final int HEIGHT = 800;
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;

	// ============================================================ Constructors
	public AccountCreation() {
		JFrame acc = new JFrame();
		acc.setResizable(false);
		acc.setTitle("BoomPad");
		acc.setSize(800, 800);
		acc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		acc.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 794, 771);
		acc.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel accountCreation = new JLabel("BoomPad");
		accountCreation.setHorizontalAlignment(SwingConstants.CENTER);
		accountCreation.setFont(new Font("Dialog", Font.PLAIN, 70));
		accountCreation.setBounds(220, 0, 320, 90);
		panel.add(accountCreation);
		
		JLabel createAccount = new JLabel("Create An Account");
		createAccount.setFont(new Font("Dialog", Font.PLAIN, 30));
		createAccount.setBounds(245, 140, 256, 60);
		panel.add(createAccount);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(277, 211, 190, 27);
		panel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(277, 263, 190, 27);
		panel.add(passwordTextField);
		
		JLabel createUsername = new JLabel("Enter Username:");
		createUsername.setFont(new Font("Dialog", Font.PLAIN, 12));
		createUsername.setBounds(163, 216, 101, 14);
		panel.add(createUsername);
		
		JLabel createPassword = new JLabel("Enter Password:");
		createPassword.setFont(new Font("Dialog", Font.PLAIN, 12));
		createPassword.setBounds(163, 268, 101, 14);
		panel.add(createPassword);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.instance.registration(usernameTextField.getText(), passwordTextField.getText())) {
					acc.dispose();
					HomePage hp = new HomePage();
				} else {
					System.out.println("Already Have An Account");
				}
			}
		});
		submit.setFont(new Font("Dialog", Font.PLAIN, 12));
		submit.setBounds(320, 345, 90, 25);
		panel.add(submit);
		
		acc.setVisible(true);
	}
	// ============================================================ Methods
	public static void main(String[] args) {
		AccountCreation acc = new AccountCreation();
	}
}
