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

import beans.User;
import beans.transaction.OrderAddress;

public class SetDefaultOrderAddressAction extends DispatchAction {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		int addressNum=Integer.parseInt(request.getParameter(Name.Property));
		User user=(User)request.getSession().getAttribute(Name.User);
		user.setDefaultAddressNum(addressNum);
		Controller.update(user);
		
		List<OrderAddress> list=(List<OrderAddress>)request.getSession().getAttribute(Name.UserOrderAddressList);
		Iterator<OrderAddress> iter=list.iterator();
		OrderAddress oa=null;
		while(iter.hasNext()){
			oa=iter.next();
			if(oa.getNum()==addressNum){oa.setIsDefault(true);}
			else oa.setIsDefault(false);
		}
		
		response.sendRedirect("usercenter.jsp?property=11");

		return null;
	}


}
