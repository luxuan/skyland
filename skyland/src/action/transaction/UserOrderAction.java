package action.transaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.CartGoods;
import jsp.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.User;
import beans.transaction.Order;
import beans.user.GoodsCart;
import config.Name;

import actions.AbstractManageAction;

public class UserOrderAction extends AbstractManageAction {

	@Override
	public ActionForward add(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		User user=(User)request.getSession().getAttribute(Name.User);
		if(user!=null){

			if(user.getDefaultAddressNum()==null){
				response.sendRedirect("usercenter.jsp?property=12");
				return null;
			}
			int userNum=user.getNum();
			int addressNum=user.getDefaultAddressNum();
			List<GoodsCart> list=(List<GoodsCart>)request.getSession().getAttribute(Name.UserCartList);
			List<Order> orderList=getOrderList(request.getSession());
			if(orderList==null){
				orderList=new ArrayList<Order>();
			}
			if(list!=null){
				Iterator<GoodsCart> iter=list.iterator();
				GoodsCart gc=null;
				while(iter.hasNext()){
					gc=iter.next();
					Order order=new Order();
					order.setUserNum(userNum);
					order.setAddressNum(addressNum);
					order.setStatus(0);
					order.setIsPay(false);
					order.setGoodsNum(gc.getGoodsNum());
					order.setGoodsCount(gc.getGoodsCount());
					
					String hql="select goods.price from Goods goods where goods.num='"+order.getGoodsNum()+"'";
					float price=(Float)Controller.get(hql);
					order.setPrice(price);
					
					if(Controller.save(order)){
						orderList.add(order);
						
						//delete GoodsCart!
						hql="delete from GoodsCart gc where gc.num='"+gc.getNum()+"'";
						if(Controller.delete(hql)){
							System.out.println("remove GoodsCart.num:"+gc.getNum());
						}
					}
				}
				HttpSession session=request.getSession();
				session.removeAttribute(Name.UserCartList);
				List<CartGoods> cartGoodsList=(List<CartGoods>)session.getAttribute(Name.Cart);
				if(cartGoodsList!=null){
					session.removeAttribute(Name.Cart);
				}
			}
		response.sendRedirect("usercenter.jsp?property=1");
			return null;
		}
		response.sendRedirect("usercenter.jsp?property=13");
		return null;
	}
	
	/*
	 * 商品数量、支付方式、留言、邮件收信人、姓名、地址、联系方式、邮编
	 */
	@Override	//ok
	public ActionForward update(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserOrderForm form=(UserOrderForm)actionForm;
		Order order=getPersistentOrder(request);
		order.setAddressNum(form.getAddressNum());
		order.setGoodsCount(form.getGoodsCount());
		order.setPayment(form.getPayment());
		order.setUserMessage(form.getUserMessage());
		
		/*
		order.setRecipientName(form.getRecipientName());
		order.setRecipientAddress(form.getRecipientAddress());
		order.setRecipientPhone(form.getRecipientPhone());
		order.setRecipientPostcode(form.getRecipientPostcode());
		*/
		Controller.update(order);//持久化对象再使用save()和update()方法无效**
		return mapping.findForward("success");
	}

	@Override	//ok
	public ActionForward setIsUsed(ActionMapping mapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Order order=getPersistentOrder(request);
		String code=request.getParameter("code");
		if("start".equals(code)){
			order.setStatus(0);	//reset;
		}else{
			order.setStatus(9);	//Cancel order;
		}
		Controller.update(order);
		return mapping.findForward("success");
	}

	@Override	//ok
	public ActionForward updateView(ActionMapping mapping,
			ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Order order=getPersistentOrder(request);
		if(order!=null){
			request.getSession().setAttribute(Name.UserOrder, order);
		}
		return mapping.findForward("success");
	}

	@Override	//ok
	public ActionForward viewList(ActionMapping mapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute(Name.User);
		if(user!=null){
			String hql="from Order order where order.userNum='"+user.getNum()+"' and order.status<'8'";//status==8 -->success!
			List<Order> list=Controller.getList(hql);
			session.setAttribute(Name.UserOrderList, list);	//jsp should remove.
		}

		return mapping.findForward("success");
	}
	
	//从session中userOrderList找出请求的持久化类<Order>
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
		List<Order> orderList=(List<Order>)session.getAttribute(Name.UserOrderList);
 		return orderList;
	}

}
