package actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;
import jsp.CartGoods;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.User;
import beans.user.GoodsCart;

import actions.tools.Tool;
import config.Name;

public class CartAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		
		/* Differece from GoodsAction
		 * 1.Get session:Name.Cart;
		 * 2.needn't save this goods to another session;
		 * 3.when find the same object, increase the buyCount(in CartGoods ); 
		 */
		
		String property=request.getParameter(Name.Property);
		if(property!=null&&(!"".equals(property))){

			//save session
			String hql="select goods.num,goods.shopNum,goods.name,goods.price,goods.pic from Goods goods where goods.num='"+property+"'";
			Object objs[]=Controller.get(hql);

			if(objs!=null){
				CartGoods gs=new CartGoods((Integer)objs[0]);
				
				int shopNum=(Integer)objs[1];
				hql="select shop.name,shop.cityNum from Shop shop where shop.num='"+shopNum+"'";
				Object[] ss=Controller.get(hql);
				gs.setShopName(ss[0].toString());
				String cityNum=ss[1].toString();
				hql="select city.name from City city where city.num='"+cityNum+"'";
				Object cityName=Controller.get(hql);
				gs.setCity(cityName.toString());
				HttpSession session=request.getSession();
				ArrayList<CartGoods> list=(ArrayList<CartGoods>)session.getAttribute(Name.Cart);
				Integer cartCount=(Integer)session.getAttribute(Name.CartCount);
				Float cartTotalPrice=(Float)session.getAttribute(Name.CartTotalPrice);
				CartGoods existGoods=null;
				if(list==null){
					list=new ArrayList<CartGoods>();
					cartCount=0;
					cartTotalPrice=new Float(0);
					session.setAttribute(Name.Cart, list);
					//session.setAttribute(Name.CartCount, cartCount);
					//session.setAttribute(Name.CartTotalPrice, cartTotalPrice);
				}else{
					existGoods=Tool.find(list,gs);
				}
				//list==null||tCg==null
				//<T extends Visited> called
				if(existGoods==null){
					gs.setName((String)objs[2]);
					gs.setPrice((Float)objs[3]);
					gs.setPic((String)objs[4]);
					list.add(gs);
				}else{
					existGoods.increase(1);
					gs=existGoods;
				}
				cartCount++;
				cartTotalPrice+=gs.getPrice();
				session.setAttribute(Name.CartCount, cartCount);
				session.setAttribute(Name.CartTotalPrice, cartTotalPrice);
				
				//save to database
				Integer userNum=(Integer)session.getAttribute(Name.UserNum);
				if(userNum!=null){
					GoodsCart gc=new GoodsCart();
					gc.setUserNum(userNum);
					gc.setGoodsCount(cartCount);
					int goodsNum=Integer.parseInt(property);
					gc.setGoodsNum(goodsNum);
					gc.setUseable(true);
					Controller.save(gc);
				}

			}
		}
		response.sendRedirect(request.getHeader("Referer"));
		return null;
	}
}