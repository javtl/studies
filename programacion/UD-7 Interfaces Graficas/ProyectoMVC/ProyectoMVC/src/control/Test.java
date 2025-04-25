package control;

import model.UserModel;
import view.UserView;

public class Test {

	public static void main(String[] args) {
		UserModel model=new UserModel();
		UserView view=new UserView();
		UserController controller=new UserController(model,view);
		
		

	}

}
