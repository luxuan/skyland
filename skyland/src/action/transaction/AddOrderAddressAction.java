package action.transaction;

import java.util.ArrayList;
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


public class AddOrderAddressAction extends DispatchAction {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		AddOrderAddressForm form=(AddOrderAddressForm)actionForm;
		int userNum=(Integer)request.getSession().getAttribute(Name.UserNum);
		OrderAddress oa=new OrderAddress();
		oa.setUserNum(userNum);
		oa.setUseable(true);
		oa.setName(form.getName());
		oa.setAddress(form.getAddress());
		oa.setPostcode(form.getPostcode());
		oa.setAreaCode(form.getAreaCode());
		oa.setTelephone(form.getTelephone());
		oa.setMobilphone(form.getMobilphone());
		if(Controller.save(oa)){
			List<OrderAddress> list=(List<OrderAddress>)request.getSession().getAttribute(Name.UserOrderAddressList);
			if(list==null)list=new ArrayList<OrderAddress>();
			list.add(oa);
			
			if(form.getIsDefault()){
				User user=(User)request.getSession().getAttribute(Name.User);
				user.setDefaultAddressNum(oa.getNum());
			}
		}
		response.sendRedirect("usercenter.jsp?property=11");
		return null;
	}


}
