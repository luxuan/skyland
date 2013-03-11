package actions.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import beans.User;

import config.Name;

public class ChangePasswordForm extends ActionForm{
	private int num;
	private String password;
	private String passwordNew;
	private String passwordAgain;

	
	public int getNum(){return this.num;}
	public void setNum(int num){this.num=num;}

	public void setPassword(String password){this.password=password;}
	public String getPassword(){return this.password;}

	public void setPasswordNew(String passwordNew){this.passwordNew=passwordNew;}
	public String getPasswordNew(){return this.passwordNew;}
	
	public void setPasswordAgain(String passwordAgain){this.passwordAgain=passwordAgain;}
	public String getPasswordAgain(){return this.passwordAgain;}
	
	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
	    ActionErrors errors = new ActionErrors();
	    User user=(User)httpServletRequest.getSession().getAttribute(Name.User);
	    if(user==null){errors.add("loginRemind",new ActionMessage("user.login.remind"));}
	    else if(user.getPassword().equals(password)){
		    if(passwordNew.length()<6) {
		    	errors.add("passwordNew",new ActionMessage("error.register.password"));
		    }else if(!passwordNew.equals(passwordAgain)){
		    	errors.add("passwordAgain",new ActionMessage("error.register.passwordAgain"));
		    }
	    }else{
	    	errors.add("password",new ActionMessage("user.password.error"));
	    }

	    
	    return errors;
	}
	public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
		
	}

}
