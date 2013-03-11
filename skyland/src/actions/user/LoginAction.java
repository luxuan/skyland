package actions.user;



import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.CartGoods;
import jsp.Controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.User;
import beans.user.GoodsCart;

import config.Page;
import config.Name;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		LoginForm loginForm=(LoginForm)form;
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		String hql="from User user where user.username='"+username+"' and password='"+password+"'";
		User user=Controller.get(hql);
		if(user!=null){
			HttpSession session=request.getSession();
			session.setAttribute(Name.User, user);
			session.setAttribute(Name.UserNum, user.getNum());
			saveCart(session);
			if(Page.Debug)System.out.println("login:"+username);
			return mapping.findForward("success");
		}
		if(Page.Debug)System.out.println("fail to login:"+username);
		return mapping.findForward("fail");
	}
	
	private void saveCart(HttpSession session){
		ArrayList<CartGoods> list=(ArrayList<CartGoods>)session.getAttribute(Name.Cart);
		if(list!=null){
			int userNum=(Integer)session.getAttribute(Name.UserNum);
			Iterator<CartGoods> iter=list.iterator();
			CartGoods cg=null;
			while(iter.hasNext()){
				cg=iter.next();
				
				GoodsCart goodsCart=new GoodsCart();
				goodsCart.setUserNum(userNum);
				goodsCart.setGoodsNum(cg.getNum());
				goodsCart.setGoodsCount(cg.getBuyCount());
				goodsCart.setUseable(true);
				Controller.save(goodsCart);
			}
		}
	}

}
