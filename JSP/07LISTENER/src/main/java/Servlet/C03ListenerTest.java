package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/session/remove","/session/attr/add","/session/attr/replace","/session/attr/remove"})
public class C03ListenerTest {

	//@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[SERVLET] C03ListenerTest service");
		String uri = req.getRequestURI();
		HttpSession session = req.getSession();
		if(uri.contains("/session/remove")) {
			session.invalidate();
		} else if(uri.contains("/session/attr/add")) {
			session.setAttribute("S_KEY", "S_VAL");
		}else if(uri.contains("/session/attr/remove")) {
			session.setAttribute("S_KEY", "S_VAL2");;
		}else if(uri.contains("/session/attr/remove")) {
			session.removeAttribute("S_KEY");;
		}
	}
}
