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

public class UpdateAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		UpdateForm registerForm=(UpdateForm)form;
		User user=(User)request.getSession().getAttribute(Name.User);
		if(user!=null){
			user.setUsername(registerForm.getUsername());
			user.setRealName(registerForm.getRealName());
			user.setPhone(registerForm.getPhone());
			user.setEmail(registerForm.getEmail());
			user.setAddress(registerForm.getAddress());
			user.setZip(registerForm.getZip());
			user.setRemark(registerForm.getRemark());

			if(Controller.update(user)){
				System.out.println("update user success:"+user.getUsername());
			}
		}
		response.sendRedirect("usercenter.jsp?property=10");
		return null;
	}

}
