package fun.usercenter;

import java.util.List;

import javax.servlet.http.HttpSession;

import jsp.Controller;
import beans.User;
import beans.transaction.Order;
import config.Name;

public class UserManager {
	public static void add(HttpSession session){
		User user=(User)session.getAttribute(Name.User);
		if(user!=null){
			String hql="from Order order where order.userNum='"+user.getNum()+"' and order.status<'8'";//status==8 -->success!
			List<Order> list=Controller.getList(hql);
			if(list.size()>0){
				session.setAttribute(Name.UserOrderList, list);	//jsp should remove.
			}
		}
	}
	
	public static void update(HttpSession session){
		User user=(User)session.getAttribute(Name.User);
		if(user!=null){
			String hql="from Order order where order.userNum='"+user.getNum()+"' and order.status<'8'";//status==8 -->success!
			List<Order> list=Controller.getList(hql);
			if(list.size()>0){
				session.setAttribute(Name.UserOrderList, list);	//jsp should remove.
			}
		}
	}
	
}
