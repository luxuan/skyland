package actions.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.upload.FormFile;

import web.filter.ConvertEncoding;

import beans.Shop;
import beans.admin.Admin;


public class UploadActionForm extends ActionForm{

	private FormFile pic;
	private FormFile license;
	private Shop shop=new Shop();
	private Admin admin=new Admin();
	
	
	public void setRealName(String realName){this.admin.setRealName(ConvertEncoding.toUTF(realName));}
	public String getRealName(){return this.admin.getRealName();}
	
	public void setNum(int num){this.shop.setNum(num);}
	public int getNum(){return this.shop.getNum();}
	
	public void setID(String ID){this.admin.setID(ID);}
	public String getID(){return this.admin.getID();}
	
	public void setAdminName(String adminName){this.admin.setAdminName(ConvertEncoding.toUTF(adminName));}
	public String getAdminName(){return this.admin.getAdminName();}
	
	public void setPassword(String password){this.admin.setPassword(password);}
	public String getPassword(){return this.admin.getPassword();}
	
	public void setCityNum(int cityNum){this.shop.setCityNum(cityNum);}
	public int getCityNum(){return this.shop.getCityNum();}
	
	public void setShopName(String shopName){this.shop.setName(ConvertEncoding.toUTF(shopName));}
	public String getShopName(){return this.shop.getName();}
	
	public void setAddress(String address){this.shop.setAddress(ConvertEncoding.toUTF(address));}
	public String getAddress(){return this.shop.getAddress();}
	
	public void setPhone(String phone){this.shop.setPhone(phone);}
	public String getPhone(){return this.shop.getPhone();}	
	
	public void setQq(String qq){this.shop.setQq(qq);}
	public String getQq(){return this.shop.getQq();}	
	
	public void setFax(String fax){this.shop.setFax(fax);}
	public String getFax(){return this.shop.getFax();}	
	
	public void setEmail(String email){this.shop.setEmail(email);}
	public String getEmail(){return this.shop.getEmail();}	
	
	public void setDetail(String detail){this.shop.setDetail(ConvertEncoding.toUTF(detail));}
	public String getDetail(){return this.shop.getDetail();}
	
	public void setPic(FormFile pic){this.pic=pic;}
	public FormFile getPic(){return this.pic;}
	
	public void setLicense(FormFile license){this.license=license;}
	public FormFile getLicense(){return this.license;}
	
	public Shop getShop(){return this.shop;}
	public Admin getAdmin(){return this.admin;}

	public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
	    ActionErrors errors = new ActionErrors();
	    return errors;
	}
	public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
		
	}

}
