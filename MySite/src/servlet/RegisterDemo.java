package servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterDemo
 */
@WebServlet("/servlet/RegisterDemo")
public class RegisterDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDemo() {
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
/*		if ((!"".equals(request.getParameter("userName")))&&(!"".equals(request.getParameter("passWord")))&&(!"".equals(request.getParameter("userName")))) {
			
		}*/
		//创建一个hashmap 来存放用户名和密码 方便取出
		HashMap<String ,String > map=new HashMap<String ,String >();
		map.put(request.getParameter("userName"),request.getParameter("passWord"));
		
		//一开始用增强输出流来打印(他只会保存最新的 覆盖以前的 )
		//所以用 filewriter 中的一个方法 filewriter(String s.boolean flag)
		BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\vbox\\Test.txt",true));
		for (Entry<String, String> en :map.entrySet()) {
			
			bw.write(en.getKey());
			bw.write("=");
			bw.write(en.getValue());
			bw.newLine();		//实现换行
			bw.flush();
		}
		bw.close();
		request.getRequestDispatcher("../login/registersuccee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
