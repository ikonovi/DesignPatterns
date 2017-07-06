package _9_Strategy.start;

import _9_Strategy.auth.UserChecker;
import java.io.File;
import _9_Strategy.strategy.*;

public class Main {

	public static void main(String[] args) {
		
		UserChecker userChecker = new UserChecker();

		userChecker.check(new DBAuth("jdbc://etc"));
		userChecker.check(new FileAuth(new File("c:\\file.txt")));

	}
}
