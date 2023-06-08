package dunno.main.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mvel2.sh.Command;
import org.mvel2.sh.ShellSession;


public class MainCommand implements Command {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "main/main";
	}


}
