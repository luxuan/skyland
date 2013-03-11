package actions.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jsp.Controller;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;


import beans.admin.Admin;
import config.Name;

public class AdminUpdateAction extends DispatchAction {
	public ActionForward updateInfo(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		DynaActionForm form=(DynaActionForm)actionForm;
		HttpSession session=request.getSession();
		Admin admin=(Admin)session.getAttribute(Name.Admin);
		admin.setAdminName(form.getString("adminName"));
		
		String realName=form.getString("realName");
		realName=new String(realName.getBytes("iso-8859-1"),"utf-8");
		admin.setRealName(realName);
		
		admin.setEmail(form.getString("email"));
		admin.setMobil(form.getString("mobil"));
		admin.setHomePhone(form.getString("homePhone"));
		admin.setOfficePhone(form.getString("officePhone"));
		
		String remark=form.getString("remark");
		remark=new String(remark.getBytes("iso-8859-1"),"utf-8");
		admin.setRemark(remark);
		
		Controller.update(admin);
		System.out.println("update admin info");
		
		return mapping.findForward("updateInfo");
	}
	
	public ActionForward changePassword(ActionMapping mapping,ActionForm actionForm,
			HttpServletRequest request,HttpServletResponse response)throws Exception{ 
		DynaActionForm form=(DynaActionForm)actionForm;
		HttpSession session=request.getSession();
		Admin admin=(Admin)session.getAttribute(Name.Admin);
		int num=admin.getNum();
		String password=form.getString("password");
		String hql="select admin.num from Admin admin where admin.num='"+num+"' and admin.password='"+password+"'";
		if(Controller.get(hql)!=null){
			admin.setPassword(form.getString("newPassword"));
			Controller.update(admin);
			System.out.println("ChangePassword:update admin password.");
		}else{
			System.out.println("ChangePassword:password is wrong!");
		}
		
		return mapping.findForward("changePassword");
	}

}
