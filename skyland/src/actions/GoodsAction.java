package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jsp.Controller;
import jsp.GoodsVisited;
import config.Hql;
import config.Name;
import beans.Goods;
import actions.tools.Tool;

public class GoodsAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		
		String property=request.getParameter(Name.Property);
		if(property!=null&&(!"".equals(property))){
			String hql=Hql.Goods+"'"+property+"'";
			Goods goods=Controller.get(hql);

			if(goods!=null){
				GoodsVisited gs=new GoodsVisited(goods.getNum());
				
				int shopNum=goods.getShopNum();
				hql="select shop.name,shop.cityNum from Shop shop where shop.num='"+shopNum+"'";
				Object[] ss=Controller.get(hql);
				gs.setShopName(ss[0].toString());
				String cityNum=ss[1].toString();
				hql="select city.name from City city where city.num='"+cityNum+"'";
				Object cityName=Controller.get(hql);
				gs.setCity(cityName.toString());
				HttpSession session=request.getSession();
				ArrayList<GoodsVisited> list=(ArrayList<GoodsVisited>)session.getAttribute(Name.GoodsVisited);
				if(list==null){
					list=new ArrayList<GoodsVisited>();
					session.setAttribute(Name.GoodsVisited, list);
				}
				
				//<T extends Visited> called
				if(Tool.find(list,gs)==null){
					gs.setName(goods.getName());
					gs.setPrice(goods.getPrice());
					gs.setPic(goods.getPic());
					list.add(gs);
				}
				session.setAttribute(Name.Goods, goods);
			}
		}
		return mapping.findForward("success");
	}
}
