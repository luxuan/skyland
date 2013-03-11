package actions.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.Controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.User;
import config.Name;
import config.Page;

public class ChangePasswordAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		ChangePasswordForm registerForm=(ChangePasswordForm)form;
		User user=(User)request.getSession().getAttribute(Name.User);
		user.setPassword(registerForm.getPasswordNew());

		//System.out.println("RegisterAction:"+(user.getLastLoginTime()==null));
		if(Controller.update(user)){
			if(Page.Debug)System.out.println("change user password success:"+user.getUsername());
			
		}else{
			if(Page.Debug)System.out.println("change user password fail:"+user.getUsername());
		}
		response.sendRedirect("usercenter.jsp?property=9");
		return null;
		
	}

}
