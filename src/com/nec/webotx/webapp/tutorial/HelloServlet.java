package com.nec.webotx.webapp.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 *
 * @web.servlet
 *   name="HelloServlet"
 *   display-name="HelloServlet"
 *
 * @web.servlet-mapping
 *   url-pattern="/HelloServlet"
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("windows-31j");
	    response.setContentType("text/html;charset=windows-31j");
		
		HelloModel model = new HelloModel();
		
		// リクエストパラメータからnameの値を取得
		String name = request.getParameter("name");
		
		// ビジネスロジックを実装
		int score = model.getScore(name);
		
		// Beanを利用
		HelloBean bean = new HelloBean();
		bean.setName(name);
		bean.setScore(score);
	
		//リクエストにhelloBeanという名前でBeanを設定
		request.setAttribute("helloBean", bean);
		
		//hello.jspへforward
		request.getRequestDispatcher("/hello.jsp").forward(request, response);
	}

}
