package actions.admin;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import config.Hql;
import config.Name;

import beans.User;

public class UserManageAction extends DispatchAction {
	
	public ActionForward init(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		HttpSession session=request.getSession();
		if(session.getAttribute(Name.UserList)==null){
			List<User> list=Controller.getList(Hql.ManageUser);
			session.setAttribute(Name.UserList,list);
		}
		return mapping.findForward("success");
	}
	public ActionForward change(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		HttpSession session=request.getSession();
		List<User> list=(List<User>)session.getAttribute(Name.UserList);
		if(list!=null){
			int num=Integer.parseInt(request.getParameter(Name.Property));
			User user=findUser(num,list);
			int code=Integer.parseInt(request.getParameter("code"));
			switch(code){
			case 1:
				user.setUseable(false);
				break;
			case 2:
				user.setUseable(true);
				break;
			case 3:
				user.setSpeakable(false);
				break;
			case 4:
				user.setSpeakable(true);
				break;
			}
			Controller.update(user);
		}
		return mapping.findForward("success");
	}
	
	private User findUser(int num,List<User> list){
		Iterator<User> iter=list.iterator();
		User rUser=null;
		while(iter.hasNext()){
			rUser=iter.next();
			if(rUser.getNum()==num){return rUser;}
		}
		return null;
	}
}
