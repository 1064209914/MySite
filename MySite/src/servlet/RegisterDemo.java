package servlet;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.Servlet;
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
		if ((!"".equals(request.getParameter("userName")))&&(!"".equals(request.getParameter("passWord")))&&(!"".equals(request.getParameter("passWord2")))) {
			if (request.getParameter("passWord").equals(request.getParameter("passWord2"))) {
				
				//从hashmap得到启发     来其形式存放用户名和密码 方便取出		由于密码可见  换序列化去写
				//一开始用增强输出流来打印(他只会保存最新的 覆盖以前的 )
				//所以用 filewriter 中的一个方法 filewriter(String s.boolean flag)  outputStream 也有
				BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\vbox\\registerDemo.txt",true));
				bw.write(request.getParameter("userName"));
					bw.write("=");
					bw.write(request.getParameter("passWord"));
					bw.newLine();		//实现换行
					bw.flush();
				bw.close();
				
				//序列化代码  可以写  读 不会
/*				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\vbox\\Test.txt",true));
				User user =new User(request.getParameter("userName"), request.getParameter("passWord"));
				ArrayList<User> list = new ArrayList<User>();
				list.add(user);
				oos.writeObject(list);
				oos.close();*/
				request.getRequestDispatcher("../login/registersuccee.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("../login/registerfalse.jsp").forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
