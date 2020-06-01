package FinalJavaProject;

public class App {
	public static final int MENU = 0;
	public static final int LOGIN = 1;
	public static final int CREATEACCT = 2;
	
	public static int currentState = CREATEACCT;
	
	LogIn_Screen log = new LogIn_Screen();
	CreateAccount_Screen createAcct = new CreateAccount_Screen();
	
	public void draw() {
		if(currentState == LOGIN) {
			log.logIn();
		}
		if(currentState == CREATEACCT) {
			createAcct.createAcct();
		}
	}
}
