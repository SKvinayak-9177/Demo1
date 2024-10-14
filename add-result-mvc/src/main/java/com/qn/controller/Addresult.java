package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.Students;


public class Addresult extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int marks1=Integer.parseInt(request.getParameter("marks1"));
		int marks2=Integer.parseInt(request.getParameter("marks2"));
		int marks3=Integer.parseInt(request.getParameter("marks3"));
		Students tempstudent=new Students();
		tempstudent.setId(id);
		tempstudent.setName(name);
		tempstudent.setMarks1(marks1);
		tempstudent.setMarks2(marks2);
		tempstudent.setMarks3(marks3);
		int rows=tempstudent.addResult();
		if(rows==1) {
			response.sendRedirect("/add-result-mvc/addresultsucessful.html");
		}
		else {
			response.sendRedirect("/add-result-mvc/addresultfailure.html");
		}
		

}
}
