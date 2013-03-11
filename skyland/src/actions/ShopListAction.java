package actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jsp.Controller;
import config.Name;
import beans.Shop;

public class ShopListAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		/*
		String page=request.getParameter(Name.Page);
		String city=request.getParameter(Name.City);
		String sort=request.getParameter(Name.Sort);
		*/
		
		String hql="from Shop shop";
		List<Shop> list=Controller.getList(hql);
		if(list!=null){
			HttpSession session=request.getSession();
			session.setAttribute(Name.ShopList, list);
	
		}
		return mapping.findForward("success");	
	}
}
