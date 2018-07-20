package com.web.hello.MavenWorld;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.ServletException;


/**
 * Hello world!
 *
 */
@WebServlet("/hello")
 class HelloWorldServlet extends HttpServlet
{
	private static final long serialVersionUID =1L;
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
	throws ServletException,IOException
	{
		resp.setContentType("text/plain");
		resp.getWriter().write("Hello World! Maven Web Project Example.");
	}
}