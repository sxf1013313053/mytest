package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.domain.User;

public class HelloAction2 extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	@Override
	public User getModel() {
		
		return user;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return null;
	}

}
