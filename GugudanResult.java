
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GugudanResult
 */
@WebServlet("/GugudanResult")
public class GugudanResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GugudanResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");

		PrintWriter writer = response.getWriter();
		
		String dan = request.getParameter("dan");
		int input=Integer.parseInt(dan);

		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("<table border=1 width=150>");
		writer.println("<tr>");
		writer.println("<td align=center>");
		writer.println(input+"단");
		writer.println("</td>");
		writer.println("</tr>");
		
		for(int i =1; i<10;i++) {
			writer.println("<tr>");
			writer.println("<td align=center>");
			writer.println(input+" * "+i+" = "+(input*i));
			writer.println("</td>");
			writer.println("</tr>");
		}
		
		writer.println("</table>");
		// 돌아가기 버튼 가운데 정렬 못함.
		writer.println("<form action=\"html_12_30/Gugudan.html\">");
		writer.println("<input type=\"submit\" value=\"돌아가기\" size=\"8\" color=\"gray\">");
		writer.println("</form>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
