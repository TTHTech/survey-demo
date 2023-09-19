package com.demo.murach.email;

import com.demo.murach.business.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

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
