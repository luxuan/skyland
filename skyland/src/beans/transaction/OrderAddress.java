package beans.transaction;

public class OrderAddress {
	private int num;
	private int userNum;
	private boolean isDefault;
	private boolean useable;
	private String name;
	private String address;	
	private String postcode;
	private String areaCode;
	private String telephone;
	private String mobilphone;

	public void setNum(int num){this.num=num;}
	public int getNum(){return this.num;}

	public void setUserNum(int userNum){this.userNum=userNum;}
	public int getUserNum(){return this.userNum;}	

	public boolean getIsDefault(){return this.isDefault;}
	public void setIsDefault(boolean isDefault){this.isDefault=isDefault;}
	
	public boolean getUseable(){return this.useable;}
	public void setUseable(boolean useable){this.useable=useable;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return this.name;}
	
	public void setAddress(String address){this.address=address;}
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
