package build.classess.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/index.do", "/main.do" })
public class Home extends HttpServlet {

	// GET - /index.do - /WEB-INF/index.jsp 연결
	// GET - /main.do - /WEB-INF/main.jsp 연결
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uri = req.getRequestURI();
		if (uri.contains("/index.do")) {
			System.out.println("GET /index.do");
			req.getRequestDispatcher("/WEB-INF/index.do").forward(req, resp);
			return;
		} else {
			System.out.println("GET /main.do");
			req.getRequestDispatcher("/WEB-INF/main.do").forward(req, resp);
			return;
		}
	}

}
