package actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import beans.User;
import beans.transaction.Order;

import config.Name;
import fun.usercenter.InitUsercenterView;

public class UserCenterAction extends Action {
	private String urls[]=null;
	public UserCenterAction(){
		urls=new String[14];
		urls[0]="usercenter_welcome.jsp";	//after login and the url wrong!
		
		urls[1]="usercenter_order.jsp";
		urls[2]="usercenter_transaction.jsp";
		urls[3]="usercenter_comment.jsp";
		urls[4]="usercenter_advisory.jsp";
		urls[5]="usercenter_complain.jsp";
		urls[6]="usercenter_message.jsp";
		urls[7]="usercenter_shop_collection.jsp";
		urls[8]="usercenter_goods_collection.jsp";
		urls[9]="usercenter_password.jsp";
		urls[10]="usercenter_info.jsp";
		urls[11]="usercenter_pay.jsp";//not in index
		urls[12]="usercenter_error.jsp";
		
		urls[13]="usercenter_login.jsp";
		
		//remove order_list.jsp
		
	}
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		int index;
		if(session.getAttribute(Name.User)!=null){
			String property=request.getParameter(Name.Property);//user_center.jsp -the last
			try{
				index=Integer.parseInt(property);
				if(index<0||index>12)index=0;
			}catch(NumberFormatException ex){
				index=0;
			}
			
			switch(index){
				case 1:
					InitUsercenterView.viewOrderList(session);
					break;
				case 2:
					break;
				case 3:
					break;					
				case 4:
					break;					
				case 5:
					break;					
				case 6:
					break;					
				case 7:
					break;					
				case 8:
					break;					
				case 9:
					break;					
				case 10:
					break;					
				case 11:
					InitUsercenterView.viewCartList(session);
					InitUsercenterView.viewOrderAddressList(session);
					break;					
			}
		}else index=urls.length-1;
		
		String url="blocks/"+urls[index];
		request.getSession().setAttribute(Name.UserCenterURL, url);
		return mapping.findForward("success");
	}


}
