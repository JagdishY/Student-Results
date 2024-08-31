package mvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultServlet
 */
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ResultServlet() {
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s = request.getParameter("htno");
		int hno = Integer.parseInt(s);
		ResultsDAO rdao = new ResultsDAO();
		ResultBean rb = rdao.getResults(hno);
		request.setAttribute("results", rb);
		RequestDispatcher  rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
