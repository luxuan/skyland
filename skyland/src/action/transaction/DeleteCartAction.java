package action.transaction;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import config.Name;


import beans.transaction.Order;
import beans.transaction.OrderAddress;
import beans.user.GoodsCart;


public class DeleteCartAction extends DispatchAction {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		int orderNum=Integer.parseInt(request.getParameter(Name.Property));
		List<GoodsCart> list=(List<GoodsCart>)request.getSession().getAttribute(Name.UserCartList);
		System.out.println("DeleteCart.list==null:"+(list==null));
		if(list!=null){
			Iterator<GoodsCart> iter=list.iterator();
			GoodsCart cart=null;
			while(iter.hasNext()){
				cart=iter.next();
				if(cart.getNum()==orderNum){
					cart.setUseable(false);
					Controller.update(cart);//返回集合中的对象是不是持久化的对象？？
					iter.remove();
					break;
				}
			}
		}
		response.sendRedirect("usercenter.jsp?property=11");

		return null;
	}


}
