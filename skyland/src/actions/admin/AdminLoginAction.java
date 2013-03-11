package actions.admin;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.admin.Admin;

import config.Page;
import config.Name;

public class AdminLoginAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		AdminLoginForm loginForm=(AdminLoginForm)form;
		Admin admin=loginForm.getAdmin();

		//update the manager login information
		Date now=new Date();
		admin.setLastIp(request.getRemoteAddr());
		System.out.println("login.time:"+admin.getLastLoginTime());
		System.out.println("register.time:"+admin.getRegisterTime());
		admin.setLastLoginTime(now);
		admin.setRegisterTime(admin.getRegisterTime());
		
		Controller.update(admin);
		
		HttpSession session=request.getSession();
		session.setAttribute(Name.Admin, admin);
		if(Page.Debug)System.out.println("login admin:"+admin.getAdminName());
		return mapping.findForward("success");
	}

}
