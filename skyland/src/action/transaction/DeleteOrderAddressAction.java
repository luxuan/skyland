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

import beans.transaction.OrderAddress;


public class DeleteOrderAddressAction extends DispatchAction {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		int orderNum=Integer.parseInt(request.getParameter(Name.Property));
		List<OrderAddress> list=(List<OrderAddress>)request.getSession().getAttribute(Name.UserOrderAddressList);
		System.out.println("DeleteCart.list==null:"+(list==null));
		if(list!=null){
			Iterator<OrderAddress> iter=list.iterator();
			OrderAddress oa=null;
			while(iter.hasNext()){
				oa=iter.next();
				if(oa.getNum()==orderNum){
					oa.setUseable(false);
					Controller.update(oa);//返回集合中的对象是不是持久化的对象？？
					iter.remove();
					break;
				}
			}
		}
		response.sendRedirect("usercenter.jsp?property=11");

		return null;
	}


}
