/**
 * @author Crescendo Revolution Team
 * @boompad.signIn contains information on signing in with an account
 *
 * This page allows users to enter account information and, if they have
 * an existing account, have access to the abilities of the type of user 
 * they chose when the created the account.
 */

package boompad;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignIn{
	// ============================================================ Properties
	private final int WIDTH = 800;
	private final int HEIGHT = 800;
	private JTextField userNameField;
	private JPasswordField passwordField;

	// ============================================================ Constructors
	public SignIn() {
		JFrame page = new JFrame();
		page.setResizable(false);
		page.setTitle("BoomPad");
		page.setSize(800, 800);
		JPanel panel = new JPanel();
		page.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel boomPadSignIn = new JLabel("BoomPad");
		boomPadSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		boomPadSignIn.setFont(new Font("Dialog", Font.PLAIN, 70));
		boomPadSignIn.setBounds(220, 0, 320, 90);
		panel.add(boomPadSignIn);
		
		JLabel lblNewLabel = new JLabel("Please Enter Your Account Information");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel.setBounds(134, 231, 533, 60);
		panel.add(lblNewLabel);
		
		userNameField = new JTextField();
		userNameField.setFont(UIManager.getFont("CheckBoxMenuItem.acceleratorFont"));
		userNameField.setBounds(309, 372, 155, 31);
		panel.add(userNameField);
		userNameField.setColumns(10);
		
		JLabel enterUsername = new JLabel("Enter Username:");
		enterUsername.setFont(new Font("Dialog", Font.PLAIN, 12));
		enterUsername.setBounds(193, 379, 94, 14);
		panel.add(enterUsername);
		
		JLabel enterPassword = new JLabel("Enter Password:");
		enterPassword.setFont(new Font("Dialog", Font.PLAIN, 12));
		enterPassword.setBounds(193, 435, 94, 14);
		panel.add(enterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 12));
		passwordField.setBounds(309, 428, 155, 31);
		panel.add(passwordField);
		
		JButton signIn = new JButton("Sign In");
		signIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(login.instance.verify(userNameField.getText(), passwordField.getText())) {
					page.dispose();
					Catalog c = new Catalog();
					
				} else {
					System.out.println("Enter valid info");
				}
			}
		});
		signIn.setFont(new Font("Dialog", Font.PLAIN, 12));
		signIn.setBounds(340, 484, 89, 23);
		panel.add(signIn);
		
		
		
		page.setVisible(true);
		page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	// ============================================================ Methods
	public static void main(String[] args) {
		SignIn s = new SignIn();
	}
}
