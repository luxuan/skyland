package action.transaction;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

import beans.admin.Admin;
import beans.transaction.Order;
import config.Name;

public class AdminOrderAction extends DispatchAction {


	public ActionForward setStatus(ActionMapping mapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Order order=getPersistentOrder(request);
		int status=order.getStatus();
		if(status==0||status==1||status==4){
			order.setStatus(++status);
		}
		return mapping.findForward("success");
	}

	public ActionForward message(ActionMapping mapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DynaActionForm form=(DynaActionForm)actionForm;
		Order order=getPersistentOrder(request);
		order.setShopMessage(form.getString("message"));
		
		//update
		
		return mapping.findForward("success");
	}

	public ActionForward viewList(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session=request.getSession();
		Admin admin=(Admin)session.getAttribute(Name.Admin);
		if(admin!=null){
			String hql="from Order order where order.shopNum='"+admin.getShopNum()+"' and order.status<'8'";
			List<Order> list=Controller.getList(hql);
			session.setAttribute(Name.AdminOrderList, list);//jsp should remove
			
		}
		return mapping.findForward("success");
	}
	
	private Order getPersistentOrder(HttpServletRequest request){
		int num=Integer.parseInt(request.getParameter(Name.Property));//order-key
		HttpSession session=request.getSession();
		List<Order> orderList=getOrderList(session);
		Iterator<Order> iter=orderList.iterator();
		Order order=null;
		while(iter.hasNext()){
			order=iter.next();
			if(order.getNum()==num){return order;}
		}
		return null;
	}
	private List<Order> getOrderList(HttpSession session){
		List<Order> orderList=(List<Order>)session.getAttribute(Name.AdminOrderList);
		return orderList;
	}
}
