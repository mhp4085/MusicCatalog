/**
 * @author Crescendo Revolution Team
 * boomPad.homePage class includes information on accessing the homepage as a user
 *
 * It contains three buttons to sign in, create an account, and continue as a guest.
 */

package boompad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;

import javax.swing.UIManager;

public class HomePage {
	// ============================================================ Properties
	private final int WIDTH = 800;
	private final int HEIGHT = 800;
	// ============================================================ Constructors

	/**
	 * The constructor for the GUI.
	 */
	public HomePage() {
		// create frame
		JFrame homePage = new JFrame("BoomPad");
		homePage.setResizable(false);
		homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homePage.setSize(800, 800);

		// create panel
		JPanel panel = new JPanel();

		// add panel to frame
		homePage.getContentPane().add(panel);
		panel.setLayout(null);

		// create label and and to panel
		JLabel boomPad = new JLabel("BoomPad");
		boomPad.setHorizontalAlignment(SwingConstants.CENTER);
		boomPad.setBounds(220, 0, 320, 90);
		boomPad.setFont(new Font("Lucida Grande", Font.PLAIN, 70));
		panel.add(boomPad);

		// Sign In Button
		JButton signIn = new JButton("Sign In");
		signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePage.dispose();
				SignIn in = new SignIn();
			}
		});
		signIn.setFont(new Font("Dialog", Font.PLAIN, 12));
		signIn.setBounds(310, 380, 140, 25);
		panel.add(signIn);

		// Create Account Button
		JButton createAccount = new JButton("Create Account");
		createAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePage.dispose();
				AccountCreation acc = new AccountCreation();
			}
		});
		createAccount.setFont(new Font("Dialog", Font.PLAIN, 12));
		createAccount.setBounds(310, 410, 140, 25);
		panel.add(createAccount);

		// Continue as Guest Button
		JButton continueAsGuest = new JButton("Continue As Guest");
		continueAsGuest.setFont(new Font("Dialog", Font.PLAIN, 12));
		continueAsGuest.setBounds(310, 440, 140, 25);
		continueAsGuest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				homePage.dispose();
				Catalog c = new Catalog();
			}
		});
		panel.add(continueAsGuest);
		
		JButton tutorialVideo = new JButton("Tutorial Video");
		tutorialVideo.setFont(new Font("Dialog", Font.PLAIN, 12));
		tutorialVideo.setBounds(310, 507, 140, 25);
		tutorialVideo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File f = new File("BoomPad Demo.mp4");
					Desktop d = Desktop.getDesktop();
					d.open(f);
				} catch (IOException f) {
					f.printStackTrace();
				}
			}
		});
		panel.add(tutorialVideo);
		
		homePage.setVisible(true);
	}

	// ============================================================ Methods
	public static void main(String[] args) { // Create an instance of the home
		HomePage hp = new HomePage(); 
	}
}


