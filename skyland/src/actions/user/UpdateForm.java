package actions.user;

import javax.servlet.http.HttpServletRequest;

import jsp.Controller;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import web.filter.ConvertEncoding;

import beans.User;

public class UpdateForm extends ActionForm{
	private String username;
	private String realName;
	private String phone;
	private String email;
	private String address;
	private String zip;
	private String remark;
	
	public void setUsername(String username){this.username=username;}
	public String getUsername(){return this.username;}
	
	public void setRealName(String realName){this.realName=ConvertEncoding.toUTF(realName);}
	public String getRealName(){return this.realName;}
	
	public void setPhone(String phone){this.phone=phone;}
	public String getPhone(){return this.phone;}
	
	public void setEmail(String email){this.email=email;}
	public String getEmail(){return this.email;}
	
	public void setAddress(String address){this.address=ConvertEncoding.toUTF(address);}
	public String getAddress(){return this.address;}
	
	public void setZip(String zip){this.zip=zip;}
	public String getZip(){return this.zip;}
	
	public void setRemark(String remark){this.remark=ConvertEncoding.toUTF(remark);}
	public String getRemark(){return this.remark;}	
	
	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
	    ActionErrors errors = new ActionErrors();
	    
	    if(username.length()<4) {
	    	errors.add("username",new ActionMessage("error.register.usename"));
	    }

	    if((!phone.equals(""))&&phone.length()<4){//
	    	errors.add("phone",new ActionMessage("error.register.phone"));
	    }
	    
	    if((!email.equals(""))&&(email.indexOf('@')<0||email.indexOf('.')<0)){
	    	errors.add("email",new ActionMessage("error.register.email"));
	    }
	    //String [] names={"username","password","phone","email","Postcode","address","remark"};
	    String [] names={"用户名","真实姓名","电话","电子邮件","邮编","地址","备注"};
	    String [] infos={username,realName,phone,email,zip,address,remark};
	    for(int i=0;i<names.length;i++){
	    	if(infos!=null&&(!isIllegal(infos[i]))){
	    		errors.add("all",new ActionMessage("error.register.all",names[i]));
	    	}
	    }
    
	    return errors;
	}
	public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
		
	}
	
	private boolean isIllegal(String str){//all the message will be check;
		return true;
	}
}
