package com.demo.murach.email;

import com.demo.murach.business.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import murach.business.User;
////import murach.data.UserDB;


@WebServlet("/EmailListServlet")
public class EmailListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
     throws ServletException,
            IOException {
		doPost(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/index.html";
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//get current action
		String action = request.getParameter("action");
		if (action == null) {
			action = "join"; //default action
		}
		
		
		//perform action and set URL to appropriate page
		if (action.equals("join")) {
			url = "/index.html"; //the "join" page
		}
		else if (action.equals("add")) {
			//get parameters from the request
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String Contact = request.getParameter("contact");
			String booParameter = request.getParameter("boo");
			boolean boo = "yes".equalsIgnoreCase(booParameter);
			String profession = request.getParameter("profession");
			//store data in User object and save User object in d
			User user = new User(firstName, lastName, email, Contact, boo,  profession );
			//UserDB.insert(user);
			
			//set User object in request object and set URL
			request.setAttribute("user", user);
			url = "/thanks.jsp"; //the "thanks" page
		}
		
		//forward request and response objects to specified URL
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request, response);

	}

}
