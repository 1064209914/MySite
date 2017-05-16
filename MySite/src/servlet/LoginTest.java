package servlet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/servlet/LoginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//用缓存读取的
		BufferedReader br=new BufferedReader(new FileReader("E:\\vbox\\Test.txt"));
		
		String s ;
		while((s=br.readLine())!=null){
			System.out.println(s);
			Pattern pattern1=Pattern.compile("(\\w+)=(\\w+)");
			Matcher m=pattern1.matcher(s);
			while(m.find()){
				if (m.group(1).equals(request.getParameter("userName"))&&m.group(2).equals(request.getParameter("passWord")) ) {
				request.getSession().setAttribute("userName", request.getParameter("userName"));
				request.getRequestDispatcher("/login/welcome.jsp").forward(request, response);
				}
			}
			
		}
		br.close();
		request.getRequestDispatcher("/login/loginfalse.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
