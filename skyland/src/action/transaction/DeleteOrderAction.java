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



public class DeleteOrderAction extends DispatchAction {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)throws Exception {
		String property=request.getParameter(Name.Property);
		if(property!=null){
			int orderNum=Integer.parseInt(property);
			List<Order> list=(List<Order>)request.getSession().getAttribute(Name.UserOrderList);
			if(list!=null){
				Iterator<Order> iter=list.iterator();
				Order order=null;
				while(iter.hasNext()){
					order=iter.next();
					if(order.getNum()==orderNum){
						order.setStatus(9);//9==已取消
						Controller.update(order);//needed
						iter.remove();
						//list.remove(order);
						break;
					}
				}
			}
		}
		response.sendRedirect("usercenter.jsp?property=1");

		return null;
	}


}
