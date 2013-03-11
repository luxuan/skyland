package fun.usercenter;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import jsp.Controller;
import beans.User;
import beans.transaction.Order;
import beans.transaction.OrderAddress;
import beans.user.GoodsCart;
import config.Name;

public class InitUsercenterView {
	public static void viewOrderList(HttpSession session){
		if(session.getAttribute(Name.UserOrderList)!=null)return;
		User user=(User)session.getAttribute(Name.User);
		if(user!=null){
			String hql="from Order order where order.userNum='"+user.getNum()+"' and order.status<'8'";//status==8 -->success!
			List<Order> list=Controller.getList(hql);
			if(list.size()>0){
				session.setAttribute(Name.UserOrderList, list);	//jsp should remove.
			}
		}
	}
	
	public static void viewCartList(HttpSession session){
		if(session.getAttribute(Name.UserCartList)!=null)return;
		User user=(User)session.getAttribute(Name.User);
		if(user!=null){
			String hql="from GoodsCart cart where cart.userNum='"+user.getNum()+"' and cart.useable='true'";
			List<GoodsCart> list=Controller.getList(hql);
			if(list.size()>0){
				session.setAttribute(Name.UserCartList, list);	
			}
		}
	}
	
	public static void viewOrderAddressList(HttpSession session){
		if(session.getAttribute(Name.UserOrderAddressList)!=null)return;
		User user=(User)session.getAttribute(Name.User);
		if(user!=null){
			String hql="from OrderAddress oa where oa.userNum='"+user.getNum()+"' and oa.useable='true'";
			List<OrderAddress> list=Controller.getList(hql);
			if(list.size()>0){
				Iterator<OrderAddress> iter=list.iterator();
				OrderAddress oa=null;
				while(iter.hasNext()){
					oa=iter.next();
					if((user.getDefaultAddressNum()!=null)&&(oa.getNum()==user.getDefaultAddressNum())){oa.setIsDefault(true);}
					else oa.setIsDefault(false);
				}
				session.setAttribute(Name.UserOrderAddressList, list);	
			}
			
		}
	}	
	
}
