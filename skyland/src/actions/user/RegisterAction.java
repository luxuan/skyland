package actions.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.User;
import config.Page;

public class RegisterAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		RegisterForm registerForm=(RegisterForm)form;
		User user=new User();
		user.setUsername(registerForm.getUsername());
		user.setPassword(registerForm.getPassword());
		user.setRealName(registerForm.getRealName());
		user.setPhone(registerForm.getPhone());
		user.setEmail(registerForm.getEmail());
		user.setAddress(registerForm.getAddress());
		user.setZip(registerForm.getZip());
		user.setRemark(registerForm.getRemark());
		//System.out.println("RegisterAction:"+(user.getLastLoginTime()==null));
		if(Controller.save(user)){
			if(Page.Debug)System.out.println("register success:"+registerForm.getUsername());
			return mapping.findForward("success");
		}else{
			if(Page.Debug)System.out.println("register fail:"+registerForm.getUsername());
			HttpSession session=request.getSession();
			session.setAttribute("registerFail", "");
			return mapping.findForward("fail");
		}
		
	}

}
