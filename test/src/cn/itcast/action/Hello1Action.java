package cn.itcast.action;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Hello1Action extends ActionSupport{
	private HttpServletRequest request;
	private HttpServletResponse response;
	private HttpSession session;
	private ServletContext application;
	public String print(){
		 request = ServletActionContext.getRequest();
		 response = ServletActionContext.getResponse();
		 application = ServletActionContext.getServletContext();
		 session = request.getSession();
		 System.out.println(request);
		 System.out.println(response);
		 System.out.println(application);
		 System.out.println(session);
		 return "success";
	}
}
