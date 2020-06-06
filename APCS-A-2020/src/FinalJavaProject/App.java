package FinalJavaProject;

public class App {
	public static final int MENU = 0;
	public static final int LOGIN = 1;
	public static final int CREATEACCT = 2;

	public static int currentState = MENU;

	LogInPanel log = new LogInPanel();
	NewAcctPanel createAcct = new NewAcctPanel();
	StartScreen start = new StartScreen();

	public void draw() {
		if (currentState == MENU) {
			start.startScreen();
		}
		if (currentState == CREATEACCT) {
			createAcct.newAcct();
		}
		if (currentState == LOGIN) {
			log.logIn();
		}
	}

}