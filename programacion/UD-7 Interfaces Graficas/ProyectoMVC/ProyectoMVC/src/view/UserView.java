package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserView extends JFrame {
	private JLabel lblUsername, lblPassword;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	
	public UserView()
	{
		super("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setLayout(null);
		setLocationRelativeTo(null);
		
		lblUsername=new JLabel("Username");
		lblUsername.setBounds(10,20,80,25);
		add(lblUsername);
		txtUsername=new JTextField(15);
		txtUsername.setBounds(100,20,165,25);
		add(txtUsername);
		lblPassword=new JLabel("Password");
		lblPassword.setBounds(10,50,80,25);
		add(lblPassword);
		txtPassword=new JPasswordField(15);
		txtPassword.setBounds(100,50,165,25);
		add(txtPassword);
		
		btnLogin=new JButton("Login");
		btnLogin.setBounds(10,80,140,25);
		add(btnLogin);
		
		setVisible(true);
	}
	
	public String getUsername()
	{
		return txtUsername.getText();
	}
	
	public String getPassword()
	{
		return new String(txtPassword.getPassword());
	}
	
	public void displayMessage(String errorMessage)
	{
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	public void addLoginListener(ActionListener listener)
	{
		btnLogin.addActionListener(listener);
	}
	
	

}
