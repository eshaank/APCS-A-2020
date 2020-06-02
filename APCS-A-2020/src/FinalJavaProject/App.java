package FinalJavaProject;

public class App {
	public static final int MENU = 0;
	public static final int LOGIN = 1;
	public static final int CREATEACCT = 2;

	public static int currentState = CREATEACCT;

	LogInPanel log = new LogInPanel();
	NewAcctPanel createAcct = new NewAcctPanel();

	public void draw() {
		if (currentState == CREATEACCT) {
			createAcct.newAcct();
		} else if (currentState == LOGIN) {
			log.logIn();
		}
	}

	
}