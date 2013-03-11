package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;
import jsp.ShopVisited;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import config.Hql;
import config.Name;
import actions.tools.SaveSession;
import actions.tools.Tool;
import beans.Shop;

public class ShopAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		
		String property=request.getParameter(Name.Property);
		if(property!=null&&(!"".equals(property))){
			String hql=Hql.Shop+"'"+property+"'";
			Shop shop=Controller.get(hql);
			
			if(shop!=null){
				System.out.println("ShopAction.shop!=null: ");
				HttpSession session=request.getSession();
				ArrayList<ShopVisited> list=(ArrayList<ShopVisited>)session.getAttribute(Name.ShopVisited);
				if(list==null){
					list=new ArrayList<ShopVisited>();
					session.setAttribute(Name.ShopVisited, list);
					System.out.println("new "+Name.ShopVisited);
				}
				
				//<T extends Visited> called
				ShopVisited sv=new ShopVisited(shop.getNum());
				if(Tool.find(list,sv)==null){
					sv.setName(shop.getName());
					sv.setPic(shop.getPic());
					sv.setAddress(shop.getAddress());
					sv.setPhone(shop.getPhone());
					list.add(sv);
				}
				
				session.setAttribute(Name.Shop, shop);
				SaveSession.bargain(session, Hql.ShopBargainCondition, Name.BargainList);
				SaveSession.goodsSearch(session, Hql.ShopSearchCondition, Name.SearchList);
			}
		}
		return mapping.findForward("success");
	}
}
