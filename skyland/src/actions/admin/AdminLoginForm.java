package actions.admin;

import javax.servlet.http.HttpServletRequest;

import jsp.Controller;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import beans.admin.Admin;

public class AdminLoginForm extends ActionForm{
	private String adminName;
	private String password;
	private Admin admin;
	
	public void setAdminName(String adminName){this.adminName=adminName;}
	public String getAdminName(){return this.adminName;}
	
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}
	
	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
	    ActionErrors errors = new ActionErrors();

	    if((adminName==null)||(adminName.length()<3)) {
	    	errors.add("name",new ActionMessage("admin.login.required.adminName"));
	    }

	    if((password==null)||(password.length()<3)) {
	    	errors.add("pwd",new ActionMessage("admin.login.required.password"));
	    }
	    
	    //select database ;
	    if(errors.size()==0){
			String hql="from Admin admin where admin.adminName='"+adminName+"' and password='"+password+"'";
			admin=Controller.get(hql);
			if(admin==null)errors.add("fail",new ActionMessage("admin.login.fail"));
	    }
		
	    return errors;
	}
	public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
		
	}
	public Admin getAdmin(){return this.admin;}
}
