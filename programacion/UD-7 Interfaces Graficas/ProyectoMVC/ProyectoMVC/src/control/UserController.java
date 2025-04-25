package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.UserModel;
import view.UserView;

public class UserController {
	private UserModel model;
	private UserView view;
	
	public UserController(UserModel userModel, UserView userView) {
		super();
		this.model = userModel;
		this.view = userView;
		
		view.addLoginListener(new LoginListener());
		
		
	}
	
	private class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String username=view.getUsername();
			String password=view.getPassword();
			
			//Verificar credenciales (simulamos)
			if(username.equals("usuario") && password.equals("password"))
				view.displayMessage("Inicio de sesión exitoso");
			else
				view.displayMessage("Inicio de sesión fallido");
			
		}
		
	}
	
	
}
