package actions.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import config.Page;
import config.Name;

public class LoginoutAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		HttpSession session=request.getSession();
		if(Page.Debug)System.out.println("loginout:"+session.getAttribute("user"));
		session.removeAttribute(Name.User);
		return mapping.findForward("success");
	}
}
