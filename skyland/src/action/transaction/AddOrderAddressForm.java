package action.transaction;

import org.apache.struts.action.ActionForm;

import web.filter.ConvertEncoding;

//UserOrderForm extends Order,ActionForm ?
public class AddOrderAddressForm extends ActionForm {
	private boolean isDefault;
	private String name;
	private String address;	
	private String postcode;
	private String areaCode;
	private String telephone;
	private String mobilphone;

	public boolean getIsDefault(){return this.isDefault;}
	public void setIsDefault(boolean isDefault){this.isDefault=isDefault;}
	
	public void setName(String name){this.name=ConvertEncoding.toUTF(name);}
	public String getName(){return this.name;}
	
	public void setAddress(String address){this.address=ConvertEncoding.toUTF(address);}
	public String getAddress(){return this.address;}
	
	public void setPostcode(String postcode){this.postcode=postcode;}
	public String getPostcode(){return this.postcode;}
	
	public void setAreaCode(String areaCode){this.areaCode=areaCode;}
	public String getAreaCode(){return this.areaCode;}
	
	public void setTelephone(String telephone){this.telephone=telephone;}
	public String getTelephone(){return this.telephone;}
	
	public void setMobilphone(String mobilphone){this.mobilphone=mobilphone;}
	public String getMobilphone(){return this.mobilphone;}


}
