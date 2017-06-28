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
		
		// ���N�G�X�g�p�����[�^����name�̒l���擾
		String name = request.getParameter("name");
		
		// �r�W�l�X���W�b�N������
		int score = model.getScore(name);
		
		// Bean�𗘗p
		HelloBean bean = new HelloBean();
		bean.setName(name);
		bean.setScore(score);
	
		//���N�G�X�g��helloBean�Ƃ������O��Bean��ݒ�
		request.setAttribute("helloBean", bean);
		
		//hello.jsp��forward
		request.getRequestDispatcher("/hello.jsp").forward(request, response);
	}

}
