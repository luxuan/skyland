package actions.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{
	String username;
	String password;
	
	public void setUsername(String username){this.username=username;}
	public String getUsername(){return this.username;}
	
	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}
	
	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
	    ActionErrors errors = new ActionErrors();

	    if((username==null)||(username.length()<3)) {
	    	errors.add("name",new ActionMessage("error.username.required",username));
	    }

	    if((password==null)||(password.length()<3)) {
	    	errors.add("pwd",new ActionMessage("error.password.required",password));
	    }
	    return errors;
	}
	public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
		
	}
}
