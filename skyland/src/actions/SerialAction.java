package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;
import jsp.SerialSearch;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import beans.User;
import config.Page;
import config.Name;

public class SerialAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		SerialForm serialForm=(SerialForm)form;
		SerialSearch ser=serialForm.getSerialSearch();
		request.getSession().setAttribute(Name.SerialSearch, ser);
		return mapping.findForward("success");
	}

}
