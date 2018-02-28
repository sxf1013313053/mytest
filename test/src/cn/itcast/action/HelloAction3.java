package cn.itcast.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.domain.User;

public class HelloAction3 extends ActionSupport {
	private List<User> list;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public String execute() throws Exception {
		for (User user : list) {
			System.out.println(user);
		}
		
		return null;
	}

}
